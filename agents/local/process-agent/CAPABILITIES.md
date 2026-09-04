# Capabilities — Process Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `process.list` | Lista processos e consumo básico | low |
| `process.inspect` | Consulta detalhes de um processo | low |
| `process.stop` | Encerra processo permitido | high |
| `process.health` | Verifica saúde de processo registrado | low |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
