# Threat Model Inicial

## Ativos
Sessão Windows, arquivos, credenciais, calendário/e-mail, dispositivos IoT, histórico e memória do assistente.

## Ameaças principais
Prompt injection; execução arbitrária; plugin malicioso; roubo de token; abuso de nó remoto; escalada de privilégio; exfiltração por logs; replay de comando; automação incorreta causada por alucinação.

## Controles
Separação LLM/policy, allowlists, schemas, autenticação mútua quando aplicável, expiração/replay protection, secret store, auditoria, aprovação por risco e sandbox para extensões quando possível.
