# Modelo de Componentes

## Componentes planejados
- Input Gateway: voz, texto e eventos.
- Intent Router: normaliza intenção.
- Planner: decompõe objetivos em passos.
- Policy/Approval Engine: autoriza ações.
- Agent Registry: descoberta e saúde.
- Capability Registry: catálogo operacional.
- Executor/Orchestrator: agenda passos e acompanha estado.
- Event Bus: eventos assíncronos.
- Context Manager: contexto de sessão.
- Memory: persistência contextual controlada.
- Notification Gateway: feedback ao usuário.
- Audit/Telemetry: rastreabilidade.

A implementação física desses componentes pode começar no mesmo processo e ser separada posteriormente.
