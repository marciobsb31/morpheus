# Backlog — Reminder Agent

## P0 — contrato
- Formalizar schemas de cada capability.
- Criar interfaces de portas/adapters.
- Criar fake provider e testes de contrato.
- Implementar política e auditoria.

## P1 — integração
- Implementar primeiro provider.
- Adicionar health check e métricas.
- Cobrir erros e rate limits.

## P2 — inteligência
- Adicionar sumarização/contexto somente via abstração LLM do Morpheus.
- Adicionar sugestões proativas sujeitas a política; nunca executar mutações silenciosas.
