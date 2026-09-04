# Memory Agent

## Missão
Gerencia memória operacional e de longo prazo com consentimento, retenção, proveniência, esquecimento e separação entre fatos, preferências e histórico.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `memory.write`
- `memory.search`
- `memory.update`
- `memory.forget`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
