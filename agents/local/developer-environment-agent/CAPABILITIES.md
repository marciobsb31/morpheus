# Capabilities — Developer Environment Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `dev.profile.start` | Solicita execução de um perfil de desenvolvimento | medium |
| `dev.profile.stop` | Solicita encerramento do perfil | medium |
| `dev.profile.status` | Consolida estado do ambiente | low |
| `dev.project.open` | Solicita abertura de projeto e ferramentas registradas | low |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
