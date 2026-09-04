# Events — Meeting Agent

## Consome
- `execution.requested` direcionado a `meeting-agent`.
- `execution.cancel.requested` quando a operação suportar cancelamento.

## Publica
- `agent.execution.started`
- `agent.execution.succeeded`
- `agent.execution.failed`
- eventos específicos de mudança com payload mínimo e sem conteúdo pessoal desnecessário.

Todo evento usa `EventEnvelope`, `correlationId`, `causationId`, `traceId`, timestamp UTC e versão de schema.
