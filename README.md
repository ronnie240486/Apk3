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

## Achados técnicos resumidos

A aplicação se comporta como um cliente IPTV/streaming para TV e dispositivos Android, com telas de canais ao vivo, filmes, séries, EPG, reprodução interna/externa, playlists M3U e legendas. A interface Retrofit declara chamadas para `player_api.php` e `xmltv.php`, com parâmetros `username`, `password`, `stream_id`, `series_id` e `vod_id`.

O aplicativo usa `SharedPreferences` para persistir, entre outros estados, URL do servidor, usuário, senha, endereço MAC, chave do dispositivo, modelo de login, listas e posições de reprodução. O manifesto também declara acesso à Internet, estado de rede, armazenamento legado, wake lock, boot completed, foreground service e `WRITE_SETTINGS`.

Há valores ofuscados por blobs hexadecimais e rotinas nativas JNI. O código Java expõe wrappers para inicialização de `libhax.so`, formatação de MAC, DNS, VPN e decodificação de dados. Também há uma rotina de verificação que pode encerrar o processo quando determinadas condições de integridade/domínio não são satisfeitas. **Nenhuma credencial decodificada foi incluída neste repositório.** A chave literal encontrada no código decompilado foi substituída por `<REDACTED_API_KEY_FROM_ORIGINAL_APK>`.

## Uso responsável

Este material deve ser usado somente quando houver autorização do titular do APK, do código, dos serviços e dos dados envolvidos. Não use contas, playlists, endpoints ou identificadores de dispositivos de terceiros. Não tente contornar autenticação, ativação, licenciamento ou controles de acesso. A publicação de código de terceiros pode estar sujeita a direitos autorais, termos de serviço e obrigações de remoção; confirme a autorização antes de tornar o repositório público.

## Referências

[1]: https://github.com/skylot/jadx/releases "JADX — releases oficiais"
