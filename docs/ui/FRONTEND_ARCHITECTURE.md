# Arquitetura Front-end

Recomendação: Vue 3 + TypeScript + Vite + Tauri. Organização por features e contratos tipados. Estado de servidor separado de estado visual. Event stream para progresso em tempo real.

A UI depende de interfaces do Core; não importa implementações de agentes. Adaptadores encapsulam REST/WebSocket/SSE.
