# Relatório técnico — LUMI 3.9

## 1. Identificação do artefato

A análise foi realizada sobre o arquivo local `LUMI3.9.apk`. O pacote é um arquivo ZIP APK com 1.717 entradas e tamanho de 28.112.553 bytes. O hash SHA-256 é `79f52983091a2601311a69c9c1b2f45ec21cffc0d5bbdfc3c7ba2bdf83aeb918`; esse valor também está em [`metadata/original-apk-sha256.txt`](metadata/original-apk-sha256.txt).

| Propriedade | Valor observado |
|---|---|
| `package` | `com.lumi.ar` |
| `versionName` | `3.9` |
| `versionCode` | `1` |
| `minSdkVersion` | `21` |
| `targetSdkVersion` | `36` |
| `compileSdkVersion` | `31 / Android 12` |
| Activity launcher | `com.andyhax.MainActivity` |
| Application class | `com.flextv.livestore.apps.LTVApp` |
| Orientação declarada | Paisagem nas activities principais |
| `usesCleartextTraffic` | `true` |
| Backup | `allowBackup=true` |

A assinatura v1 identifica um certificado autoassinado com sujeito e emissor `ATV REBRANDS APKS`, localidade São Paulo, validade de 31 de dezembro de 2024 a 31 de dezembro de 2123 e chave RSA de 2048 bits. Os detalhes reproduzidos acima foram obtidos do certificado incluído no próprio APK.

## 2. Componentes e arquitetura observada

O código próprio está concentrado principalmente em `com.flextv.livestore`, `com.andyhax` e `amimo.dcc`. O primeiro grupo implementa a aplicação de conteúdo e reprodução; o segundo contém wrappers de WebView, identificação de dispositivo, DNS e VPN; o terceiro inicializa a biblioteca nativa `hax`.

| Área | Evidência no material decompilado | Interpretação estática |
|---|---|---|
| Inicialização | `com/flextv/livestore/apps/LTVApp.java` | Inicializa listas, define estado global, configura a instância `Application` e chama rotina de rede/checagem. |
| Navegação | `activities/*Activity.java` e `dlgfragment/*` | Fluxos para live, VOD, séries, temporadas, busca, configurações, grupos e playlists. |
| Backend | `remote/APIService.java` e `remote/RetroClass.java` | Cliente Retrofit com endpoints IPTV e chamadas por URL para integrações auxiliares. |
| Dados locais | `helper/PreferenceHelper.java` e `helper/RealmController.java` | SharedPreferences e Realm para credenciais, configurações, categorias e histórico. |
| Reprodução | `MoviePlayerActivity`, `SeriesPlayerActivity`, ExoPlayer e MediaPlayer | Reprodução interna e seleção de players externos. |
| Nativo | `amimo/dcc/DccApplication.java`, `com/andyhax/*`, `libhax.so` | JNI para inicialização, transformação de dados, MAC, DNS e VPN. |
| Mídia e imagens | `libffmpegJNI.so`, Glide, GIF drawable | Suporte a mídia, imagens e animações. |

## 3. Fluxo de inicialização

O bloco estático de `LTVApp` chama `amimo.dcc.DccApplication.initDcc()`. Essa classe carrega `libhax.so` no bloco estático e disponibiliza o método JNI `initDcc()`. No `onCreate()`, `LTVApp` armazena a instância global e chama `AsyncNetwork.setNonBlockingExecutors()`.

A classe `Constants` reconstrói algumas URLs e parâmetros a partir de dados hexadecimais e da classe `EnigmaUtils`. A classe `AsyncNetwork.AnonymousClass2` usa uma transformação baseada em `Cipher`, chave e vetor de inicialização obtidos por outra classe ofuscada. A rotina `Constants.second_url_id()` compara o valor decodificado com uma lista de identificadores e chama `System.exit(0)` quando não encontra correspondência. Esse comportamento foi inferido estaticamente; não foi executado o APK nem feita conexão com os endpoints.

`LTVApp.versionCheck()` aciona `getlnstance()`, que monta duas URLs combinando o domínio-base ofuscado com os sufixos `24db3ca96568a04898ad5c708d275a88` e `a9ee01e1f5533435845e3c3f2104e852`, então inicia `DownloadImageTask`. O decompilador não recuperou os valores finais desses sufixos porque parte da transformação está em código nativo/ofuscado.

## 4. Rede e protocolo

`APIService` declara chamadas GET para o padrão `player_api.php` e para `xmltv.php`. A autenticação e a maior parte das consultas enviam `username` e `password` como parâmetros de query. As operações observadas incluem autenticação, categorias e streams ao vivo, categorias e itens VOD, categorias e séries, informações de filme/série, EPG curto/completo e chamadas de dados auxiliares por URL absoluta.

| Rota declarada | Parâmetros relevantes | Finalidade inferida |
|---|---|---|
| `/player_api.php?` | `username`, `password` | Autenticação e obtenção da resposta da conta. |
| `/player_api.php?action=get_live_categories` | `username`, `password` | Categorias de canais ao vivo. |
| `/player_api.php?action=get_live_streams` | `username`, `password` | Lista de streams ao vivo. |
| `/player_api.php?action=get_vod_categories` | `username`, `password` | Categorias de filmes/VOD. |
| `/player_api.php?action=get_vod_streams` | `username`, `password` | Lista de filmes/VOD. |
| `/player_api.php?action=get_series_categories` | `username`, `password` | Categorias de séries. |
| `/player_api.php?action=get_series` | `username`, `password` | Lista de séries. |
| `/player_api.php?action=get_vod_info` | `username`, `password`, `vod_id` | Detalhes de um item VOD. |
| `/player_api.php?action=get_series_info` | `username`, `password`, `series_id` | Detalhes de uma série. |
| `/player_api.php?action=get_short_epg` | `username`, `password`, `stream_id` | EPG resumido de um canal. |
| `/player_api.php?action=get_simple_data_table` | `username`, `password`, `stream_id` | EPG completo/tabela. |
| `/xmltv.php` | `username`, `password` | Download de XMLTV. |

`RetroClass` aceita uma `baseUrl` em tempo de execução, cria um cliente OkHttp com timeouts de conexão, leitura e escrita de 60 segundos, adiciona `HttpLoggingInterceptor` e registra conversores Scalars e Gson. A configuração do manifesto define `android:usesCleartextTraffic="true"`, portanto o aplicativo não restringe tráfego HTTP em texto claro a partir desse atributo.

O endpoint textual explícito localizado em `Constants.java` é `https://iboproapp.com/manage-playlists/login/`. Também existem links para instalação de players externos e URLs HTTP para trailers do YouTube. O servidor IPTV principal não aparece como texto claro nos fontes; o APK usa valores ofuscados e URLs fornecidas pelo usuário/playlist.

## 5. Dados persistidos e privacidade

`PreferenceHelper` usa o arquivo de preferências `PREF` e define chaves como `server_url`, `user_name`, `password`, `mac_address`, `device_key`, `login_models`, `user_id`, `APP_INFO_MODEL`, `parent_control`, estados de playlist, categorias ocultas, histórico e posições de reprodução. Esses valores devem ser considerados potencialmente sensíveis quando extraídos de um dispositivo ou de uma sessão real.

| Dado | Chave observada | Risco de exposição |
|---|---|---|
| URL do servidor | `server_url` | Pode revelar provedor ou infraestrutura privada. |
| Usuário | `user_name` | Identificador de conta. |
| Senha | `password` | Credencial de autenticação. |
| MAC | `mac_address` | Identificador de dispositivo/assinatura. |
| Chave do dispositivo | `device_key` | Pode participar de ativação ou autorização. |
| Modelo de login | `login_models` | Pode conter credenciais e metadados de conta. |
| Histórico/estado | `*_resume_model`, favoritos e categorias | Pode revelar hábitos e preferências do usuário. |

O repositório contém apenas o resultado estático do APK fornecido. Não foram incluídos dumps de `SharedPreferences`, bancos Realm, logs de execução, tokens de sessão ou arquivos gerados por uma instalação.

## 6. Bibliotecas nativas

Foram encontrados binários ELF para `arm64-v8a`, `armeabi-v7a` e `x86_64`. Os arquivos estão stripped, portanto a análise de símbolos exportados é limitada. `libhax.so` é referenciada pelo wrapper `DccApplication`; `libffmpegJNI.so` está associada ao processamento de mídia; `librealm-jni.so` acompanha o armazenamento Realm; e `libpl_droidsonroids_gif.so` acompanha o suporte a GIF.

Os wrappers Java expõem métodos nativos para `FormatMAC`, `PopulateDNS`, `downloadContent`, `PopulateVPN`, `GetUsername`, `GetPassword`, `Security.decrypt`, `Security.getJsonData` e rotinas de validação. Como esses métodos não possuem implementação Java, não é possível afirmar, somente pelo decompilado Java, quais dados finais são produzidos em todos os caminhos.

## 7. Sanitização e limitações

A chave literal presente em `com.flextv.livestore.apps.Constants` foi substituída na cópia pública por `<REDACTED_API_KEY_FROM_ORIGINAL_APK>`. Os blobs ofuscados e o código de transformação foram mantidos para preservar o valor forense do material, mas os valores finais de usuário, senha e endpoints privados não foram decodificados nem publicados.

A saída decompilada deve ser tratada como aproximação. O JADX informa código gerado, não fonte original; comentários de `JADX INFO`, blocos `FILL_ARRAY_DATA`, métodos nativos e construções de fallback indicam pontos nos quais nomes, tipos, exceções e fluxo podem não corresponder exatamente ao projeto original. A release do JADX usada para a extração está disponível no repositório oficial do projeto [1].

## 10. Integração implementada a partir do PDF

O contrato foi consolidado em [`docs_rencia_contract.md`](docs_rencia_contract.md). A build modificada contém `assets/rencia_contract.pdf` e a camada `com.rencia.integration.RenciaIntegration`, iniciada em `LTVApp.onCreate()`. O bridge executa rede em thread daemon, usa HTTPS, desativa cache HTTP e persiste respostas em `PREF` sem gravar senhas de listas em logs.

| Parte do contrato | Implementação na build | Estado |
|---|---|---|
| Configuração por MAC | `GET /api/v5/apps/{appId}/config?mac={MAC}` | Implementado; padrão `appId=nexus`. |
| Heartbeat | `GET /api/v5/heartbeat` a cada 60 s, com conteúdo atual quando disponível | Implementado. |
| Notificações | `GET /api/v5/list-notifications` a cada ciclo | Implementado; resposta persistida. |
| Falha de player | `POST /api/v5/playback-failure` nos nove listeners ExoPlayer | Implementado; usa a lista ativa persistida. |
| Atualização | `GET /api/v5/apps/{appId}/update?mac={MAC}` | Implementado; resposta persistida para consumo da UI. |
| Comandos remotos | `GET /api/v5/remote-commands?mac={MAC}` | Consulta implementada; comandos não são executados por padrão. |
| ACK de avisos | Método `ackNotification(Context, alertId)` | Disponível para a UI. |
| Visuais e bloqueio | Campos da configuração são persistidos em JSON | Persistência implementada; aplicação visual direta depende de uma camada de UI recompilável. |
| Compatibilidade Maximus/Fusion/Ouro Pro | Rotas legadas | Não ativadas por heurística; o `appId` e a família devem ser definidos pelo titular. |

## 11. Reempacotamento e validação

A árvore foi decodificada com Apktool preservando os recursos brutos, recebeu apenas o patch smali e o asset do PDF, foi reempacotada, alinhada e assinada com uma chave local separada da assinatura original. A build final passou na verificação v1, v2 e v3 do Android. A verificação v4 e SourceStamp não foram geradas pela ferramenta disponível. O manifesto manteve o pacote `com.lumi.ar`, a versão `3.9`, o `minSdk 21` e o `targetSdk 36`.

O hash SHA-256 da build corrigida está em [`metadata/rencia-apk-sha256.txt`](metadata/rencia-apk-sha256.txt). A chave privada de assinatura não está no repositório. Como não há emulador ou dispositivo Android conectado nesta sessão, a validação funcional de login, resposta do servidor, bloqueio, failover e reprodução deve ser realizada em um aparelho de teste autorizado.

## 12. Correção do crash reportado

O screenshot enviado pelo usuário mostrou `java.lang.NoSuchMethodError` para `RenciaIntegration.checkUpdate(Context)` dentro de `RenciaIntegration$Worker.run()`. A investigação confirmou que a build anterior continha as invocações no worker, mas não continha as declarações dos métodos no mesmo DEX; isso é uma incompatibilidade de empacotamento, não uma falha de rede.

A correção inseriu `checkUpdate(Context)` e `pollRemoteCommands(Context)` na classe `RenciaIntegration` da árvore efetivamente usada pelo Apktool. A build corrigida foi reempacotada, assinada, reaberta com Apktool e verificada diretamente: ambos os métodos aparecem como declarações e como invocações no DEX. O novo SHA-256 é `51dc0ad9c40a69aa5a14884505899f2dcc6144d457a9a399b9ef64490364c9ac`.

## Referências

[1]: https://github.com/skylot/jadx/releases "JADX — releases oficiais"
