fun main(){
    val notas = Array(4) { 0.0 }
    var promedio = 0.0;

    for (i in notas.indices){
        while(true){
            try{
                print("enter the grade ${i + 1}/4:")
                notas[i] = readLine()?.toDoubleOrNull()?:continue
                if (notas[i] < 0 || notas[i] > 10){
                    println("enter a valid grade")
                }else{
                    break
                }
            }catch (e: NumberFormatException){
                println("Enter a valid grade")
            }
        }
        promedio += notas[i]
    }
    promedio /= 4
    println("The final grade is: $promedio")
}