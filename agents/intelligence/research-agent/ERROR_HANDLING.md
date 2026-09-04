# ERROR HANDLING — Research Agent

Erros padronizados: `INVALID_REQUEST`, `NOT_AUTHORIZED`, `PROVIDER_UNAVAILABLE`, `TIMEOUT`, `RATE_LIMITED`, `DATA_POLICY_BLOCKED`, `DEPENDENCY_FAILURE`. Retry apenas para falhas transitórias e operações idempotentes, com backoff e limite.
