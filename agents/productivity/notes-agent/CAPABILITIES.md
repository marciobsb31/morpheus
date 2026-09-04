# Capabilities — Notes Agent

- `notes.search`
- `notes.read`
- `notes.create`
- `notes.update`
- `notes.tag`
- `notes.summarize`

## Contrato
Cada capability deve declarar schema de entrada/saída, risco, timeout, idempotência, permissões, efeitos colaterais e códigos de erro. Parâmetros desconhecidos devem ser rejeitados.
