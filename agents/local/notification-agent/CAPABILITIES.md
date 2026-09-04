# Capabilities — Notification Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `notification.toast` | Exibe toast nativo | low |
| `notification.overlay` | Exibe overlay temporário do Morpheus | low |
| `notification.progress` | Atualiza progresso de tarefa | low |
| `notification.dismiss` | Fecha notificação do Morpheus | low |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
