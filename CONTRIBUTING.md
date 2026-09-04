# Contribuindo

## Fluxo
1. Abra uma issue/capability com objetivo e critérios de aceite.
2. Verifique ADRs e guardrails.
3. Faça mudanças pequenas e coesas.
4. Inclua testes e documentação junto da alteração.
5. Não introduza dependência nova sem justificativa.
6. Atualize contratos e versão quando houver quebra de compatibilidade.

## Commits
Preferência por Conventional Commits: `feat:`, `fix:`, `docs:`, `test:`, `refactor:`, `build:`, `ci:`, `chore:`.

## Pull Request
Deve informar: problema, solução, riscos, permissões novas, contratos afetados, testes realizados e rollback quando aplicável.

## Proibido
- Credenciais no Git.
- Execução de shell construída diretamente de texto de LLM.
- Desabilitar validação de certificado para “resolver” integração.
- Ação destrutiva silenciosa.
