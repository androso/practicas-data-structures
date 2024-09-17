fun main() {
    val cadenaTexto = Array(5) {""}
    for (i in cadenaTexto.indices) {
        try {
            print("Entera string (${i+1}/5): ")
            cadenaTexto[i] = readLine() ?: ""
        } catch (e: Exception) {
            println("Enter a valid string")
        }
    }   
    println("Strings entered")
     for (cadena in cadenaTexto) {
        print(cadena)
     }
}
