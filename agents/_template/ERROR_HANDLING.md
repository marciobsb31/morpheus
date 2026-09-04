# Error Handling — <agent-name>

## Categorias
- `VALIDATION_ERROR` — entrada inválida; não repetir.
- `POLICY_DENIED` — política negou; não repetir.
- `APPROVAL_REQUIRED` — aguardar aprovação.
- `DEPENDENCY_UNAVAILABLE` — retry com backoff quando seguro.
- `TIMEOUT` — estado final pode ser incerto; reconciliar antes de repetir.
- `EXECUTION_FAILED` — falha conhecida da capability.
- `INTERNAL_ERROR` — falha inesperada; sanitizar detalhes.

## Retry
Somente operações idempotentes ou protegidas por idempotency key podem ser repetidas automaticamente. Use backoff exponencial com jitter e limite de tentativas definido por capability.

## Compensação
Toda capability com efeito relevante deve documentar rollback, compensação ou declarar explicitamente que não há reversão.
