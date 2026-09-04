# Disaster Recovery

RPO/RTO iniciais são definidos por implantação pessoal, não por SLA empresarial. Prioridade: restaurar identidade/políticas, banco, Core, event bus e integrações. O desktop deve degradar graciosamente para capacidades locais quando a VPS falhar. Runbook de restore deve ser testado antes de considerar produção.
