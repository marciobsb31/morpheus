# Modelo de Autorização

RBAC pode agrupar papéis, mas a autorização efetiva é capability-based com atributos contextuais. Exemplo: `windows.app.open` pode ser LOW; `windows.power.shutdown` HIGH; `file.delete.recursive` CRITICAL dependendo do alvo. Permissões são explícitas, revogáveis e auditáveis.
