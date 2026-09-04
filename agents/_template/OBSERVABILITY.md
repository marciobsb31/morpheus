# Observability — <agent-name>

## Logs
Estruturados e correlacionáveis: `timestamp`, `level`, `agent_id`, `instance_id`, `request_id`, `correlation_id`, `capability`, `status`, `duration_ms`.

## Métricas
- executions_total por capability/status;
- execution_duration;
- active_executions;
- dependency_health;
- heartbeat_age;
- retry_total.

## Traces
Propagar `trace_id/correlation_id` entre Core, Event Bus e adapters. Redigir PII e segredos antes de exportar telemetria.
