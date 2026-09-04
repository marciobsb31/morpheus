# ADR-0013-docker-compose-before-kubernetes — Compose antes de Kubernetes

**Status:** Aceito

## Contexto
O Morpheus precisa permanecer coerente ao ser desenvolvido por múltiplas IAs e ferramentas.

## Decisão
A V1 usa Docker Compose. Kubernetes só será introduzido com requisitos mensuráveis de escala/HA.

## Consequências
A decisão reduz deriva arquitetural. Exceções futuras precisam de evidência e novo ADR.
