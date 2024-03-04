import kotlin.math.pow

fun main() {
    // put your code here
    val a = readln().trim().toDouble()
    val b = readln().trim().toDouble()
    val c = readln().trim().toDouble()
    val d = readln().trim().toDouble()

    for (x in 0..1000) {
        if ((a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d).toInt() == 0) {
            println(x)
        }
    }
}