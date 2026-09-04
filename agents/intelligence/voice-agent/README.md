# Voice Agent

## Missão
Gerencia a experiência conversacional por voz, wake word opcional, turn-taking, interrupções e encaminhamento seguro de áudio para STT/TTS.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `voice.listen`
- `voice.stop`
- `voice.session.start`
- `voice.session.end`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
