# Modelo de Eventos

Eventos representam fatos, não ordens. Ex.: `calendar.meeting.starting.v1`.

Envelope conceitual: `eventId`, `eventType`, `version`, `occurredAt`, `correlationId`, `causationId`, `producer`, `payload`.

Consumidores devem tolerar reentrega. Eventos públicos são versionados. Dados sensíveis não devem ser colocados no broker sem necessidade e proteção apropriada.
