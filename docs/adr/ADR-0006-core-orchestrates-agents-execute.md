# ADR-0006 — Core orquestra; agentes executam

**Status:** Aceito

## Contexto
Automação local e integrações possuem efeitos colaterais e permissões distintas. Colocar esses efeitos no Core aumentaria acoplamento e superfície de risco.

## Decisão
O Core interpreta, planeja, autoriza, seleciona e coordena. A execução concreta pertence a agentes/adapters registrados por capability.

## Consequências
O Core permanece testável e portátil; agentes podem evoluir independentemente. Há custo de contratos e comunicação explícita, considerado desejável.
