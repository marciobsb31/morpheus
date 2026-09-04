# Morpheus V1

Morpheus é uma plataforma AI-First de assistente pessoal e automação, projetada para operar de forma híbrida: capacidades sensíveis e físicas permanecem locais; serviços que precisam disponibilidade contínua podem ser executados em uma VPS opcional.

Este repositório é a **especificação canônica da V1** e consolida as Entregas 01–10. Ele foi estruturado para ser aberto no IntelliJ e utilizado por Google Antigravity, Claude, Gemini ou outras IAs de engenharia sem que cada modelo reinvente a arquitetura.

## Comece aqui
Uma IA deve iniciar por `.ai/BOOTSTRAP.md`. Um humano deve ler `VISION.md`, `PROJECT_STRUCTURE.md`, `.ai/standards/TECHNOLOGY_STACK.md` e `docs/roadmap/MORPHEUS_V1_RELEASE_PLAN.md`.

## Arquitetura em uma frase
**Core orquestra → Policy/Permission/Approval autorizam → Agents executam → Audit registra → UI observa e interage.**

## Stack V1
Java 21 + Spring Boot, Python 3.13+, PowerShell 7, Vue 3 + TypeScript + Tauri 2, PostgreSQL + pgvector, RabbitMQ, Redis, Docker Compose, Home Assistant/MQTT e OpenTelemetry/Prometheus/Grafana/Loki.

## Princípio AI-First
Development Agents possuem regras próprias em `.ai/development-agents/`. Nenhuma IA pode mudar a stack, boundaries ou políticas silenciosamente; decisões arquiteturais exigem ADR.

## Status
Documentação/arquitetura V1 concluída. Próximo marco: implementação vertical do Core mínimo + Windows Agent + UI mínima.
