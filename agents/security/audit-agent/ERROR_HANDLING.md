# Audit Agent — Error Handling

## Erros
Falhas de segurança são fail-closed. Diferenciar `DENIED`, `UNAUTHENTICATED`, `APPROVAL_REQUIRED`, `POLICY_ERROR`, `DEPENDENCY_UNAVAILABLE` e `INTERNAL_ERROR`. Retry nunca deve contornar negação de política.
