# Agent Security Baseline

Todo agente deve: operar com usuário/serviço de menor privilégio; usar allowlist; validar paths/URLs/argumentos; separar dados de instruções; proteger segredos; limitar rede; auditar ações relevantes; negar capability não declarada; respeitar deadline e cancelamento; não aceitar código arbitrário gerado por IA.

Agentes locais com acesso a SO são considerados fronteira crítica e devem preferir APIs/adapters específicos a shell genérico.
