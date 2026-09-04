# Development Agents

Os Development Agents existem para construir o Morpheus. Eles não são Runtime Agents e não participam da execução diária do assistente.

Hierarquia: `Morpheus Architect` governa arquitetura e decisões transversais; arquitetos especializados propõem e revisam decisões de seu domínio; Test Engineer valida qualidade; Code Reviewer verifica aderência e regressões.

Nenhum Development Agent pode aprovar sozinho uma mudança de stack. Toda mudança estrutural relevante deve ser registrada por ADR.
