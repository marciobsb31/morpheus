# Calendar Agent

**Agent ID:** `calendar-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Consultar, criar, atualizar e acompanhar compromissos e disponibilidade em calendários autorizados.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
