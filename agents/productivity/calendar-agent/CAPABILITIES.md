# Capabilities — Calendar Agent

- `calendar.list-events`
- `calendar.get-event`
- `calendar.get-day-agenda`
- `calendar.check-availability`
- `calendar.create-event`
- `calendar.update-event`
- `calendar.cancel-event`

## Contrato
Cada capability deve declarar schema de entrada/saída, risco, timeout, idempotência, permissões, efeitos colaterais e códigos de erro. Parâmetros desconhecidos devem ser rejeitados.
