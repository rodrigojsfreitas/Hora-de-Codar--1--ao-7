
# Hora de Codar 5: O Troco

### No mundo do desenvolvimento o pensamento crítico é a parte mais importante. Com um pensamento apurado, você consegue fazer melhores perguntas, ser mais assertivo nas ações e no desenvolvimento.
<br> 

### Exatamente por isso, mantenha muita atenção no que é solicitado abaixo. Pense com cuidado, planeje e execute. Dessa vez, vocês estão alterando um código pronto e aplicando sua visão. 
### Mantenha na cabeça que qualquer alteração não vai quebrar o mundo... Então experimente tudo o que quiser experimentar. Brinque bastante e altere tudo o que quiser alterar. 
<br>

### Com o projeto de ajustes e melhorias de um caixa eletrônico, por exemplo, encontramos algumas questões que são muito importantes, mas não foram aplicadas. 
<br>

### Vamos aplicá-las uma a uma. 
<br>

### Lembre-se de encontrar um ambiente onde possa se concentrar, entender e anotar tudo o que precisa ser feito e, depois de um tempo, pode ser bem interessante reunir-se com quem pode agregar a esse projeto. 

---


**Agora é hora de pensar!** Com o projeto do caixa eletrônico, encontramos algumas questões que são muito importantes, mas não foram aplicadas. Vamos aplicá-las uma a uma.

1.  Ao acessar o sistema, **pergunte o nome do usuário e diga** "Olá {Nome} é um prazer ter você por aqui!"
    
2.  Na função "inicio", **utilize escolha/caso (switch/case)** para validar a opção escolhida pelo usuário.
    
3.  Sempre que o usuário for sacar dinheiro, o valor restante não pode ser negativo, ou seja, **caso o usuário tente sacar mais do que tem em saldo, a ação não deve ocorrer.** Exiba uma mensagem de _"Operação não autorizada"._
    
4.  Sempre que o usuário for sacar dinheiro, **o valor a ser sacado não pode ser igual ou menor que zero.** Exiba uma mensagem de "Operação não autorizada".
    
5.  **Adicionar a opção para ver o extrato** (Coloque algumas compras ou depósitos fictícios).
    
6.  **Adicionar a opção para fazer uma transferência.** A transferência consiste em você informar o número de uma conta (pode ser qualquer número, mas obrigatoriamente um número, ou seja, nenhum outro caractere deve ser aceito), perguntar o valor da transferência e remover o valor da conta da mesma forma como na ação do saldo. Caso o usuário tente transferir mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
    
7.  Sempre que o usuário for transferir dinheiro,  **o valor a ser transferido não pode ser igual ou menor que zero**, ou seja, caso o usuário tente transferir mais do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de _"Operação não autorizada"_.
    
8.  No menu principal, **a ordem das opções deve ser:** Saldo, Extrato, Saque, Depósito, Transferência e Sair.
    
9.  **Atualize a função "erro" com as novas opções do menu.**
    
10.  **Caso o usuário informe um valor para depósito igual ou menor que zero, não deixe a operação ocorrer.** Exiba uma mensagem de "Operação não autorizada".
    
11.  **Sempre que o usuário for acessar o saldo, sacar, retirar o extrato ou transferir dinheiro é necessário que ele informe uma senha.** Essa senha deve ser validada com uma condicional. A senha é **3589**.
    
12.  **Caso a senha informada não seja a correta, é necessário chamar a função atual novamente.** 
    
13.  Quando o usuário escolher sair do sistema, **exiba uma mensagem** agradecendo por utilizar os serviços do banco: "{Nome}, foi um prazer ter você por aqui!".

<br>

**Materiais de referência**

# [Caixa Eletronico](/perguntas/CaixaEletronico.kt)