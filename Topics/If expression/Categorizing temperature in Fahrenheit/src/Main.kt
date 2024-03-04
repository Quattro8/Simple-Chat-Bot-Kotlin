import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // input temperature in Fahrenheit
    val temperature: Int = scan.nextLine().trim().toInt()

    // your code goes here
    println(
        if (temperature > 85) "High temperature"
        else if (temperature in 50.. 85) "Normal temperature"
        else "Low temperature"
    )

}