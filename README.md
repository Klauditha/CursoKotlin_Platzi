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

### Inmutabilidad
Us de variables de tipo constante o inmutables.   
Es uno de los principios de la Programación Funcional, donde se promueve la ausencia del estado mutable (Stateless).   

Estado : Cualquier dato que se puede guardar y modificar posteriormente en memoria:   
    - Una variable
    - Un archivo   
    - Un socket   

## String
Raw String: En Kotlin, además, tenemos cadenas sin procesar de tres comillas que pueden contener caracteres especiales sin la necesidad de escapar de ellas.   
.trimIndent(): Detecta una sangría mínima común de todas las líneas de entrada, la elimina de cada línea y también elimina la primera y la última si están en blanco.   
.trimMargin(): Recorta los caracteres de espacio en blanco iniciales seguidos de un marginPrefix de cada línea de una cadena de origen y elimina la primera y la última línea si están en blanco.   

Puedes usar los siguientes para escapar caracteres especiales: \t, \b, \n, \r, \', \", \\ y \$   

## Conversiones
Funciones dedicadas a las conversiones de tipos de datos
- toByte()   
- toShort()   
- toInt()   
- toLong()   
- toFloat()   
- toDouble()   
- toChar()  
Ejemplo `var a:Int = 5` `var b:Long = a.toLong() `    

## Rangos
Nos permite imprimir una secuencia de caracteres. Ejemplos: 
`val OnToHundred = 1..100`   
`val AtoC = 'A'..'C'`