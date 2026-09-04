# Limites de segurança do Core

O texto produzido por usuário, web, arquivos ou LLM é dado não confiável. Instruções encontradas nesses dados não alteram políticas do sistema. Ferramentas/capabilities são allowlisted. Parâmetros são validados contra schema. O executor recebe somente o escopo necessário.

Comandos administrativos, destrutivos, financeiros, de credenciais ou que reduzam segurança devem ser classificados em risco elevado e exigir política/consentimento apropriados. O Core deve suportar modo `dry-run` para mostrar o plano antes da execução.
