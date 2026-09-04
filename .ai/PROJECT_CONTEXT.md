# Contexto Mestre do Projeto

## Produto
Morpheus é um assistente pessoal AI-First, multimodal e extensível. Seu papel é converter linguagem natural e eventos de contexto em ações coordenadas por agentes.

## Topologia alvo
- **Local:** Core/Node local, Windows Agent, UI desktop, automações e integrações que exigem acesso à máquina.
- **Remoto opcional:** notificações, webhooks, tarefas 24/7 e integrações que precisam permanecer online.
- **IA:** gateway abstrato para modelos locais e cloud; modelos não devem acessar diretamente recursos privilegiados.

## Stack preferencial inicial
- Core e regras: Java + Spring Boot.
- Automação Windows: PowerShell e Python atrás de interfaces controladas.
- UI: Vue + Tauri como direção preferencial, sujeita a ADR na fase de implementação.
- Eventos: RabbitMQ quando assíncrono/distribuído trouxer benefício; chamadas internas diretas são válidas dentro do monólito modular.
- Persistência: PostgreSQL para dados duráveis; armazenamento local leve pode ser usado para estado local conforme ADR.

## Prioridades
1. Segurança.
2. Confiabilidade.
3. Experiência simples.
4. Extensibilidade.
5. Performance.
6. Sofisticação visual.
