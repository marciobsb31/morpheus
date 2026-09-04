# Padrão Oficial de Agentes Morpheus v1

Este documento é normativo. `MUST`, `SHOULD` e `MAY` indicam obrigação, recomendação e opção.

## 1. Modelo
Um agente é um executor especializado e descobrível. Ele MUST declarar capacidades; MUST aceitar apenas pedidos autorizados; MUST retornar estado verificável. O Core mantém intenção, planejamento e coordenação.

## 2. Identificação
`agent_id = morpheus.agent.<domain>.<name>`. IDs não mudam entre instâncias. `instance_id` identifica processo/dispositivo em runtime. Versões seguem SemVer.

## 3. Registro
No startup, o agente envia manifesto contendo identidade, versão, zona de execução, health, capabilities e requisitos. Registry valida duplicidade, compatibilidade e assinatura/identidade quando configurada.

## 4. Capability
Capability é a unidade pública de trabalho. Nome: `<domain>.<resource>.<action>`. Deve declarar schemas, risco, efeitos, idempotência, timeout, erros e permissões.

## 5. Execução
Fluxo padrão: Intent -> Plan -> Capability lookup -> Policy -> Approval (se necessário) -> Dispatch -> Agent -> Result -> Audit/Event -> Response. O agente não recebe liberdade para reinterpretar a intenção original além de parâmetros autorizados.

## 6. Segurança
Nenhum texto de LLM vira shell/SQL/PowerShell diretamente. Entradas são convertidas em parâmetros tipados e validados. Ações privilegiadas usam adapters allowlisted e Policy Engine.

## 7. Resiliência
Timeout é obrigatório. Retry automático exige idempotência ou chave de idempotência. Estados incertos devem ser reconciliados antes de nova execução.

## 8. Observabilidade
Toda execução é correlacionável. R2+ deve ser auditável. Logs são sanitizados.

## 9. Comunicação
Agentes não dependem diretamente de outros agentes. Coordenação usa Core/Event Bus e contratos versionados.

## 10. Conformidade
O checklist de `agents/_template/DEFINITION_OF_DONE.md` é obrigatório antes do status `ready`.
