// Example 1
class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}

// Example 2
fun <T> imprimirDato(elemento: T) {
    println(elemento)
}

// Example 3
fun <T : Number> sumar(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun <T> imprimirSiEsNumero(numero: T) where T:Number{
    println(numero.toDouble())
}

fun main(args: Array<String>) {

    val cajaInt = Caja(24)
    val cajaString = Caja("It's a String!")
    val name = "androso"
    val pi = 3.1415
    val suma = sumar(57, pi)

    println("--------------------Example 1--------------------")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("--------------------End--------------------\n")
    println("--------------------Example 2--------------------")
    imprimirDato(name)
    imprimirDato(pi)
    println("--------------------End--------------------\n")
    println("--------------------Example 3--------------------")
    println("La sume es: " + suma)
    println("--------------------End--------------------\n")
    println("--------------------Example 4--------------------")
    println(imprimirSiEsNumero(suma))
    println("--------------------End--------------------\n")
}
