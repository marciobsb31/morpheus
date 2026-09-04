# Princípios de Engenharia

1. **Core orquestra; agentes executam.**
2. **Capability-first.** Funcionalidades são descritas como capacidades com entrada, saída, permissões e efeitos colaterais claros.
3. **Least privilege.** Nenhum agente recebe mais acesso do que precisa.
4. **Human-in-the-loop por risco.** Quanto maior o impacto, maior a exigência de confirmação.
5. **LLM não é autoridade.** Decisões de permissão e validações críticas são determinísticas.
6. **Idempotência quando possível.** Repetir uma solicitação não deve causar efeitos inesperados.
7. **Falhas são explícitas.** Não mascarar erro como sucesso.
8. **Observabilidade desde o início.** Correlação, logs estruturados e trilha de auditoria.
9. **Contratos antes de integração.** Eventos e APIs são versionados.
10. **Evolução incremental.** Começar como monólito modular/serviços locais bem definidos e extrair serviços somente por necessidade.
11. **Offline degradável.** Capacidades locais essenciais devem continuar quando a nuvem estiver indisponível, quando tecnicamente possível.
12. **Provider-agnostic.** Interfaces protegem o domínio de SDKs específicos.
