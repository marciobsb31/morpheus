# Intelligence Architecture

Fluxo de voz: `Microfone → Voice → STT → Core/Intent → Planner/Policy → Agent → Core → TTS`.

Fluxo cognitivo: `Core → Context Builder → Memory/Knowledge → LLM Gateway → resposta estruturada → validação → Core`.

O LLM nunca recebe credenciais de ferramentas e nunca executa diretamente comandos de SO, casa ou serviços externos. Tool execution passa pelo Core e Permission Engine.
