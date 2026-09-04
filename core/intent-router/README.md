# Intent Router

Transforma voz, texto, UI ou eventos em uma intenção normalizada. A saída contém intenção, entidades, confiança, origem e necessidade de esclarecimento. Não executa ações.

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
