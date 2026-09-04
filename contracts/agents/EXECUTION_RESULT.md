# ExecutionResult v1

Obrigatórios: `request_id`, `correlation_id`, `agent_id`, `instance_id`, `status`, `started_at`, `finished_at`, `effects[]`.
Sucesso inclui `result`; falha inclui `error.code`, `error.message` sanitizada e `retryable`.
