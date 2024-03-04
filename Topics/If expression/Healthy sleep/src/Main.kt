fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val result = if (c < a) "Deficiency" else if (c > b) "Excess" else "Normal"
    
    println(result)
}
