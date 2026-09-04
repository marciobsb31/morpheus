# Capabilities — Clipboard Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `clipboard.write` | Escreve texto no clipboard | low |
| `clipboard.read` | Lê clipboard quando explicitamente solicitado | medium |
| `clipboard.clear` | Limpa clipboard | low |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
