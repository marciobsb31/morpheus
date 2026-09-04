# Notification Agent

**ID:** `notification-agent`  
**Família:** Local / Windows  
**Status:** especificação da Entrega 04

## Missão
Entrega notificações locais, overlays e feedback de execução.


## Regras arquiteturais
- O agente é um executor especializado; não interpreta linguagem natural livre.
- Solicitações chegam pelo Morpheus Core usando `ExecutionRequest`.
- O agente valida capability, parâmetros, política, escopo e idempotência antes de agir.
- Agentes não chamam outros agentes diretamente. Composição é responsabilidade do Orchestrator/Planner.
- Toda operação relevante gera telemetria e `ExecutionResult`; ações sensíveis geram trilha de auditoria.
- Não executar shell arbitrário, comandos construídos a partir de texto livre, elevação silenciosa ou bypass de UAC.

## Documentos
Leia `AGENT.md`, `CAPABILITIES.md`, `EVENTS.md`, `PERMISSIONS.md`, `TOOLS.md`, `SECURITY.md`, `ERROR_HANDLING.md`, `OBSERVABILITY.md`, `TEST_PLAN.md`, `BACKLOG.md` e `DEFINITION_OF_DONE.md`.
