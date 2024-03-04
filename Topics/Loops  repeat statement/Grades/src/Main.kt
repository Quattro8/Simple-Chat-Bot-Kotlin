fun main() {
    // put your code here
    val numberOfStudents: Int = readln().trim().toInt()
    var resultA: Int = 0
    var resultB: Int = 0
    var resultC: Int = 0
    var resultD: Int = 0

    repeat(numberOfStudents) {
        val result = readln().trim().toInt()
        when (result) {
            2 -> resultD += 1
            3 -> resultC += 1
            4 -> resultB += 1
            5 -> resultA += 1
        }
    }

    println("$resultD $resultC $resultB $resultA")
}
