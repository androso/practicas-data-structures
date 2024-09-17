fun main (){
    val numeros = Array(3) { 0 }
    var suma = 0

    for (i in numeros.indices){
        while(true){
            try{
                print("Enter a number (${i + 1}/3):")
                numeros[i] = readLine()!!.toInt()
                break
            }catch (e: NumberFormatException){
                println("Enter a valid number")
            }
        }
        suma += numeros[i]
    }
    println("The sum of the numbers is: $suma")
}