# EVENTS — Context Agent

## Publica
- `context-agent.execution.started`
- `context-agent.execution.completed`
- `context-agent.execution.failed`
- `context-agent.health.changed`

## Consome
Somente envelopes endereçados às capabilities registradas. Eventos carregam `eventId`, `correlationId`, `causationId`, `timestamp`, `schemaVersion` e classificação de dados.
