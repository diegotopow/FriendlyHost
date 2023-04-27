# FriendlyHost

## Git tutorial for developers
(Tutorial)[https://www.youtube.com/watch?v=L1-2q-BPxWc&ab_channel=sdlinshub]

Realizando uma contribuição, usando o Pull Request.

1 - Fazer um FORK (Cópia do repositório na sua conta do github).

2 - usa o "git clone" na cópia que foi feito com o FORK, para utilizar e modificar o código na sua máquina. 

 3 - Geralmente, é indicado ( não sendo obrigatório) criar uma branch para realizar o procedimento que precisa fazer, usando "git branch <nome da branch>".
uso o "git checkout <nome da branch>" para entrar na branch. -> Melhor organização na hora de realizar o push e pull request. 

4 - Abrindo o arquivo na IDE para realizar melhorias, resolver bugs etcc. Feito o que tinha que fazer, podemos usar o "git  add ." para adicionar os arquivos no staging, usa o " git commit -m "mensagem" ".
 
5 - Use o "git log" para listar os últimos commits e as branchs que foram comitadas. Se acostume a fazer isso para sempre visualizar o que está fazendo, use também o "git status" após cada comando para se localizar sempre e saber o que precisa fazer em sequencia.

6 - Use o "git push -u origin <nome da branch>" para enviar a branch ao repositorio no github(cópia que foi feito com FORK) . (Usando parametro "-u" pois ainda não temos essa branch no repositório do github, ou seja, caso seja necessario fazer um novo commit nessa branch, basta usar o "git push origin"). 

7 - Após o push, vai aparecer no git hub que a branch enviada é um candidato a realizar um pull request, esse repositório filho tem essa branch que o repositório pai não tem. Vai aparecer um botão "Compare & pull request", quando clicar ele irá até o repositório PAI para realizar um pull request. Vai pedir para dar um título e explicar o pq está fazendo esse pull request, após clicar em "Create pull request", a pessoa dona do projeto (repositório PAI) irá analisar o código e fazer um code review. Se estiver tudo ok, e for aprovado será feito um merge ou seja, todas as alterações feitas no repositório filho, fará parte do repositório pai.

Ao decorrer que for feito novos commits nessa branch criada, não se faz necessário realizar um novo pull request, os commits ficarão no pull request já criado até a aprovação e realização do merge por parte do repositório pai.
