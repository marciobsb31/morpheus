# HealthStatus v1

Campos: `agent_id`, `instance_id`, `status` (`READY|BUSY|DEGRADED|OFFLINE`), `checked_at`, `dependencies[]`, `capability_availability{}` e `details` sanitizados.

Liveness responde se o processo vive; readiness responde se pode executar trabalho.
