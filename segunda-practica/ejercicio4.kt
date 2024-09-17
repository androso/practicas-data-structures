import kotlin.io.readLine

fun main(){
    val arrayEnteros = Array(4) { 0 }
    var maxValue : Int = 0

    for (i in arrayEnteros.indices){
        try{
            println("Enter a number: ${i+1}/4: ")
            arrayEnteros[i] = readLine()!!.toInt()
        }catch(e: Exception){
            println("Data type not expected: ${e.message}")
        }
    }
    for (i in arrayEnteros.indices){
        if(arrayEnteros[i] > maxValue){
            maxValue = arrayEnteros[i]
        }
    }
    println("The max value inside the array is: ${maxValue}")


}