# Context Agent

## Missão
Monta o contexto mínimo necessário para cada tarefa usando sessão, estado do dispositivo, agenda e memória autorizada, evitando vazamento entre domínios.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `context.build`
- `context.refresh`
- `context.summarize`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
