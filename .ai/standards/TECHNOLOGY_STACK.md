# Technology Stack — Morpheus V1

## Stack oficial
| Camada | Tecnologia | Regra |
|---|---|---|
| Core/orquestração | Java 21 LTS + Spring Boot 3.x | base oficial da V1; Java 25 somente após ADR e validação do ecossistema |
| Build JVM | Maven | multimódulo quando a implementação começar |
| Automação/IA auxiliar | Python 3.13+ | workers e adapters; não substitui o Core |
| Windows | PowerShell 7 + Python | usar APIs nativas antes de automação visual |
| Desktop UI | Vue 3 + TypeScript + Vite + Tauri 2 | UI sem autoridade direta de execução |
| API síncrona | REST/JSON | versionada; OpenAPI |
| Tempo real | WebSocket | estado, notificações e streaming de status |
| Eventos | RabbitMQ | event bus inicial; DLQ e retries obrigatórios |
| Cache/estado efêmero | Redis | nunca como única fonte de verdade |
| Banco principal | PostgreSQL | dados estruturados e auditoria |
| Vetores/RAG | pgvector | reduzir componentes na V1; migrar só via ADR |
| IA local | Ollama | provider intercambiável via LLM Gateway |
| IA cloud | adapters multi-provider | nenhum provider acoplado ao domínio |
| Smart Home | Home Assistant + MQTT | Home Assistant como gateway preferido |
| Containers | Docker + Docker Compose | desenvolvimento e VPS single-node |
| Observabilidade | OpenTelemetry + Prometheus + Grafana + Loki | correlação por trace/correlation id |
| CI/CD | GitHub Actions | pipeline padrão V1 |
| Java tests | JUnit 5 + Mockito + Testcontainers | integração real para infra crítica |
| Python tests | pytest | com mocks somente nas bordas |
| Front tests | Vitest + Playwright | unit/component + E2E |
| VCS | Git | trunk-based leve com PRs |

## Política de escolha
A stack é conservadora de propósito. Não adicionar Kafka, Kubernetes, Elasticsearch, MongoDB ou outro componente apenas porque é possível. Uma nova tecnologia precisa resolver requisito mensurável, reduzir risco ou atender escala comprovada.

## Abstrações obrigatórias
LLM, STT, TTS, storage vetorial, notificações externas, Smart Home e integrações SaaS devem ter ports/adapters para evitar lock-in.
