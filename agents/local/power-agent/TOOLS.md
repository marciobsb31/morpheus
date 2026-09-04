# Ferramentas e adaptadores — Power Agent

Prioridade de implementação: APIs oficiais do Windows/.NET/JNA ou bibliotecas mantidas; PowerShell apenas em scripts versionados, assináveis e parametrizados; Python somente quando trouxer vantagem clara de automação. Nunca concatenar entrada do usuário em shell.

Adaptadores ficam atrás de interfaces de domínio para permitir mocks e substituição futura. Toda ferramenta externa deve declarar versão mínima, timeout e estratégia de erro.
