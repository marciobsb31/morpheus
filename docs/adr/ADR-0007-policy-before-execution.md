# ADR-0007 — Policy Engine antes da execução

**Status:** Aceito

Toda etapa de um plano deve receber decisão de política antes de ser enviada a um executor. LLM, plugin, evento interno ou agente não podem conceder a si mesmos autorização. Aprovações são vinculadas ao escopo exato do passo e expiram.
