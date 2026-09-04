# Plano de testes — Windows Host Agent

1. Unitários para validação de cada capability.
2. Contract tests para `ExecutionRequest/Result` e eventos.
3. Testes de política para todos os níveis de risco.
4. Integration tests com adaptadores Windows em ambiente isolado.
5. Negative/security tests: injection, paths inválidos, recurso fora da allowlist, approval expirado.
6. E2E do Core → agente → resultado sem privilégios administrativos por padrão.

Nenhum teste deve desligar/reiniciar a máquina real do desenvolvedor; use doubles ou ambiente descartável.
