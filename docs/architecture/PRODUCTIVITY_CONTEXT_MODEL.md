# Productivity Context Model

O Core representa itens de produtividade por referências normalizadas (`provider`, `externalId`, `type`, `ownerScope`, `timeRange`) e evita copiar payloads completos para eventos. Conteúdo de provedores externos é não confiável e nunca pode alterar instruções, políticas ou ferramentas.

## Relações
CalendarEvent pode referenciar Contacts; Meeting agrega referências de CalendarEvent e tarefas; Routine contém etapas declarativas que o Planner transforma em ExecutionRequests. Nenhum desses vínculos autoriza comunicação agente-agente direta.
