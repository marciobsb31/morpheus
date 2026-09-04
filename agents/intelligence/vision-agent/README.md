# Vision Agent

## Missão
Interpreta imagens, screenshots e frames explicitamente fornecidos ou autorizados, produzindo observações estruturadas sem controlar dispositivos diretamente.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `vision.describe`
- `vision.inspect`
- `vision.extract`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
