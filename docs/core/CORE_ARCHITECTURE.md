# Arquitetura do Morpheus Core

## Objetivo
Criar um núcleo local-first, modular e auditável capaz de coordenar agentes heterogêneos sem transformar o LLM em autoridade de execução.

## Fluxo síncrono
1. Gateway recebe entrada e cria IDs de rastreio.
2. Intent Router normaliza a solicitação.
3. Context Manager obtém somente o contexto necessário.
4. Planner cria um plano candidato.
5. Capability Registry valida que as capabilities existem.
6. Policy Engine avalia cada passo.
7. Approval Engine interrompe o plano quando houver confirmação necessária.
8. Agent Registry seleciona executor saudável e compatível.
9. Orchestrator executa e acompanha o plano.
10. Resultados viram eventos e uma resposta final.

## Fluxo assíncrono
Eventos externos e Scheduler entram pelo mesmo limite lógico e originam uma nova requisição rastreável. Eventos nunca recebem permissão implícita apenas por serem internos.

## Persistência sugerida
- PostgreSQL: configurações, planos, registros duráveis e auditoria indexável.
- Redis: cache/locks efêmeros quando necessário.
- RabbitMQ: transporte assíncrono inicial.
- Arquivos locais: configuração de desenvolvimento, nunca segredos commitados.

A escolha tecnológica final da implementação deve respeitar os ADRs e pode ser refinada antes do código.
