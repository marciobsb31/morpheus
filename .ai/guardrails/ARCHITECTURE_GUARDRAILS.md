# Architecture Guardrails

- Core orquestra; agentes executam capabilities.
- Runtime Agents não se chamam diretamente.
- Integrações externas entram por adapters.
- UI nunca executa ações privilegiadas diretamente.
- LLM nunca é authority.
- Policy/Permission/Approval antecedem execução sensível.
- Toda execução recebe correlation id.
- Preferir monólito modular + workers antes de microserviços.
- Evolução para distribuição somente com evidência operacional.
