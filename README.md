# corba

Código-Fonte protegido pelos :mushroom: alucinógenos, ou seja, apenas se você tiver bem louco poderá alterar este código-fonte.


### Estrutura
```
src
├── CalculadoraApp.idl (acid)
└── net
    └── gpedro
        └── faculdade
            └── corba
                ├── client
                │   ├── CalculadoraHelper.java (generated)
                │   ├── CalculadoraHolder.java (generated)
                │   └── _CalculadoraStub.java (generated)
                ├── server
                │   └── CalculadoraPOA.java (generated)
                └── shared
                    ├── Calculadora.java (generated)
                    └── CalculadoraOperations.java (generated)
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
