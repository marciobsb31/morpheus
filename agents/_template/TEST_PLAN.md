# Test Plan — <agent-name>

## Obrigatórios
1. Unitários para validação e mapeamento de capabilities.
2. Contract tests para manifest/request/result/event envelopes.
3. Integration tests para adapters externos.
4. Policy tests cobrindo R0–R4 aplicáveis.
5. Failure tests: timeout, dependência fora, resposta inválida e cancelamento.
6. Idempotency/retry tests quando aplicável.
7. Security tests para entradas maliciosas e privilégios.
8. Smoke test do registro, health e uma capability segura.

Nenhum teste deve depender de segredo real ou produzir efeito destrutivo fora de ambiente isolado.
