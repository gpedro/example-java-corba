# CORBA Java Example

Código-Fonte protegido pelos :mushroom: alucinógenos, ou seja, apenas se você tiver bem louco poderá alterar este código-fonte.


### Estrutura
Caso teu projeto falte os arquivos do pacote `CalculadoraApp`, leia a seção **Gerando código**
```
src
├── CalculadoraApp/
├── CalculadoraApp.idl
├── CalculadoraHP.java
├── Client.java
└── Server.java
```


### Gerando código

```ssh
idlj -fall CalculadoraApp.idl
```

RTFM: flag -f
```
-f<side>                  Define what bindings to emit.  <side> is one of client,
                          server, all, serverTIE, allTIE.  serverTIE and allTIE
                          cause delegate model skeletons to be emitted.  If this
                          flag is not used, -fclient is assumed.
```


### Configuração
Adicionar `-ORBInitialPort 1050 -ORBInitialHost localhost` em **Program Arguments** do Server e Client.


### Roda-Roda

1. Executar o orbd usando `orbd -ORBInitialPort 1050`
2. Executar o Server 
3. Executar o Client
4. :bomb:

### Referências

* http://www.inf.ed.ac.uk/teaching/courses/ds/CORBA-programs.html
* http://www.dee.ufma.br/~dlopes/course/CORBA/examples_CORBA_in_java.htm
* http://www.ejbtutorial.com/programming/tutorial-for-corba-hello-world-using-java
* http://www.emoji-cheat-sheet.com/