# LLM Gateway Agent

## Missão
Oferece uma única fronteira para modelos locais e cloud, roteamento por política, custo, privacidade, capacidade e fallback, sem expor chaves aos demais agentes.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `llm.complete`
- `llm.chat`
- `llm.structured`
- `llm.embed`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
