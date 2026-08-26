# Patch de integração Rencia

Este diretório contém o patch aplicado à cópia binária do LUMI 3.9.

`smali/com/rencia/integration/` adiciona o bridge de rede, o ciclo de 60 segundos, consulta de atualização, consulta segura de comandos remotos, ACK de avisos e reporte de falhas de reprodução. `smali_classes2/com/flextv/livestore/apps/LTVApp.smali` inicia o bridge em `Application.onCreate()`. Os nove listeners ExoPlayer do APK original receberam um hook para `reportPlaybackFailureDefault`.

O patch usa a origem HTTPS indicada no contrato e grava respostas em `SharedPreferences` `PREF`. O valor padrão de `rencia_app_id` é `nexus`; o titular deve alterá-lo para a família correta antes de um teste autorizado. O patch não executa comandos remotos porque o contrato não define uma whitelist confiável.

O `Application` registra `RenciaLifecycle`, cujo `onActivityResumed(Activity)` primeiro procura o botão real `hax_login`; Activities sem esse controle são ignoradas. Somente na tela de login o callback exibe o MAC formatado, oculta completamente os campos de usuário e senha, troca o botão para `VALIDAR MAC` e inicia uma consulta única de configuração. O campo do MAC recebe `MacCopyListener`, que copia o endereço para a área de transferência e mostra `MAC copiado`. Se o backend retornar `registered=true` e `allowed=true`, o método nativo existente que avança para o conteúdo é chamado; caso contrário, um aviso informa que o MAC não está autorizado.

A build foi feita sobre uma árvore Apktool com recursos brutos (`apktool d -r`), reempacotada, alinhada e assinada. A chave de assinatura não faz parte deste diretório. Para reconstruir, aplique estes arquivos sobre uma árvore decodificada do APK original, mantenha os recursos brutos, execute Apktool, depois `zipalign` e `apksigner` com uma chave própria.

A build final é um artefato de engenharia reversa autorizado, não o projeto-fonte original nem uma garantia de reprodução byte a byte. Testes funcionais devem ser executados em aparelho/emulador de teste autorizado e com um MAC cadastrado no backend.
