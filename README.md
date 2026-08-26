# LUMI 3.9 — análise estática e código decompilado

Este repositório contém uma cópia de trabalho **decompilada estaticamente** do APK `LUMI3.9.apk`, versão declarada `3.9`, pacote Android `com.lumi.ar`. O material foi preparado para inspeção, documentação e pesquisa de interoperabilidade; ele **não é o projeto-fonte original** e não deve ser tratado como um build reproduzível.

> O APK original não foi incluído neste repositório. O hash SHA-256 do arquivo analisado está em [`metadata/original-apk-sha256.txt`](metadata/original-apk-sha256.txt).

## Escopo da análise

A saída inclui os fontes Java gerados pelo JADX, os recursos decodificados, o manifesto Android e os metadados de inventário. A decompilação foi executada com JADX 1.5.6, usando modo de fallback e preservação de trechos problemáticos. A versão utilizada corresponde à release oficial publicada pelo projeto JADX [1].

| Item | Resultado observado |
|---|---|
| Versão declarada | `3.9` (`versionCode=1`) |
| Pacote do manifesto | `com.lumi.ar` |
| SDK mínimo / alvo | 21 / 36 |
| DEX | 3 arquivos (`classes.dex`, `classes2.dex`, `classes3.dex`) |
| Fontes gerados | 7.747 arquivos Java |
| Recursos exportados | 2.048 arquivos |
| ABIs nativas | `arm64-v8a`, `armeabi-v7a`, `x86_64` |
| Componentes nativos principais | `libhax.so`, `libffmpegJNI.so`, `librealm-jni.so`, `libpl_droidsonroids_gif.so` |
| Assinatura v1 | Certificado autoassinado com identificador `ATV REBRANDS APKS` |

## Estrutura

`decompiled/sources/` contém os fontes Java gerados, incluindo o código próprio identificado nos pacotes `com.flextv.livestore`, `com.andyhax` e `amimo.dcc`, além das bibliotecas incorporadas. `decompiled/resources/` contém o manifesto decodificado, recursos Android, assets e bibliotecas nativas extraídas pelo decompilador. `metadata/` reúne inventários, o hash do APK original e a política de exclusão do binário original.

Os arquivos gerados podem conter construções inválidas, nomes artificiais e fluxo de controle reconstruído de forma imperfeita. Para compreender o comportamento original, compare sempre os fontes decompilados com o bytecode DEX e com os recursos do APK de origem.

## Build integrada ao contrato Rencia

A build [`build/LUMI3.9-rencia.apk`](build/LUMI3.9-rencia.apk) é uma cópia reempacotada e assinada localmente do LUMI 3.9. Ela inclui [`build/rencia_contract.pdf`](build/rencia_contract.pdf) como asset e uma camada smali em `patch/smali/com/rencia/integration/` que inicia, em thread de background, a configuração por MAC, heartbeat, notificações, atualização e consulta de comandos remotos.

A camada grava a resposta bruta e estados não sensíveis em `SharedPreferences` `PREF`, desativa cache HTTP para essas chamadas e envia `POST /api/v5/playback-failure` somente a partir dos listeners de erro do ExoPlayer. O relatório de falha usa o número da lista persistida pelo servidor. Comandos remotos são consultados e armazenados, mas não são executados automaticamente porque o PDF não define uma whitelist de comandos suportados. Os players podem ser integrados a uma whitelist posterior por meio de `ackNotification` e de um ACK de comando explicitamente implementado.

A tela `LoginActivity` agora é MAC-first por meio de `Application.ActivityLifecycleCallbacks`: quando uma Activity fica visível, o bridge atualiza o texto do MAC, marca usuário e senha como opcionais e faz uma consulta única em background. Se o retorno tiver `registered=true` e `allowed=true`, o fluxo nativo existente é aberto automaticamente; se o aparelho não estiver autorizado, a tela original de usuário/senha permanece disponível como fallback.

O `appId` padrão do bridge é `nexus` e pode ser substituído antes da instalação escrevendo `rencia_app_id` nas preferências do app. A integração não altera diretamente a UI existente para aplicar logo, banner, fundo ou bloqueios; ela persiste a configuração para a camada de interface consumir. O APK foi reempacotado a partir de um binário, não de um projeto-fonte Android, portanto a build é um artefato de patch e não uma reprodução do projeto original.

A assinatura da build é diferente da assinatura original. O APK original não foi incluído na árvore pública; a chave privada usada na assinatura local também permanece fora do repositório.

### Correção da build

Uma versão anterior chamava `checkUpdate(Context)` e `pollRemoteCommands(Context)` pelo worker, mas esses métodos não estavam presentes no mesmo DEX, gerando `NoSuchMethodError` no aparelho. Depois, uma tentativa de anexar o fluxo diretamente a `LoginActivity.onResume()` causou `LinkageError`, porque `FragmentActivity.onResume()` é final. A build atual mantém a Activity nativa intacta e usa `RenciaLifecycle.onActivityResumed(Activity)` registrado no `Application`; a correção foi verificada reabrindo o APK final com Apktool. O SHA-256 atualizado está em `metadata/rencia-apk-sha256.txt`.

## Achados técnicos resumidos

A aplicação se comporta como um cliente IPTV/streaming para TV e dispositivos Android, com telas de canais ao vivo, filmes, séries, EPG, reprodução interna/externa, playlists M3U e legendas. A interface Retrofit declara chamadas para `player_api.php` e `xmltv.php`, com parâmetros `username`, `password`, `stream_id`, `series_id` e `vod_id`.

O aplicativo usa `SharedPreferences` para persistir, entre outros estados, URL do servidor, usuário, senha, endereço MAC, chave do dispositivo, modelo de login, listas e posições de reprodução. O manifesto também declara acesso à Internet, estado de rede, armazenamento legado, wake lock, boot completed, foreground service e `WRITE_SETTINGS`.

Há valores ofuscados por blobs hexadecimais e rotinas nativas JNI. O código Java expõe wrappers para inicialização de `libhax.so`, formatação de MAC, DNS, VPN e decodificação de dados. Também há uma rotina de verificação que pode encerrar o processo quando determinadas condições de integridade/domínio não são satisfeitas. **Nenhuma credencial decodificada foi incluída neste repositório.** A chave literal encontrada no código decompilado foi substituída por `<REDACTED_API_KEY_FROM_ORIGINAL_APK>`.

## Uso responsável

Este material deve ser usado somente quando houver autorização do titular do APK, do código, dos serviços e dos dados envolvidos. Não use contas, playlists, endpoints ou identificadores de dispositivos de terceiros. Não tente contornar autenticação, ativação, licenciamento ou controles de acesso. A publicação de código de terceiros pode estar sujeita a direitos autorais, termos de serviço e obrigações de remoção; confirme a autorização antes de tornar o repositório público.

## Referências

[1]: https://github.com/skylot/jadx/releases "JADX — releases oficiais"
