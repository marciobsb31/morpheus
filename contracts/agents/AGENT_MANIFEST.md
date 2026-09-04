# AgentManifest v1

Campos obrigatórios: `agent_id`, `agent_version`, `protocol_version`, `name`, `domain`, `execution_zone`, `capabilities[]`, `health`, `default_timeout_ms`, `max_concurrency`.

Cada capability inclui `name`, `version`, `risk_level`, `idempotent`, `timeout_ms`, `input_schema_ref`, `output_schema_ref` e `required_permissions[]`.
