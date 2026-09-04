# Capacity and Scaling

A V1 prioriza vertical scaling e separação de workers antes de Kubernetes. Métricas que justificam evolução: CPU/memória sustentadas, backlog de fila, latência P95/P99, throughput e isolamento de falhas. Kafka/Kubernetes/cluster só entram após ADR baseado em dados reais.
