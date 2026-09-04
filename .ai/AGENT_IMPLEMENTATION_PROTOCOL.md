# AI Protocol — Implementing a Morpheus Agent

Antes de escrever código, uma IA MUST ler: `.ai/BOOTSTRAP.md`, `.ai/ARCHITECTURE_GUARDRAILS.md`, `docs/agents/AGENT_STANDARD.md` e todo o diretório do agente.

## Processo
1. Copiar `agents/_template` sem remover arquivos normativos.
2. Preencher missão e fora de escopo.
3. Propor capabilities pequenas e tipadas.
4. Classificar risco/permissões antes de implementar.
5. Definir adapters; evitar shell genérico.
6. Definir contratos, erros, timeout, idempotência e eventos.
7. Criar testes antes/junto da implementação.
8. Integrar Registry/Policy/Observability.
9. Executar DoD.

A IA MUST NOT criar atalhos agente->agente, hardcode de segredo, execução arbitrária de comandos ou bypass de aprovação para “facilitar” o MVP.
