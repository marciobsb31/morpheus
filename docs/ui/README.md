# Morpheus UI — Visão Geral

A interface do Morpheus é um centro de comando pessoal, desktop-first, orientado a voz e contexto. A UI não executa automações diretamente: envia intenções ao Core, apresenta planos, aprovações, progresso e resultados.

## Princípios
- Voice-first, visual when useful.
- Informação progressiva: mostrar o essencial e revelar detalhes sob demanda.
- Estado sempre explícito: idle, listening, thinking, planning, awaiting-approval, executing, speaking, warning e offline.
- Segurança visível sem fricção desnecessária.
- Desktop nativo via Tauri + Vue 3/TypeScript; comunicação com Core por API/event stream.
