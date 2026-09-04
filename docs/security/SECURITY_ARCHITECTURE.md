# Arquitetura de Segurança

O Morpheus usa defesa em profundidade: identidade, autenticação, autorização por capability, policy-as-code, sandbox de ferramentas, aprovação humana, gestão de segredos, auditoria e observabilidade. Fronteiras de confiança existem entre UI↔Core, Core↔agentes, agentes↔SO/IoT, Core↔cloud e plugins↔runtime. Toda chamada atravessa uma fronteira autenticada e recebe contexto mínimo.
