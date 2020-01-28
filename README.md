# Curso Kotlin en Platzi

## Operadores
### Asignacion
``` 
a=a+b => a.plusAssign(b)
a=a-b => a.minusAssign(b)
a=a*b => a.timesAssign(b)
a=a/b => a.divAssign(b)
a=a%b => a.modAssign(b)
```

### Unarios, Incremento y Decremento
```
Suma unaria => +a => a.unaryPlus()   
Resta unaria => -a => a.unaryMinus()   
Negacion => !a => a.not()   
Incremento => ++a => a.inc()   
Decremento => --a => a.dec()   
```

### Equidad
```
Mayor que => a>b => a.compareTo(b)>0   
Menor que => a<b => a.compareTo(b)<0   
Mayor igual que => a>=b => a.compareTo(b)>=0   
Menor igual que => a<=b => a.compareTo(b)<=0   
Es igual a => a==b => a?.equals(b)?:(b===null)   
No es igual a => a!=b => !(a?.equals(b)?:(b===null))   
```

