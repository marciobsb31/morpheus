# Observabilidade do Core

Todos os módulos produzem logs estruturados e métricas. Propagar `requestId`, `correlationId`, `causationId`, `planId`, `stepId` e `agentId` quando existentes. Nunca registrar tokens, senhas, conteúdo sensível integral ou chaves.

Métricas iniciais: latência por módulo/capability, taxa de sucesso, negações de política, aprovações pendentes, timeouts, retries, agentes saudáveis, profundidade de fila e planos por estado. Tracing distribuído deve poder ser habilitado via OpenTelemetry.
