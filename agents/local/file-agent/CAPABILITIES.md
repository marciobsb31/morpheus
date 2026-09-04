# Capabilities — File Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `file.search` | Pesquisa arquivos por nome/metadados | low |
| `file.open` | Abre arquivo com aplicativo padrão | low |
| `file.move` | Move arquivo dentro de raízes permitidas | medium |
| `file.delete` | Move arquivo para lixeira quando possível | high |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
