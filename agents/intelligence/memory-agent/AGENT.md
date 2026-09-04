# AGENT — Memory Agent

**ID:** `memory-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Gerencia memória operacional e de longo prazo com consentimento, retenção, proveniência, esquecimento e separação entre fatos, preferências e histórico.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
