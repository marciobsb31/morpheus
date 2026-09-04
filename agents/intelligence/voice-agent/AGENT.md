# AGENT — Voice Agent

**ID:** `voice-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Gerencia a experiência conversacional por voz, wake word opcional, turn-taking, interrupções e encaminhamento seguro de áudio para STT/TTS.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
