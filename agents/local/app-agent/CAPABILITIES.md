# Capabilities — Application Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `app.launch` | Inicia uma aplicação registrada | low |
| `app.close` | Solicita encerramento gracioso de aplicação | medium |
| `app.focus` | Traz uma janela de aplicação para frente | low |
| `app.list` | Lista aplicações/processos elegíveis | low |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
