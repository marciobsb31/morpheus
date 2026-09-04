# Docker Compose Strategy

A V1 usa Compose para PostgreSQL, RabbitMQ, Redis, observabilidade e serviços opcionais. Aplicações podem rodar fora dos containers em desenvolvimento para debugging. Perfis: `core`, `observability`, `ai-local`, `smart-home-dev`. Healthchecks e volumes nomeados são obrigatórios. Não armazenar credenciais reais no YAML.
