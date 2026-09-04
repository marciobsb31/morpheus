# Guardrails de Arquitetura

## Obrigatórios
- Core conhece contratos/capabilities, não detalhes de ferramentas.
- Agentes registram identidade, versão, capacidades, permissões e health status.
- Comunicação agente→agente direta é proibida por padrão; coordenação passa pelo Core ou por eventos definidos.
- Integrações externas ficam atrás de adapters.
- Domínio não depende de SDK de fornecedor.
- Comandos possuem `correlationId`, origem e contexto de autorização.
- Timeouts, retry limitado e tratamento de indisponibilidade são explícitos.

## Evitar
- Shared database entre módulos como mecanismo de integração.
- God service/orchestrator com lógica específica de cada ferramenta.
- Filas para tudo: eventos só quando desacoplamento/assincronia justificarem.
- Microsserviços prematuros.
- Reflection/dynamic execution para contornar contratos.

## Dependências
Preferir direção: `domain <- application <- adapters/infrastructure`. O domínio deve permanecer testável sem Windows, rede, broker ou LLM.
