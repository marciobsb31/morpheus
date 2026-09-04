# Start Here — Antigravity

Use este repositório como fonte de verdade do projeto Morpheus.

1. Leia `.ai/BOOTSTRAP.md` e siga integralmente a ordem de leitura.
2. Não altere stack, boundaries, contratos ou políticas sem propor ADR.
3. Antes de codificar, produza um plano da capability e liste arquivos/contratos afetados.
4. Implemente a primeira fatia vertical descrita em `docs/roadmap/MORPHEUS_V1_RELEASE_PLAN.md`.
5. Comece pelo Core mínimo e não tente implementar todos os agentes simultaneamente.
6. Preserve a separação entre Development Agents e Runtime Agents.
7. Toda ação sensível precisa passar por Policy/Permission/Approval e Audit.
8. Atualize documentação e changelog junto com código.

Primeira meta sugerida: comando textual “Morpheus, iniciar meu ambiente de desenvolvimento” com fluxo Core -> Policy -> Windows/Developer Environment Agents -> Audit -> UI status.
