# ADR-0015-development-runtime-agent-separation — Separação entre Development e Runtime Agents

**Status:** Aceito

## Contexto
O Morpheus precisa permanecer coerente ao ser desenvolvido por múltiplas IAs e ferramentas.

## Decisão
Agentes que constroem o software não pertencem ao runtime e não recebem permissões operacionais do assistente.

## Consequências
A decisão reduz deriva arquitetural. Exceções futuras precisam de evidência e novo ADR.
