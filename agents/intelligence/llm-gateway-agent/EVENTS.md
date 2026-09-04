# EVENTS — LLM Gateway Agent

## Publica
- `llm-gateway-agent.execution.started`
- `llm-gateway-agent.execution.completed`
- `llm-gateway-agent.execution.failed`
- `llm-gateway-agent.health.changed`

## Consome
Somente envelopes endereçados às capabilities registradas. Eventos carregam `eventId`, `correlationId`, `causationId`, `timestamp`, `schemaVersion` e classificação de dados.
