# Morpheus Agents

Os agentes são unidades especializadas de execução do Morpheus. O Core interpreta, planeja, aplica políticas e delega; agentes expõem **capabilities** e executam somente o que está declarado em seus contratos.

## Regras obrigatórias
1. Todo agente nasce a partir de `agents/_template/`.
2. Agentes não chamam outros agentes diretamente; coordenação passa pelo Core/Event Bus.
3. Toda capability declara entrada, saída, efeitos colaterais, timeout, idempotência e nível de risco.
4. Toda ação passa pelo Policy Engine antes da execução.
5. Credenciais nunca são embutidas em código ou Markdown.
6. Toda execução produz correlação, telemetria e resultado estruturado.
7. Falhas devem ser explícitas; não mascarar erro como sucesso.

## Ciclo de vida
`DISCOVERED -> REGISTERING -> READY -> BUSY -> DEGRADED -> OFFLINE`.

Consulte `docs/agents/AGENT_STANDARD.md` e use `_template` como contrato canônico.
