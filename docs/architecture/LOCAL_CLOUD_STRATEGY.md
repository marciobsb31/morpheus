# Estratégia Local + Cloud

## Local por padrão
Controle do Windows, arquivos, processos, áudio, display, clipboard e outras capacidades que dependem da sessão do usuário.

## Remoto opcional
Webhooks, notificações fora de casa, monitoramentos 24/7 e integrações que precisam permanecer disponíveis quando o PC está desligado.

## Regra
Nenhuma credencial privilegiada do Windows deve ser enviada à VPS. O nó remoto solicita capacidades por canal autenticado; o nó local aplica novamente políticas antes de executar.
