# Agent Lifecycle

## Estados
- `DISCOVERED`: configuração encontrada, ainda não confiável.
- `REGISTERING`: manifesto em validação.
- `READY`: apto a receber trabalho.
- `BUSY`: capacidade/concurrency ocupada.
- `DEGRADED`: funciona parcialmente; capabilities afetadas devem ser marcadas indisponíveis.
- `OFFLINE`: sem heartbeat/readiness.

## Transições
Startup leva a REGISTERING; registro válido leva a READY. Falha parcial leva a DEGRADED. Heartbeat expirado leva a OFFLINE. Recuperação exige novo health/registro conforme política.

O Registry não deve rotear para OFFLINE e deve considerar capability-level health em DEGRADED.
