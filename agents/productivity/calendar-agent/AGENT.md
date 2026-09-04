# AGENT — Calendar Agent

## Identidade
- `agentId`: `calendar-agent`
- `version`: `0.1.0-spec`
- `executionZone`: `LOCAL_OR_CLOUD_CONNECTOR`
- `defaultTimeout`: 30s

## Responsabilidade
Consultar, criar, atualizar e acompanhar compromissos e disponibilidade em calendários autorizados.

## Limites
Não aprova a própria ação, não acessa provedores sem credencial autorizada, não registra conteúdo sensível integral em logs e não chama outro agente diretamente.

## Ciclo
1. Receber `ExecutionRequest`.
2. Validar schema, IDs e capability.
3. Validar escopo/credencial e política.
4. Executar adapter idempotente quando possível.
5. Verificar resultado/pós-condição.
6. Retornar `ExecutionResult` sanitizado.
7. Publicar evento de sucesso/falha.
