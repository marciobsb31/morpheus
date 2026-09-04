# Plugin Architecture

Plugins adicionam adapters/capabilities sem alterar o Core. Todo plugin declara manifest, versão, capabilities, permissões, eventos, dependências e healthcheck. Plugins são carregados somente após validação de assinatura/origem quando suportado e política de permissões.
