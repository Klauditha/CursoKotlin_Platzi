fun main(args: Array<String>) {
    /*Clase  de Hola Mundo*/
    println("Hola mundo")

    /*Clase  de Operadores en Kotlin*/
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(4%2)

    val a = 4
    val b = 2
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    /*Otros operadores*/
    val c= -2
    val d = c.unaryMinus()
    println("d: $d")

    val e = true
    val f = e.not()
    println("f: $f")

    //println("+d: $d.inc()")

    val g = -12
    val h = 12
    println("g es mayor que h. ${a>b}")

}