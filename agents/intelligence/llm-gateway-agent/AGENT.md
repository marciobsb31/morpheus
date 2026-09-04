# AGENT — LLM Gateway Agent

**ID:** `llm-gateway-agent`  
**Domínio:** intelligence  
**Owner lógico:** Morpheus Core  

## Responsabilidade
Oferece uma única fronteira para modelos locais e cloud, roteamento por política, custo, privacidade, capacidade e fallback, sem expor chaves aos demais agentes.

## Não responsabilidades
- Não decidir objetivos globais.
- Não contornar Policy/Permission Engine.
- Não armazenar segredos em Markdown, logs ou prompts.
- Não chamar outro agente diretamente para compor workflows.

## Lifecycle
REGISTERING → READY → BUSY → DEGRADED/READY → STOPPED.
