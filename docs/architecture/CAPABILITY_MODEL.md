# Modelo de Capabilities

Uma capability é a unidade oficial de ação do Morpheus.

Exemplo: `windows.app.open` recebe identificador permitido do aplicativo, argumentos estruturados opcionais e contexto de execução. Declara risco baixo, permissões necessárias, timeout e resultado esperado.

O Core escolhe capabilities; não escolhe scripts. O Agent resolve a capability para sua implementação concreta.
