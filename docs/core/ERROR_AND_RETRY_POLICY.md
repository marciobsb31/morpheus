# Política de erros, timeout e retry

Retries só são automáticos para operações classificadas como seguras/idempotentes ou protegidas por chave de idempotência. Usar backoff exponencial com jitter no adapter de infraestrutura. Erros são classificados em `VALIDATION`, `POLICY`, `AUTH`, `DEPENDENCY`, `TIMEOUT`, `CONFLICT`, `UNAVAILABLE`, `INTERNAL`.

Ações destrutivas não são repetidas cegamente. Após ambiguidade de resultado, o executor deve consultar estado antes de tentar novamente. Dead-letter é usada para mensagens que excederem a política de tentativas, preservando contexto de diagnóstico sem segredos.
