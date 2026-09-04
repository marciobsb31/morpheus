# Permissions — Notes Agent

| Capability | Classe | Regra mínima |
|---|---|---|
| `notes.create` | MUTATING | política + confirmação conforme contexto |
| `notes.update` | MUTATING | política + confirmação conforme contexto |
| `notes.tag` | MUTATING | política + confirmação conforme contexto |

Leituras também exigem escopo válido. O princípio é **least privilege**; tokens devem ser separados por provedor/ambiente quando possível.
