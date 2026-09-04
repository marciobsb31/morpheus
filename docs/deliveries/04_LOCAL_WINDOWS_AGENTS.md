# Entrega 04 — Agentes Locais e Windows

## Objetivo
Aplicar o padrão da Entrega 03 à primeira família concreta de agentes do Morpheus. Esta entrega é specification-first: define contratos, responsabilidades, riscos, testes e backlog para implementação posterior pelo Antigravity/IDE.

## Agentes
`windows-agent`, `app-agent`, `file-agent`, `process-agent`, `power-agent`, `audio-agent`, `display-agent`, `clipboard-agent`, `notification-agent` e `developer-environment-agent`.

## Primeiro cenário vertical
**“Morpheus, iniciar meu ambiente de desenvolvimento.”** O Core interpreta a intenção, o Planner resolve um perfil configurado, o Policy Engine avalia ações e o Orchestrator envia requests aos agentes apropriados. O Morpheus não deve depender de automação de mouse/teclado quando houver API ou mecanismo determinístico.

## Fora de escopo desta entrega
Código executável de produção, credenciais reais, bypass de UAC, execução arbitrária de PowerShell e automações destrutivas sem aprovação.
