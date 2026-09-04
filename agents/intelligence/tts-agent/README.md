# Text-to-Speech Agent

## Missão
Converte respostas em fala, seleciona voz, controla fila, interrupção, cache e fallback entre motores locais e cloud.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `tts.speak`
- `tts.stop`
- `tts.preview`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
