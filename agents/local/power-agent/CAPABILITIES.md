# Capabilities — Power Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `power.lock` | Bloqueia estação | low |
| `power.sleep` | Suspende a estação | medium |
| `power.restart` | Reinicia o computador | critical |
| `power.shutdown` | Desliga o computador | critical |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
