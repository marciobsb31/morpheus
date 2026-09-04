# Agent Communication Rules

- Comandos síncronos: adequados para ações curtas e resposta imediata.
- Eventos: fatos e notificações desacopladas.
- Jobs assíncronos: ações longas com status consultável/cancelável.

Não há chamada agente->agente como dependência de negócio. Se A precisa de resultado de B, o Planner cria etapas e o Core coordena.

Todos os transportes propagam correlação, deadline e identidade do ator. O contrato lógico deve sobreviver à troca REST <-> mensageria.
