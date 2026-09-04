# Database Standards

PostgreSQL é source of truth. Migrações versionadas, constraints no banco, índices guiados por consulta, timestamps UTC, soft-delete somente quando houver requisito, auditoria imutável quando aplicável e pgvector isolado por schema/tabela de conhecimento. Dados sensíveis têm retenção e criptografia definidas.
