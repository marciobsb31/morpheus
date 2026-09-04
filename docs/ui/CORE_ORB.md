# Morpheus Core Orb

Representação visual do estado do assistente. Estados: `idle`, `listening`, `thinking`, `planning`, `awaiting-approval`, `executing`, `speaking`, `warning`, `offline`.

Animações devem comunicar estado sem depender apenas de cor. O Orb nunca deve sugerir que uma ação foi concluída antes do `ExecutionResult` confirmado pelo Core.
