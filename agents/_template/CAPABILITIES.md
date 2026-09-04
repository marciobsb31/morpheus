# Capabilities — <agent-name>

Cada capability deve usar nome estável `domain.resource.action`.

## Template
### `<domain>.<resource>.<action>`
- **Descrição:**
- **Risk level:** `R0|R1|R2|R3|R4`
- **Requires approval:** `yes|no|conditional`
- **Idempotent:** `yes|no`
- **Timeout:**
- **Preconditions:**
- **Input schema:** campos, tipos, obrigatoriedade e limites.
- **Output schema:** resultado estruturado.
- **Side effects:**
- **Compensation/rollback:**
- **Errors:** códigos estáveis.
- **Examples:** pelo menos um sucesso e uma falha.

## Compatibilidade
Mudanças incompatíveis exigem nova major version da capability/contrato. Campos opcionais podem ser adicionados sem quebrar consumidores.
