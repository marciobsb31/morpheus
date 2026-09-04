# Tratamento de erros — Display Agent

Erros padronizados: `INVALID_REQUEST`, `CAPABILITY_NOT_SUPPORTED`, `RESOURCE_NOT_ALLOWED`, `APPROVAL_REQUIRED`, `APPROVAL_EXPIRED`, `PRECONDITION_FAILED`, `NATIVE_API_ERROR`, `TIMEOUT`, `CANCELLED`, `POSTCONDITION_FAILED`.

Retries só para falhas transitórias e operações comprovadamente idempotentes. Nunca repetir automaticamente uma ação destrutiva ou crítica sem nova avaliação de política.
