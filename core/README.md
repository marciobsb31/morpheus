# Morpheus Core

O Morpheus Core é o núcleo de coordenação da plataforma. Ele recebe solicitações do usuário ou eventos do sistema, determina intenção e contexto, constrói um plano, aplica políticas e permissões, seleciona capabilities e agentes, acompanha a execução e produz uma resposta consolidada.

## Regra central
O Core **orquestra; não automatiza diretamente o sistema operacional, a casa, e-mail ou serviços externos**. Efeitos colaterais pertencem aos agentes/adapters autorizados.

## Pipeline de referência
`Input -> Intent Router -> Context Manager -> Planner -> Policy Engine -> Approval Engine -> Capability/Agent Registry -> Orchestrator -> Event Bus -> Agent -> Result -> Orchestrator -> Response`

## Módulos
- `intent-router`: normaliza entrada e identifica intenção.
- `context-manager`: monta contexto mínimo necessário.
- `planner`: converte objetivo em plano executável.
- `policy-engine`: avalia risco, permissão e restrições.
- `approval-engine`: obtém consentimento quando necessário.
- `capability-registry`: catálogo do que o sistema sabe fazer.
- `agent-registry`: catálogo e saúde dos executores.
- `orchestrator`: coordena execução e compensações.
- `scheduler`: agenda execuções futuras/recorrentes.
- `event-bus`: transporte assíncrono e desacoplamento.
- `contracts`: envelopes e contratos compartilhados.

## Invariantes
1. Toda ação tem `correlationId` e `requestId`.
2. Nenhum comando de risco alto é executado sem a política apropriada.
3. LLMs podem propor planos, mas não ignoram o Policy Engine.
4. Agentes não ganham permissões implicitamente.
5. Falhas são explícitas, auditáveis e idempotentes quando possível.
6. O Core deve funcionar com provedores de IA substituíveis.
