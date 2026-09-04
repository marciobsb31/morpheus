# Sequência de implementação do Core

1. Contratos e IDs de rastreio.
2. Capability Registry em memória + testes.
3. Agent Registry em memória + heartbeat simulado.
4. Policy Engine determinístico.
5. Orchestrator para plano de um passo.
6. Event Bus abstraction + adapter local.
7. Planner determinístico para comandos conhecidos.
8. Intent Router com provider abstraction para LLM.
9. Context Manager.
10. Approval Engine.
11. Scheduler.
12. Persistência, RabbitMQ e observabilidade.

O primeiro vertical slice deve executar uma capability simulada ponta a ponta antes de integrar Windows real.
