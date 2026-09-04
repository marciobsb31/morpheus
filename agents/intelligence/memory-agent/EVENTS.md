# EVENTS — Memory Agent

## Publica
- `memory-agent.execution.started`
- `memory-agent.execution.completed`
- `memory-agent.execution.failed`
- `memory-agent.health.changed`

## Consome
Somente envelopes endereçados às capabilities registradas. Eventos carregam `eventId`, `correlationId`, `causationId`, `timestamp`, `schemaVersion` e classificação de dados.
