# Entrega 08 — Segurança, Auditoria e Governança

Esta entrega transforma segurança em uma camada transversal do Morpheus. Nenhuma capacidade sensível deve depender apenas da decisão de um LLM ou agente executor. O fluxo obrigatório é: intenção → plano → avaliação de política → aprovação quando necessária → execução → auditoria → resultado.

## Objetivos
- Zero confiança implícita entre Core, agentes, plugins e provedores externos.
- Menor privilégio por capability e por ferramenta.
- Aprovação humana proporcional ao risco.
- Segredos fora de prompts, logs e repositório.
- Auditoria íntegra e rastreável por correlationId.
- Revogação rápida de credenciais, sessões, agentes e plugins.
- Proteção contra prompt injection e conteúdo não confiável.
- Privacidade por padrão e minimização de dados.

## Componentes
Security Agent, Identity Agent, Permission Agent, Approval Agent, Audit Agent, Secrets Agent, Policy Agent e Trust Agent. Eles complementam o Policy/Permission Engine do Core; não substituem a orquestração.

## Regra de ouro
LLMs recomendam; políticas autorizam; agentes executam; auditoria registra. Ações irreversíveis, financeiras, administrativas, de segurança física ou que afetem terceiros exigem controles reforçados.
