# Eventos — Display Agent

## Consome
- `core.execution.requested` — envelope contendo `ExecutionRequest` destinado a `display-agent`.
- `core.execution.cancelled` — cancelamento cooperativo quando a operação suportar.

## Publica
- `agent.execution.started`
- `agent.execution.succeeded`
- `agent.execution.failed`
- `agent.health.changed`

Todos usam `EventEnvelope`, `eventId`, `correlationId`, `causationId`, timestamp UTC, versão de schema e origem. Eventos não devem carregar segredos ou conteúdo sensível desnecessário.
