# Morpheus AI Bootstrap — V1

Este é o primeiro documento que qualquer IA de desenvolvimento deve ler antes de modificar o Morpheus.

## Ordem obrigatória de leitura
1. `.ai/PROJECT_CONTEXT.md`
2. `.ai/development-agents/MORPHEUS_ARCHITECT.md`
3. `.ai/standards/TECHNOLOGY_STACK.md`
4. `.ai/guardrails/ARCHITECTURE_GUARDRAILS.md`
5. `.ai/guardrails/DEPENDENCY_POLICY.md`
6. `.ai/guardrails/FORBIDDEN_PATTERNS.md`
7. `docs/architecture/` referente à capacidade em implementação
8. `docs/adr/README.md` e ADRs aplicáveis
9. `agents/_template/` quando criar ou alterar um agente
10. `.ai/workflows/` correspondente à tarefa

## Regra de autoridade
Nenhuma IA, agente de código ou ferramenta tem autoridade para alterar silenciosamente a arquitetura, a stack oficial, contratos, políticas de segurança ou limites de confiança. Mudanças arquiteturais exigem proposta explícita e ADR.

## Fluxo de trabalho
Antes de codificar, responda internamente: qual capability será entregue, qual módulo é dono dela, quais contratos serão tocados, qual nível de risco, quais testes provam a entrega e quais observações/telemetria serão necessárias.

## Princípio operacional
LLMs podem raciocinar e propor. Policy/Permission/Approval autorizam. Agentes executam. Auditoria registra.

## Estado da V1
A V1 deste pacote é uma especificação executável de arquitetura e engenharia. Ela define como implementar o produto de forma incremental no Antigravity, IntelliJ ou outras IAs sem perder coerência arquitetural.
