# Speech-to-Text Agent

## Missão
Converte áudio em texto com abstração de provedor, streaming, detecção de idioma e confiança, priorizando execução local quando configurada.

## Regra arquitetural
Este agente **não orquestra outros agentes**. Recebe uma solicitação do Morpheus Core, valida contrato/política, executa somente suas capabilities e devolve resultado estruturado.

## Capabilities
- `stt.transcribe`
- `stt.stream`

## Integração
Contratos versionados, correlation ID, timeout, idempotência quando aplicável e eventos auditáveis.
