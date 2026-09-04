# AGENT — Context Agent

**ID:** `context-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Monta o contexto mínimo necessário para cada tarefa usando sessão, estado do dispositivo, agenda e memória autorizada, evitando vazamento entre domínios.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
