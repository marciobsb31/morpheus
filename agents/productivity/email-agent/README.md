# Email Agent

**Agent ID:** `email-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Consultar, resumir, classificar e preparar ações de e-mail; envios e alterações exigem política explícita.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
