# Permissions — Calendar Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `calendar.create-event` | MUTATING | política + confirmação conforme contexto |
| `calendar.update-event` | MUTATING | política + confirmação conforme contexto |
| `calendar.cancel-event` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
