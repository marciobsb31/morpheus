# EventEnvelope v1

Campos: `event_id`, `event_type`, `event_version`, `occurred_at`, `producer`, `correlation_id`, `causation_id`, `subject`, `payload`.

Consumers devem tolerar campos opcionais desconhecidos e deduplicar por `event_id` quando necessário.
