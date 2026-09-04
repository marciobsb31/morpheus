# AGENT — Knowledge Agent

**ID:** `knowledge-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Indexa e recupera conhecimento autorizado via RAG, mantendo fonte, versão, escopo e permissões por coleção.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
