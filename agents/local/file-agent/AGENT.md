# AGENT — File Agent

## Identidade
- `agentId`: `file-agent`
- `version`: `0.1.0-spec`
- `executionZone`: `LOCAL_WINDOWS`
- `defaultTimeout`: 30s

## Responsabilidade
Opera arquivos e diretórios dentro de escopos explicitamente autorizados.

## Limites
Não possui autoridade para alterar políticas do Core, aprovar a própria ação, armazenar segredos em texto puro ou ampliar seu próprio escopo. Deve falhar fechado quando uma autorização não puder ser comprovada.

## Ciclo de execução
1. Receber `ExecutionRequest`.
2. Validar contrato e correlation/trace IDs.
3. Confirmar capability suportada.
4. Validar parâmetros e precondições.
5. Consultar decisão de política anexada/serviço autorizado.
6. Executar adaptador nativo.
7. Verificar pós-condição quando aplicável.
8. Retornar `ExecutionResult` e publicar eventos de domínio.
