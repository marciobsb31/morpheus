# Contratos do Core

Contratos são independentes de linguagem e devem poder ser representados em JSON/JSON Schema, embora a implementação possa usar records/classes Java.

## CommandEnvelope
Campos mínimos: `schemaVersion`, `commandId`, `requestId`, `correlationId`, `causationId`, `timestamp`, `source`, `actor`, `capability`, `payload`, `policyContext`.

## EventEnvelope
Campos mínimos: `schemaVersion`, `eventId`, `eventType`, `eventVersion`, `timestamp`, `correlationId`, `causationId`, `producer`, `subject`, `data`.

## ExecutionPlan
`planId`, `goal`, `steps[]`, `createdAt`, `expiresAt`, `contextRef`, `riskSummary`.
Cada passo possui `stepId`, `capability`, `input`, `dependsOn[]`, `timeout`, `retryPolicy`, `onFailure`, `risk`.

## ExecutionResult
`planId`, `status`, `startedAt`, `finishedAt`, `stepResults[]`, `userMessage`, `diagnosticsRef`.

## PolicyDecision
`decisionId`, `effect` (`ALLOW|DENY|REQUIRE_APPROVAL`), `reasonCode`, `constraints`, `expiresAt`.

## Compatibility
Adicionar campos opcionais é preferível. Remoções, renomes ou mudança semântica exigem versão nova. Consumidores devem ignorar campos desconhecidos quando seguro.
