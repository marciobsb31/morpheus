# Segurança da Interface

Sem execução arbitrária de shell pelo front-end. Sanitizar conteúdo externo e tratar texto vindo de e-mail/web/LLM como não confiável. CSP restritiva, IPC Tauri allowlist, nenhum segredo no bundle, logs sem credenciais e confirmação forte para ações críticas.
