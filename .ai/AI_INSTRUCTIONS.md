# Instruções para Antigravity e outras IAs

## Comportamento esperado
- Leia contexto antes de gerar código.
- Não invente APIs, arquivos existentes ou resultados de testes.
- Quando faltar uma decisão, prefira uma interface/abstração mínima e documente a pendência.
- Preserve compatibilidade salvo requisito explícito.
- Explique mudanças de segurança e permissões no PR/changelog.

## Planejamento
Toda tarefa não trivial deve ser decomposta em: objetivo, pré-condições, alterações, testes, riscos e critérios de aceite.

## Uso de LLM dentro do Morpheus
LLMs podem interpretar intenção, resumir, classificar e sugerir planos. Não podem conceder permissões, validar identidade, manipular segredos diretamente nem transformar texto arbitrário em shell sem camada de comandos permitidos.

## Multi-IA
Arquivos do repositório são a fonte de verdade. Uma IA não deve depender de memória de outra IA. Decisões relevantes devem ser persistidas em documentação/ADR.
