# Contexto do Sistema

## Atores
- Usuário principal.
- Morpheus UI/voz.
- Morpheus Core.
- Agentes locais/remotos.
- Serviços externos (calendário, e-mail, IoT, LLMs).

## Fluxo conceitual
`User -> Input -> Core -> Intent/Plan -> Policy -> Capability -> Agent -> Tool/External System -> Result -> Core -> User`

Eventos de contexto podem iniciar o fluxo sem comando explícito, mas políticas de proatividade limitam quando o sistema pode agir sozinho.

## Fronteira de confiança
O Local Node é privilegiado, porém ainda aplica least privilege. Serviços externos, plugins, conteúdo web e saídas de LLM são tratados como não confiáveis.
