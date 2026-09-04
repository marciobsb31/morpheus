# Padrões de Código

## Geral
- Código e identificadores técnicos em inglês; documentação de produto pode permanecer em português.
- Funções pequenas e responsabilidade única.
- Configuração externa; nenhum segredo hardcoded.
- Erros de domínio tipados; não usar exceção genérica como fluxo normal.
- Datas/horas internamente com timezone explícito; apresentação no fuso do usuário.

## Java
- Java LTS suportado pelo projeto no momento da implementação.
- Spring Boot apenas nas bordas; domínio sem anotações de framework quando possível.
- Records/value objects para contratos imutáveis quando adequado.
- Testes unitários rápidos; integração para adapters.

## Python/PowerShell
- Scripts não são API pública. Devem ser encapsulados por adapters.
- Argumentos validados por allowlist/estrutura; nunca concatenar shell a partir de linguagem natural.
- Retorno estruturado e códigos de saída documentados.
