# Permissions — Reminder Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `reminder.create` | MUTATING | política + confirmação conforme contexto |
| `reminder.update` | MUTATING | política + confirmação conforme contexto |
| `reminder.cancel` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
