# Research Agent

## Missão
Executa pesquisas externas quando permitido, consolida fontes e entrega evidências ao Core sem executar ações no sistema.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `research.search`
- `research.fetch`
- `research.summarize`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
