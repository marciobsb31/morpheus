# Agent Registration Protocol

1. Agente inicia com configuração local segura.
2. Produz manifesto canônico.
3. Autentica-se perante o Registry quando o ambiente exigir.
4. Registry valida `agent_id`, versão, protocolo e capabilities.
5. Registry retorna `instance_id`, lease/heartbeat interval e políticas aplicáveis.
6. Agente publica readiness.
7. Heartbeats renovam lease.
8. Mudança de capability exige atualização de manifesto e nova validação.

Registro não concede permissão de execução: autorização é decidida por request pelo Policy Engine.
