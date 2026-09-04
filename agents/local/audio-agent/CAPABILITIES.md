# Capabilities — Audio Agent

| Capability | Comportamento | Risco padrão |
|---|---|---|
| `audio.volume.set` | Define volume principal | low |
| `audio.volume.adjust` | Aumenta ou reduz volume | low |
| `audio.mute.toggle` | Alterna mudo | low |
| `audio.device.select` | Seleciona dispositivo de saída permitido | medium |

## Contrato
Capabilities usam nomes estáveis, parâmetros tipados e validação por allowlist. Uma mudança incompatível exige nova versão do contrato. `critical` exige aprovação explícita imediatamente anterior à execução, salvo política administrativa futura documentada em ADR.
