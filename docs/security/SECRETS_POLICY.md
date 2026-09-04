# Política de Segredos

Segredos nunca entram em Git, prompt persistido, screenshot de diagnóstico ou log. Em desenvolvimento, usar mecanismo local apropriado/variáveis protegidas. Em produção, usar secret manager compatível. Rotação e revogação devem ser possíveis sem recompilar o sistema.
