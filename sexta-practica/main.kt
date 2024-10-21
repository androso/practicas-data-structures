import java.io.File

fun readFile(path: String): String{
    val file = File(path)
    return file.readText()
}

fun writeFile(path:String, content: String){
    val file = File(path)
    file.appendText(content)
}

fun main(){
    val path = "C:/Users/andro/Documents/univodev/practicas-data-structures/sexta-practica/files/example.txt"
    val content = readFile(path)
    println("-----------EJERCICIO 1-------------")
    println(content)
    println("-----------EJERCICIO 2-------------")
    val insert = "\nthis is an example of adding text"
    writeFile(path, insert)
    println("Se ha agregado el texto")
}   