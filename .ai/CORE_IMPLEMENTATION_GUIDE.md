# Guia para IAs — implementação do Core

Antes de alterar o Core, leia `BOOTSTRAP.md`, `ARCHITECTURE_GUARDRAILS.md`, os ADRs e `core/README.md`.

## Regras
1. Não implemente automação Windows dentro do Core.
2. Não dê ao LLM acesso direto a shell, banco ou fila.
3. Toda ação executável deve mapear para capability registrada.
4. Valide schemas e políticas antes do dispatch.
5. Prefira interfaces/ports no domínio e adapters na infraestrutura.
6. Não adicione microsserviços apenas por separação conceitual; o baseline é modular-first.
7. Gere testes para decisões de política e transições de estado.
8. Nunca invente credenciais, endpoints ou segredos.
9. Se uma decisão arquitetural nova contrariar ADR existente, proponha ADR antes de codificar.

## Primeiro objetivo executável
Criar um vertical slice `user command -> intent -> deterministic plan -> policy allow -> mock capability -> result`, sem dependências externas obrigatórias.
