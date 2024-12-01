fun main() {
    println("Advent of Code 2024")
    var day = ""

    while (day != "exit") {
        println("Which day would you like to solve?")
        day = readln()

        when (day) {
            "1"  -> solveDay1()
            "exit" -> println("Program Ended")
            else -> println("Invalid Day")
        }
    }
}