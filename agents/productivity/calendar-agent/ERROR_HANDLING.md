# Error Handling — Calendar Agent

Códigos base: `INVALID_REQUEST`, `UNSUPPORTED_CAPABILITY`, `AUTH_REQUIRED`, `PERMISSION_DENIED`, `APPROVAL_REQUIRED`, `PROVIDER_UNAVAILABLE`, `RATE_LIMITED`, `TIMEOUT`, `CONFLICT`, `NOT_FOUND`, `EXECUTION_FAILED`.

Retry somente para operações seguras/idempotentes ou com idempotency key. Nunca repetir cegamente envio, criação ou alteração externa.
