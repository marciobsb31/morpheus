# Glossário

- **Core:** núcleo responsável por interpretar, planejar, autorizar, delegar e consolidar resultados.
- **Agente:** componente especializado que oferece capacidades ao Core.
- **Capability:** operação declarada que um agente sabe executar.
- **Intent:** intenção normalizada derivada da solicitação do usuário.
- **Plan:** conjunto ordenado/dependente de passos para satisfazer uma intenção.
- **Tool:** mecanismo concreto usado por um agente (PowerShell, API, Python, etc.).
- **Event Bus:** meio de publicação/consumo de eventos assíncronos.
- **Agent Registry:** catálogo de agentes disponíveis e sua saúde.
- **Capability Registry:** catálogo consultável de capacidades.
- **Approval:** consentimento explícito exigido por uma política.
- **Policy Engine:** componente determinístico que decide se uma ação pode prosseguir.
- **Local Node:** processo/host sob controle do usuário, normalmente Windows.
- **Remote Node:** infraestrutura opcional 24/7, como VPS.
- **Plugin:** extensão instalada que adiciona integração ou capacidade sem alterar o Core.
- **Correlation ID:** identificador que conecta intenção, plano, comandos, eventos e logs.
