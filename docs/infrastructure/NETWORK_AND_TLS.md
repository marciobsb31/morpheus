# Network and TLS

TLS para tráfego externo. mTLS pode ser adotado entre nós remotos se o modelo operacional justificar. Firewall permite apenas portas necessárias. PostgreSQL/RabbitMQ/Redis permanecem privados. Reverse proxy termina TLS na VPS. Tokens curtos, rotação e revogação devem ser suportados.
