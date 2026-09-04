# Modelo de Falhas

Categorias: `VALIDATION`, `AUTHORIZATION`, `NOT_FOUND`, `CONFLICT`, `DEPENDENCY_UNAVAILABLE`, `TIMEOUT`, `EXECUTION`, `CANCELLED`, `UNKNOWN`.

Retries só são permitidos para falhas transitórias e operações seguras/idempotentes. Circuit breaker pode ser aplicado a dependências remotas. O usuário deve receber uma mensagem compreensível sem esconder o diagnóstico técnico da auditoria.
