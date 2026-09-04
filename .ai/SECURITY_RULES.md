# Regras de Segurança para Desenvolvimento

1. Negar por padrão.
2. Segredos somente por secret store/variáveis protegidas.
3. Nunca registrar tokens, senhas, conteúdo sensível ou payload integral sem necessidade.
4. Toda capability declara permissões mínimas.
5. Ações de alto impacto exigem aprovação conforme política.
6. Texto produzido por LLM é dado não confiável.
7. Downloads, caminhos de arquivo e URLs devem ser validados.
8. PowerShell/admin somente por comandos previamente modelados.
9. Plugins são código não confiável até serem autorizados.
10. Toda elevação de privilégio deve ser visível e auditável.
