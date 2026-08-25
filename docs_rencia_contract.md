# Contrato Rencia App e matriz de compatibilidade

Este arquivo consolida o conteúdo técnico de `main(3).pdf` e a comparação com a análise estática de LUMI 3.9.

## Contrato universal

| Requisito | Contrato | Situação observada no LUMI 3.9 | Ação necessária |
|---|---|---|---|
| Base | `https://renciaapp.manus.space` | Não encontrada como base literal no código próprio | Adicionar cliente dedicado com HTTPS e JSON UTF-8. |
| Identidade | MAC preferencialmente `AA:BB:CC:DD:EE:FF` | Há leitura, formatação e persistência de MAC | Reutilizar o MAC normalizado sem registrar em logs. |
| Configuração | `GET /api/v5/apps/{appId}/config?mac={MAC}` | Ausente | Implementar antes de carregar conteúdo. |
| Controle | `registered`, `allowed`, `status` | Ausente | Bloquear cadastro/reprodução conforme resposta. |
| Expiração | `expiration_show_modal`, chave/título/mensagem | Ausente | Modal único por `expiration_modal_key`. |
| Listas | `playlist_urls`, `active_list_number`, `playlist_sync_required` | Existem playlists locais e troca manual, sem contrato universal | Aplicar somente lista indicada pelo servidor. |
| Atualização | `GET /api/v5/apps/{appId}/update?mac={MAC}` | Existem fluxos de atualização legados/ofuscados | Adicionar consulta sob demanda e respeitar `force_update`. |
| Heartbeat | `GET /api/v5/heartbeat` imediato ao trocar conteúdo e a cada 60 s | Há timers de EPG/player, não heartbeat universal | Criar ciclo enquanto o app estiver em primeiro plano. |
| Avisos | `GET /api/v5/list-notifications` a cada 60 s e ao voltar ao foreground | Ausente | Consultar, exibir e confirmar avisos. |
| ACK de aviso | `POST /api/v5/list-notifications/ack` | Ausente | Enviar `mac` e `alert_id` após exibição. |
| Falha real | `POST /api/v5/playback-failure` com `mac` e lista ativa | Existem `Player.Listener.onPlayerError` em players | Filtrar erro real de rede/timeout e acionar rota. |
| Failover | Obedecer `switch_applied`, `failover_state`, `active_list_number` | Ausente | Recarregar configuração somente por ordem do servidor. |
| Comandos | `GET /api/v5/remote-commands` e ACK com `executed`/`failed` | Ausente | Implementar whitelist local de comandos reconhecidos. |
| Visuais | Logo, banner, fundo, message image, ícones e textos | Há recursos locais e algumas WebViews remotas | Aplicar URLs HTTPS com cache somente para imagens. |
| Privacidade | Não logar nem enviar senhas; status sem cache HTTP | Há `HttpLoggingInterceptor` e credenciais em query nas APIs legadas | Desligar logs em release e não enviar credenciais ao cliente universal. |
| Resiliência | Manter última visual/lista válida em falha de rede | Há estado local/Realm | Implementar fallback sem apagar estado válido. |

## Rotas de compatibilidade

As famílias Maximus, Fusion/Ultra e Ouro Pro têm contratos próprios no PDF. O APK analisado não declara esses caminhos universais em texto claro, portanto não devem ser ativados por heurística. A implementação inicial deve usar somente a família escolhida no catálogo do app (`appId`) e cair para o fluxo atual quando a configuração universal estiver indisponível.

## Fluxo recomendado

Na abertura, normalizar o MAC, consultar configuração, bloquear quando `registered=false` ou `allowed=false`, aplicar visuais, carregar a primeira lista e iniciar o ciclo de 60 segundos. No ciclo, consultar heartbeat e notificações, exibir cada modal uma vez, confirmar avisos exibidos, sincronizar listas em segundo plano quando ordenado e executar apenas comandos conhecidos. Em erro real de reprodução, reportar a falha e trocar de lista somente se o servidor responder com a troca.

## Pontos de integração sugeridos

`LTVApp.onCreate()` é o ponto de inicialização global, mas não deve fazer rede síncrona. A camada de contrato deve ser um serviço/cliente independente, com callbacks para a Activity ativa. `HomeActivity` ou a classe base de Activities pode aplicar bloqueio, mensagens e visuais. Os listeners `onPlayerError` existentes nas Activities de live/VOD são pontos para reportar falha real. `PreferenceHelper` pode guardar apenas configuração não sensível, o identificador de transição e a última lista válida; senhas e tokens não devem ser logados.

## Limitações

O APK disponível é um binário compilado e parte importante do fluxo está em JNI/ofuscação. A árvore publicada é decompilada e não constitui um projeto Android recompilável. Para gerar uma versão instalável com a integração, é necessário reconstruir o projeto-fonte ou aplicar um patch binário controlado em uma cópia do APK, com ferramentas Android adequadas e uma chave de assinatura autorizada pelo titular.
