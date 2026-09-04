# Máquina de estados de execução

Estados de um plano: `RECEIVED -> INTERPRETING -> PLANNING -> POLICY_CHECK -> WAITING_APPROVAL -> READY -> RUNNING -> SUCCEEDED|PARTIALLY_SUCCEEDED|FAILED|CANCELLED|EXPIRED`.

Transições devem ser persistidas/auditadas. `WAITING_APPROVAL` congela o plano até aprovação válida ou expiração. `RUNNING` não volta a `PLANNING`; uma reinterpretação cria nova revisão/plano. Cancelamento deve sinalizar passos em andamento e executar compensações explicitamente configuradas.
