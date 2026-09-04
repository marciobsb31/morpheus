# ADR-0010-rabbitmq-event-bus-v1 — RabbitMQ como Event Bus V1

**Status:** Aceito

## Contexto
O Morpheus precisa permanecer coerente ao ser desenvolvido por múltiplas IAs e ferramentas.

## Decisão
RabbitMQ atende roteamento, ack, retry e DLQ com menor complexidade operacional para a V1.

## Consequências
A decisão reduz deriva arquitetural. Exceções futuras precisam de evidência e novo ADR.
