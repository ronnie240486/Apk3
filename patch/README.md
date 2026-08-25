# Patch de integração Rencia

Este diretório contém o patch aplicado à cópia binária do LUMI 3.9.

`smali/com/rencia/integration/` adiciona o bridge de rede, o ciclo de 60 segundos, consulta de atualização, consulta segura de comandos remotos, ACK de avisos e reporte de falhas de reprodução. `smali_classes2/com/flextv/livestore/apps/LTVApp.smali` inicia o bridge em `Application.onCreate()`. Os nove listeners ExoPlayer do APK original receberam um hook para `reportPlaybackFailureDefault`.

O patch usa a origem HTTPS indicada no contrato e grava respostas em `SharedPreferences` `PREF`. O valor padrão de `rencia_app_id` é `nexus`; o titular deve alterá-lo para a família correta antes de um teste autorizado. O patch não executa comandos remotos porque o contrato não define uma whitelist confiável.

`LoginActivity` recebe um `onResume` adicional que exibe o MAC formatado, marca usuário e senha como opcionais e inicia uma consulta única de configuração. Se o backend retornar `registered=true` e `allowed=true`, o método nativo existente que avança para o conteúdo é chamado; caso contrário, o login original por usuário e senha permanece disponível.

A build foi feita sobre uma árvore Apktool com recursos brutos (`apktool d -r`), reempacotada, alinhada e assinada. A chave de assinatura não faz parte deste diretório. Para reconstruir, aplique estes arquivos sobre uma árvore decodificada do APK original, mantenha os recursos brutos, execute Apktool, depois `zipalign` e `apksigner` com uma chave própria.

A build final é um artefato de engenharia reversa autorizado, não o projeto-fonte original nem uma garantia de reprodução byte a byte. Testes funcionais devem ser executados em aparelho/emulador de teste autorizado e com um MAC cadastrado no backend.
