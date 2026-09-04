# Permissions — Routine Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `routine.start` | MUTATING | política + confirmação conforme contexto |
| `routine.pause` | MUTATING | política + confirmação conforme contexto |
| `routine.resume` | MUTATING | política + confirmação conforme contexto |
| `routine.cancel` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
