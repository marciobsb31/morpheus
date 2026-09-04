# AGENT — Vision Agent

**ID:** `vision-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Interpreta imagens, screenshots e frames explicitamente fornecidos ou autorizados, produzindo observações estruturadas sem controlar dispositivos diretamente.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
