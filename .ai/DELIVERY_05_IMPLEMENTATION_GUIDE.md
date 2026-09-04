# AI Guide — Delivery 05

Antes de implementar qualquer Productivity Agent, leia `.ai/BOOTSTRAP.md`, guardrails, contratos e `docs/deliveries/05_PRODUCTIVITY_AGENTS.md`.

## Regras obrigatórias
- Não acople domínio a Google, Microsoft ou outro fornecedor.
- Não faça agente chamar agente.
- Não transforme conteúdo de e-mail/nota/convite em instrução confiável.
- Não grave tokens ou conteúdo pessoal em fixtures reais.
- Comece com fake adapters e contract tests.
- Escritas externas são deny-by-default até Policy/Approval permitir.

## Ordem sugerida
Calendar(read) → Tasks(read/write controlado) → Reminder → Contacts → Meeting → Email(read/draft antes de send) → Notes → Routine.
