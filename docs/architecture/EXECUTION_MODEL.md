# Modelo de Execução

Estados mínimos de uma execução: `RECEIVED -> INTERPRETED -> PLANNED -> AUTHORIZED -> DISPATCHED -> RUNNING -> SUCCEEDED|FAILED|CANCELLED`.

Cada transição relevante registra timestamp e correlation ID. Planos podem conter passos sequenciais ou paralelos. Falha de um passo deve respeitar estratégia explícita: abortar, continuar, compensar ou pedir intervenção.

Ações com efeitos externos devem preferir chaves de idempotência quando o destino permitir.
