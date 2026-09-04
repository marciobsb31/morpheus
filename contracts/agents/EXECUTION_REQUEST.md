# ExecutionRequest v1

Obrigatórios: `request_id`, `correlation_id`, `capability`, `capability_version`, `parameters`, `actor`, `policy_context`, `deadline`.
Opcionais: `idempotency_key`, `trace_context`, `metadata` sanitizada.

Pedidos expirados devem ser rejeitados antes de produzir efeito.
