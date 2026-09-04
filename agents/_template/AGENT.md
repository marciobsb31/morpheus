# Agent Manifest — <agent-name>

## Missão
Descreva em uma frase o resultado que este agente entrega.

## Responsabilidades
- Executar somente capabilities declaradas.
- Validar pré-condições locais.
- Retornar resultado estruturado ao Core.
- Emitir telemetria sem expor segredos.

## Fora de escopo
Liste explicitamente o que este agente **não** pode fazer.

## Identidade
| Campo | Valor |
|---|---|
| agent_id | `morpheus.agent.<domain>.<name>` |
| version | `0.1.0` |
| protocol_version | `1` |
| execution_zone | `<local|cloud|hybrid>` |
| default_timeout_ms | `<valor>` |
| max_concurrency | `<valor>` |

## Lifecycle
O agente registra manifesto e health endpoint, recebe um `agent_instance_id`, envia heartbeat e anuncia mudanças de disponibilidade. Reinício não deve perder a identidade lógica.

## Contrato de execução
Entrada mínima: `request_id`, `correlation_id`, `capability`, `parameters`, `actor`, `policy_context`, `deadline`.
Saída mínima: `status`, `started_at`, `finished_at`, `result|error`, `effects`, `telemetry`.

## Invariantes
- Nunca contornar Policy/Approval Engine.
- Nunca executar capability desconhecida.
- Nunca elevar privilégios silenciosamente.
- Nunca persistir segredo em log.
