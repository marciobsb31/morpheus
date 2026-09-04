# Policy Agent — Events

## Eventos
Consome solicitações versionadas do Core e eventos de segurança pertinentes. Publica `*.requested`, `*.allowed`, `*.denied`, `*.failed` e `*.completed` conforme o caso. Todo envelope contém `eventId`, `correlationId`, `causationId`, `timestamp`, `schemaVersion` e classificação de dados.
