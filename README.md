# devcalc-api de um projeto de calculadora
alteracao feita com sucesso
tudo certo por aqui.
altercao de worflow dispatch

## Depuração do Workflow

Durante a configuração do CI, um erro proposital foi introduzido no step de geração do .jar, usando o comando exit 1 ou mvn packge com erro de digitação.

O erro foi detectado através da aba Actions no GitHub. Nela, foi possível:
- Ver o workflow que falhou.
- Expandir o job package.
- Analisar os logs do step com erro, onde a causa da falha foi claramente indicada.

Após identificar o erro, o comando incorreto foi corrigido no arquivo ci.yml, e um novo commit foi realizado. O pipeline voltou a passar com sucesso.

## Comparação entre Execução Manual e Automática do Pipeline

Foram realizadas duas execuções distintas do pipeline: uma acionada automaticamente por um push na branch main, e outra executada manualmente por meio do botão Run workflow na aba Actions do GitHub.

Ao acessar a aba Actions, foi possível aplicar filtros para visualizar separadamente as execuções por tipo de gatilho. As execuções automáticas exibem o rótulo push como evento de disparo, enquanto as manuais aparecem com o rótulo workflow_dispatch.

A principal diferença observada é que, na execução manual, o GitHub permite fornecer parâmetros interativos como run_tests e run_lint antes de iniciar o pipeline. Já a execução automática responde diretamente a eventos do repositório, sem intervenção do usuário. Ambas as execuções funcionam da mesma forma em termos de etapas e logs, mas a manual oferece maior controle sobre o que será executado.
