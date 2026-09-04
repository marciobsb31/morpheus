# Environments

- **dev:** execução local e fixtures.
- **test:** efêmero, criado em CI.
- **stage:** replica políticas e integrações de produção com credenciais isoladas.
- **prod:** dados reais, backups, alertas, TLS e acesso restrito.

Configuração deve ser externa à aplicação; código é o mesmo entre ambientes.
