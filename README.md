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

## Tipos de variables
```
var (changeables)   
val (unchangeables) Se determina en tiempo de ejecución
const (unchangeables) Se determina en tiempo de compilacion
```
Utilizar de preferencia variables de tipo changeables

## Programación Funcional
Paradigma de programación, estilo de resolución de problemas a plasmar en codigo.    
Programación declarativa, sin prreocuparse del porque ni el como.     
Usa funciones todo el tiempo, como parametros de otras funciones e incluso asignarlas a variables.   
Se caracteriza por la inmutabilidad.   
Los bucles dejan de existir reemplandolos por Recursividad.   
Las funciones deben ser puras por definición.   

### Funciones Puras
1° Dados los mismos parámetros de entrada la función debe retornar siempre el mismo valor.   
2° La función no debe tener efectos colaterales, es decir no debe haber nada en el entorno que la altere.   