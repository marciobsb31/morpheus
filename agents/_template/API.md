# Agent API — <agent-name>

O transporte pode mudar; o contrato lógico não.

## Operações mínimas
- `register(manifest)` — registra instância e capabilities.
- `health()` — liveness/readiness e dependências.
- `execute(request)` — executa capability autorizada.
- `cancel(request_id)` — solicita cancelamento quando suportado.
- `describe()` — retorna manifesto e versões.

## Semântica
`execute` deve ser assíncrono quando a operação puder exceder o timeout interativo. Toda chamada carrega `correlation_id`. Erros usam códigos documentados e nunca stack trace bruto como contrato público.
