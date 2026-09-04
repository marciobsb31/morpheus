# Morpheus V1 Release Plan

## Objetivo da V1 funcional
Entregar um assistente pessoal desktop capaz de receber texto/voz, interpretar intenções, executar automações locais autorizadas, consultar agenda/tarefas, emitir notificações, integrar Smart Home, manter contexto/memória controlada e operar com UI desktop.

## Ordem recomendada de implementação
1. Workspace/build + Core mínimo.
2. Contratos e Agent Registry.
3. Policy/Permission/Approval + Audit.
4. Event Bus e observabilidade.
5. Windows Agent + Developer Environment Agent.
6. UI Command Center mínima.
7. Calendar/Reminder/Notification.
8. Voice STT/TTS e LLM Gateway.
9. Memory/Context/RAG.
10. Smart Home.
11. VPS opcional e sincronização.
12. Hardening, E2E, backup/restore e release.

## Primeira demonstração-alvo
Usuário diz: “Morpheus, iniciar meu ambiente de desenvolvimento.” O Core interpreta, valida política, aciona agentes locais, abre ferramentas autorizadas, organiza o ambiente, consulta a próxima reunião e responde por voz/UI com status e correlation id auditável.
