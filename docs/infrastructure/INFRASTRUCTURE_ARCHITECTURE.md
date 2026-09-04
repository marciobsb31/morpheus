# Infrastructure Architecture

## Objetivo
Suportar primeiro desenvolvimento local e uma implantação híbrida simples: computador pessoal executando capabilities locais e uma VPS opcional mantendo serviços 24x7.

## Topologia V1
- **Desktop/Edge:** Morpheus Desktop, Windows/Local Agents, Voice local quando configurado.
- **Core Node:** Spring Boot Core, PostgreSQL, RabbitMQ, Redis e gateway de IA.
- **Home Edge:** Home Assistant/MQTT, preferencialmente na rede local.
- **VPS opcional:** endpoint remoto, scheduler 24x7, notificações e integrações que precisam disponibilidade contínua.

## Restrições
Nenhuma porta administrativa deve ficar pública. Comunicação remota usa TLS e autenticação forte. Serviços internos ficam em rede privada de containers. Banco, RabbitMQ e Redis não são expostos à internet.
