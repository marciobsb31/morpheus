# Permissions — Tasks Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `tasks.create` | MUTATING | política + confirmação conforme contexto |
| `tasks.update` | MUTATING | política + confirmação conforme contexto |
| `tasks.complete` | MUTATING | política + confirmação conforme contexto |
| `tasks.reschedule` | MUTATING | política + confirmação conforme contexto |
| `tasks.prioritize` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
