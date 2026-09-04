# Capabilities — Windows Host Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `windows.session.lock` | Bloqueia a sessão atual | low |
| `windows.session.status` | Consulta usuário, sessão e estado do host | low |
| `windows.settings.open` | Abre uma página segura de Configurações do Windows | low |
| `windows.shell.safe_command` | Executa somente comandos allowlisted e parametrizados | high |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
