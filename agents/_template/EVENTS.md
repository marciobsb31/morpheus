# Events — <agent-name>

## Consome
Para cada evento informe: nome, versão, origem esperada, filtro, ação e política de duplicidade.

## Publica
Eventos recomendados:
- `agent.registered.v1`
- `agent.health.changed.v1`
- `capability.execution.started.v1`
- `capability.execution.completed.v1`
- `capability.execution.failed.v1`

Envelope obrigatório: `event_id`, `event_type`, `event_version`, `occurred_at`, `correlation_id`, `causation_id`, `producer`, `payload`.

Eventos são fatos imutáveis. Não publicar segredo, token ou conteúdo sensível desnecessário.
