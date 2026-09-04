# Agentes Locais / Windows

Esta família executa capacidades no host Windows. O `windows-agent` representa capacidades gerais do SO; os demais são especializados para reduzir privilégios e blast radius. O `developer-environment-agent` é uma capacidade composta: ele descreve o perfil desejado e o Core planeja chamadas aos agentes necessários.

## Regra de composição
Nenhum agente local chama outro diretamente. Exemplo: `dev.profile.start` retorna/usa um plano coordenado pelo Core para `app.launch`, `process.health`, `display.window.arrange` e `notification.toast`.
