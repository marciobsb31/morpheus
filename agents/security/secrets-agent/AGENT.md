# Secrets Agent — Agent

## Identidade
- id: `morpheus.security.secrets-agent`
- domínio: security
- criticidade: alta

## Responsabilidade
intermedeia referências a segredos sem expor valores ao LLM ou agentes indevidos.

## Limites
Deny-by-default; sem segredos em payloads; decisões devem ser explicáveis e correlacionadas.
