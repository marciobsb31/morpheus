# Guia de Criação de Agentes

Um agente representa um domínio operacional coerente, não uma função isolada.

## Manifesto mínimo futuro
- `id`, `name`, `version`.
- capabilities oferecidas.
- eventos publicados/consumidos.
- permissões requeridas.
- dependências externas.
- health check.

## Cada capability deve definir
- Nome estável e versionável.
- Descrição e exemplos.
- Input/output schema.
- Pré-condições.
- Efeitos colaterais.
- Nível de risco.
- Timeout e idempotência.
- Erros conhecidos.

## Limites
O agente não interpreta a intenção global do usuário. Ele recebe uma solicitação normalizada do Core e devolve resultado estruturado.
