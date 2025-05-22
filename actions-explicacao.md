Explicação: Workflows e Actions no GitHub Actions

Diferença entre Workflows e Actions

- Workflow é o processo automatizado definido em um arquivo .yml que descreve quando e como certas tarefas 
devem ser executadas em seu repositório. Ele pode conter um ou mais jobs e é acionado por eventos como push, 
pull_request ou workflow_dispatch.

- Action é um bloco reutilizável de código que executa uma tarefa específica dentro de um workflow. 
Ela pode ser uma action oficial, criada pela comunidade ou personalizada. As actions ajudam 
a modularizar e reutilizar tarefas comuns, como fazer checkout do código, configurar o Java,
enviar artefatos, etc.

Estrutura Interna de uma Action

Uma action pode ser implementada de três formas:

    JavaScript action – executa scripts JavaScript.

    Docker action – executa dentro de um container Docker.

    Composite action – combina múltiplos passos definidos em YAML.

No diretório da action, o principal arquivo de definição é:
action.yml

Esse arquivo define:

    name: Nome da action.

    description: O que ela faz.

    inputs: Parâmetros que podem ser passados para a action.

    outputs: Valores retornados.

    runs: Como e o que a action executa.
