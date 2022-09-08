import java.awt.font.LineBreakMeasurer

fun main(args: Array<String>) {

    println("**************RESULTADOS EJERCICIO 1********************")
    val morningNotification=51
    val eveningNotification=135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    println("\n**************RESULTADOS EJERCICIO 2********************")

    val child=5
    val adult=28
    val senior=87
    val isMonday=true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child,isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult,isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}.")

    println("\n**************RESULTADOS EJERCICIO 3********************")
    val celsiusAFahrenheit={initialMeasurement: Double -> 9.0/5.0*initialMeasurement+32.0}
    printFinalTemperature(27.0,"Celsius","Fahrenheit",celsiusAFahrenheit)
    val kelvinACelsius={initialMeasurement: Double -> initialMeasurement-273.15}
    printFinalTemperature(350.0,"Kelvin","Celsius",kelvinACelsius)
    val fahrenheitAKelvin={initialMeasurement: Double -> 5.0/9.0*(initialMeasurement-32.0)+273.15}
    printFinalTemperature(10.0,"Fahrenheit","Kelvin",fahrenheitAKelvin)

}

/*****************EJERCICIO 1*****************/
fun printNotificationSummary(numberOfMessages:Int){
    if (numberOfMessages<100)
        println("You have $numberOfMessages notifications.")
    else
        println("Your phone is blowing up! You have 99+ notifications.")
}

/*****************EJERCICIO 2*****************/
fun ticketPrice(age: Int, isMonday: Boolean): Int{
    return when (age){
        in 0..12 -> 15
        in 13..60-> if(isMonday) 25 else 30
        in 61..100->20
        else -> -1
    }
}

/*****************EJERCICIO 3*****************/
fun printFinalTemperature(
    initialMeasurement:Double,
    initialUnit:String,
    finalUnit: String,
    conversionFormula: (Double)-> Double
){
    val finalMeasurement=String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

