# Capability Contract

Uma capability é uma função de negócio/automação com contrato estável. Parâmetros devem ser tipados e limitados; strings livres são exceção.

## Request
`request_id`, `correlation_id`, `capability`, `capability_version`, `parameters`, `actor`, `deadline`, `idempotency_key?`.

## Result
`request_id`, `status`, `result?`, `error?`, `effects[]`, `started_at`, `finished_at`, `agent_id`, `instance_id`.

## Status
`ACCEPTED`, `RUNNING`, `SUCCEEDED`, `FAILED`, `DENIED`, `CANCELLED`, `TIMED_OUT`, `UNKNOWN`.

`UNKNOWN` significa que houve perda de confirmação e o efeito precisa ser reconciliado.
