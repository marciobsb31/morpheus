# Permissões — Windows Host Agent

## Princípio
Menor privilégio. O processo deve rodar como usuário comum por padrão. Elevação é excepcional, explícita e limitada à capability autorizada.

## Política
- `low`: pode executar se capability e recurso estiverem autorizados.
- `medium`: política contextual pode exigir confirmação.
- `high`: confirmação/approval token por padrão.
- `critical`: confirmação explícita, token de uso único e expiração curta.

Escopos de arquivos, aplicações, dispositivos e processos devem ser allowlists configuráveis.
