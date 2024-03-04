fun main() {
    // write your code here
    val a: Int = readln().trim().toInt()
    val b: Int = readln().trim().toInt()
    val c: Int = readln().trim().toInt()
    val d: Int = readln().trim().toInt()
    val e: Int = readln().trim().toInt()

    println(if (e in a..b && e in c..d) "true" else "false")
}