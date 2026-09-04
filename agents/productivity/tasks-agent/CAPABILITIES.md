# Capabilities — Tasks Agent

- `tasks.list`
- `tasks.get`
- `tasks.create`
- `tasks.update`
- `tasks.complete`
- `tasks.reschedule`
- `tasks.prioritize`

## Contrato
Cada capability deve declarar schema de entrada/saída, risco, timeout, idempotência, permissões, efeitos colaterais e códigos de erro. Parâmetros desconhecidos devem ser rejeitados.
