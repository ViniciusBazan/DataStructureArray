# Estrutura de dados - A1 da universidade Anhembi Morumbi
----------------------

### Enunciado

----------------------

>Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios:
> - Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome de 25 alunos; 
> - Garantir que a estrutura seja totalmente preenchida.
> 
> Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.
>
> Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos conceitos de gerenciamento de memória.

----------------------

### Instruções ao professor

A resposta dissertativa a essa pergunta já foi entregue no formato PDF, esse repositório contém o projeto Java utilizado para criar a estrutura proposta do exércicio.

Ao abrir o arquivo do projeto na pasta _**src/arrayalunos/ArrayAlunos.java**_ você encontrará a chamada de duas funções no método main, são elas:

- **funcaoErrada()** - Feita para tentar alocar os 5 alunos dentro do array após inserir os 25 alunos iniciais, vai retornar o erro _**ArrayIndexOutOfBoundException**_

- **funcaoCerta()** - Utilizando ArrayList essa função vai conseguir lidar com um número desconhecido de alunos sendo inseridos

Deixei a função "funcaoErrada()" comentada, basta tirar o comentário para executar e ver ela falhando, enquanto a "funcaoCerta()" vai lidar com o problema de forma adequada.