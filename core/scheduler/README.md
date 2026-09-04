# Scheduler

Representa execuções futuras e recorrentes. Persiste definição, próxima execução, timezone, política de atraso e estado. Ao vencer, publica uma solicitação normal ao Core; não chama agentes diretamente.

## Responsabilidades
- Expor uma interface interna pequena e versionável.
- Emitir telemetria estruturada com `correlationId`.
- Rejeitar entradas inválidas antes de executar lógica de negócio.
- Não assumir detalhes de implementação de outros módulos.

## Não responsabilidades
- Não contornar Policy/Approval Engine.
- Não armazenar segredos em texto puro.
- Não acoplar o domínio a um provedor específico de LLM, fila ou banco.

## Contratos
Os contratos canônicos ficam em `core/contracts/`. Mudanças incompatíveis exigem ADR e nova versão do contrato.

## Testes mínimos
Unitários para regras; integração para contratos; cenários de timeout, duplicidade, indisponibilidade e negação de permissão.
