# Tasks Agent

**Agent ID:** `tasks-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Gerenciar tarefas, prioridades, prazos, estados e listas de trabalho do usuário.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
