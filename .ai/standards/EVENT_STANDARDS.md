# Event Standards

Eventos usam envelope versionado com `eventId`, `eventType`, `schemaVersion`, `occurredAt`, `correlationId`, `causationId`, `producer`, `subject`, `riskLevel` e payload. Consumidores devem ser idempotentes. DLQ, retry com backoff e observabilidade são obrigatórios.
