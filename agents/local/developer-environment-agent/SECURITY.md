# Segurança — Developer Environment Agent

Ameaças principais: command injection, path traversal, execução de binário inesperado, privilege escalation, vazamento de clipboard/arquivos e confused deputy. Mitigações: parâmetros tipados, canonicalização de paths, allowlists por identificador, hash/assinatura quando aplicável, approval tokens, logs sem segredos, timeouts e fail-closed.

Ações destrutivas devem preferir alternativas reversíveis (ex.: lixeira em vez de exclusão permanente).
