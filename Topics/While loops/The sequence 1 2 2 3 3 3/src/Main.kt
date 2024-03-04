fun main() {

    val input = readLine()!!.toInt()
    var counter = 1
    var printed = 0
    var currentNumCount = 0
    while (printed < input) {
        print("$counter ")
        printed++
        if (currentNumCount < counter - 1) {
            currentNumCount++
            continue
        } else {
            currentNumCount = 0
            counter++
        }
    }

}