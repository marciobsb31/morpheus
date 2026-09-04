# Permissions — <agent-name>

Princípio: menor privilégio possível.

| Capability | Recurso | Privilégio | Risco | Aprovação | Observação |
|---|---|---|---|---|---|
| `<capability>` | `<resource>` | `<permission>` | `R?` | `<policy>` | |

## Regras
- R0: leitura/ação sem efeito relevante; normalmente automática.
- R1: efeito local reversível; pode ser automático conforme política.
- R2: alteração relevante; confirmação contextual pode ser exigida.
- R3: alto impacto, privilégio elevado, exclusão ou exposição; aprovação explícita.
- R4: ação proibida por política ou fora do escopo; negar.

Documente permissões de SO, rede, arquivos, APIs, dispositivos e credenciais separadamente.
