# Entrega 05 — Produtividade e Vida Pessoal

## Objetivo
Adicionar a família de agentes que administra agenda, tarefas, lembretes, comunicação, notas, reuniões e rotinas sem quebrar o modelo capability-driven do Morpheus.

## Escopo
Oito agentes: Calendar, Tasks, Reminder, Email, Contacts, Notes, Meeting e Routine.

## Fluxo de referência — “prepare meu dia”
1. Core interpreta a intenção.
2. Planner consulta Calendar, Tasks e Reminder por capabilities somente de leitura.
3. Meeting Agent pode preparar briefs para reuniões próximas.
4. Core consolida o contexto e apresenta um plano.
5. Qualquer criação, envio ou alteração posterior passa por Policy/Approval.

## Princípio de privacidade
Informações recuperadas de contas pessoais são contexto temporário por padrão. Persistência em memória exige finalidade explícita e política de retenção.
