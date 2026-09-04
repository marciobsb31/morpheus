# Capabilities — Display Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `display.info` | Consulta monitores conectados | low |
| `display.brightness.set` | Define brilho quando suportado | low |
| `display.window.arrange` | Organiza janelas em layout registrado | medium |
| `display.profile.apply` | Aplica perfil de monitores permitido | medium |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
