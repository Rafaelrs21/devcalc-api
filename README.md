# devcalc-api de um projeto de calculadora
alteracao feita com sucesso
tudo certo por aqui.
altercao de worflow dispatch

## Depuração do Workflow

Durante a configuração do CI, um erro proposital foi introduzido no step de geração do .jar, usando o comando exit 1 ou mvn packge com erro de digitação.

O erro foi detectado através da aba **Actions** no GitHub. Nela, foi possível:
- Ver o workflow que falhou.
- Expandir o job package.
- Analisar os logs do step com erro, onde a causa da falha foi claramente indicada.

Após identificar o erro, o comando incorreto foi corrigido no arquivo `ci.yml`, e um novo commit foi realizado. O pipeline voltou a passar com sucesso.
