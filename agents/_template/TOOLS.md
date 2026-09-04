# Tools & Integrations — <agent-name>

Para cada ferramenta/integrador declare:
- nome e finalidade;
- versão mínima;
- execução local/cloud;
- autenticação necessária;
- timeout/retry;
- limites/rate limits;
- dados acessados;
- comportamento offline;
- alternativa/fallback.

Ferramentas são mecanismos; não são capabilities. O agente deve encapsular detalhes do fornecedor atrás de adapters.
