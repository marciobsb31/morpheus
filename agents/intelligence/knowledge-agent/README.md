# Knowledge Agent

## Missão
Indexa e recupera conhecimento autorizado via RAG, mantendo fonte, versão, escopo e permissões por coleção.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `knowledge.ingest`
- `knowledge.search`
- `knowledge.retrieve`
- `knowledge.reindex`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
