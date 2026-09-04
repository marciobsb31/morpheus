# Routine Agent

**Agent ID:** `routine-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Modelar e executar rotinas compostas e contextuais sem assumir autoridade sobre os agentes especializados.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
