# Estratégia de Testes

Pirâmide preferida: muitos testes de domínio/unidade, testes de contrato/adapters suficientes e poucos E2E críticos.

## Obrigatório por capability
- Happy path.
- Entrada inválida.
- Permissão negada.
- Timeout/indisponibilidade quando aplicável.
- Idempotência quando prometida.

## IA
Prompts não substituem testes determinísticos. Saídas de modelo devem ser validadas por schemas e políticas antes de provocar efeitos colaterais.
