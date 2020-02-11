var n = 3 //variable global, evitar usarlas
//Inmutabilidad : no cambiar los valores de las variables
//Funciones puras: que nada altere la funcion (principio de programación funcional)
//Ejemplo de funcion que altera N, no es buena practica
fun hola(){
    n=5
}

const val N = "name"
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

    /*ejercicios var val const*/
    n = 4
    println(n)

    val name = args[0] //Tiempo de ejecución
    //cons tiempo de compilacion
    //cont no se aplica a variables locales
    println(name)
    println(N)

    /*String*/
    val nombre = "Claudia" /*Infiere el tipo de dato*/
    val apellido:String = "Villarroel" /*definiendo el tipo de dato*/
    println("Tu nombre es" + nombre)
    println("Tu nombre es  $nombre $apellido")

    val nombreapellido="Claudia\nVillarroel"
    println("Tu nombre es $nombreapellido")
    //Raw String

    val parrafo = """
        ***Lorem Ipsum is simply dummy text of 
        ***the printing and typesetting industry. Lorem Ipsum 
        has been the industry's standard dummy text ever since 
        the 1500s, when an unknown printer took a galley of type and 
        scrambled it to make a type specimen book. It has survived not 
        only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    """.trimIndent() //respeta los saltos de linea
    println(parrafo)
    println(parrafo.trimMargin("***")) //Recorta los ***
}