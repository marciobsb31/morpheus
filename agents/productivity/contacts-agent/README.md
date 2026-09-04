# Contacts Agent

**Agent ID:** `contacts-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Resolver identidades e consultar contatos autorizados para apoiar comunicação, agenda e reuniões.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
