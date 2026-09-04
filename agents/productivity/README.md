# Morpheus — Productivity Agents

Esta família transforma intenções pessoais e profissionais em ações de produtividade auditáveis. Os agentes não conversam diretamente entre si: o **Morpheus Core** planeja, aplica políticas e coordena capacidades.

## Agentes

- Calendar Agent — agenda e disponibilidade.
- Tasks Agent — tarefas e prioridades.
- Reminder Agent — lembretes.
- Email Agent — leitura, resumo, rascunho e ações autorizadas.
- Contacts Agent — resolução de pessoas e destinatários.
- Notes Agent — conhecimento pessoal em notas.
- Meeting Agent — preparação e follow-up de reuniões.
- Routine Agent — rotinas compostas.

## Regra estrutural
Toda ação externa mutável deve passar por Policy/Permission Engine e, quando exigido pelo nível de risco, Approval Engine. Dados pessoais devem ser minimizados em logs e eventos.
