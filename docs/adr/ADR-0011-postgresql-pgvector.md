# ADR-0011-postgresql-pgvector — PostgreSQL + pgvector

**Status:** Aceito

## Contexto
O Morpheus precisa permanecer coerente ao ser desenvolvido por múltiplas IAs e ferramentas.

## Decisão
Usar PostgreSQL como source of truth e pgvector para embeddings/RAG inicialmente, reduzindo quantidade de componentes.

## Consequências
A decisão reduz deriva arquitetural. Exceções futuras precisam de evidência e novo ADR.
