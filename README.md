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
