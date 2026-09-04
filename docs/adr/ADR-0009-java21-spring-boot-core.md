# ADR-0009-java21-spring-boot-core — Java 21 + Spring Boot para o Core

**Status:** Aceito

## Contexto
O Morpheus precisa permanecer coerente ao ser desenvolvido por múltiplas IAs e ferramentas.

## Decisão
Usar Java 21 LTS e Spring Boot 3.x como baseline do Core. Java 25 pode ser avaliado posteriormente por ADR quando tooling e dependências estiverem maduros.

## Consequências
A decisão reduz deriva arquitetural. Exceções futuras precisam de evidência e novo ADR.
