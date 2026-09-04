# Instruções de Segurança para IAs

Antes de implementar qualquer capability: leia `ARCHITECTURE_GUARDRAILS.md`, esta entrega e o agente correspondente. Não remova confirmações para “facilitar testes”. Não coloque API keys em código. Não permita que saída de LLM seja executada como shell diretamente. Gere plano estruturado, valide schema, policy e parâmetros. Toda mudança de permissão deve atualizar documentação e testes negativos.
