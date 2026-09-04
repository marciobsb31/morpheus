# Tools & Adapters — Contacts Agent

## Política
O domínio depende de portas, nunca de SDKs diretamente. Adapters podem implementar Google/Microsoft ou outros provedores compatíveis.

## Requisitos
- OAuth/OIDC quando disponível.
- timeout e retry apenas para falhas transitórias.
- rate-limit awareness.
- idempotency key para escritas quando suportada.
- mock/fake obrigatório para testes.
