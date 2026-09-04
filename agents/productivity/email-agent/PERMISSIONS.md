# Permissions — Email Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `email.send` | MUTATING | política + confirmação conforme contexto |
| `email.archive` | MUTATING | política + confirmação conforme contexto |
| `email.label` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
