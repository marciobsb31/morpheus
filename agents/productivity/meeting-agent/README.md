# Meeting Agent

**Agent ID:** `meeting-agent`  
**Família:** Productivity  
**Status:** especificação para implementação

## Missão
Preparar, acompanhar e encerrar o ciclo de reuniões, agregando agenda, participantes, contexto e follow-ups.

## Integração
Recebe somente `ExecutionRequest` válido do Core e devolve `ExecutionResult`. Integrações com provedores devem ficar atrás de adapters; nenhum fornecedor externo pode contaminar o domínio.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `PERMISSIONS.md`, `SECURITY.md` e `TEST_PLAN.md` antes de implementar.
