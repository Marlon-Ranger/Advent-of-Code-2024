import java.io.File
import kotlin.math.abs


fun solveDay1() {
   part1()
   part2()
}

private fun part1() {
    val input = File("input/Day1.txt").readLines()
    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()

    for (line in input) {
        val numbers = line.split("\\s+".toRegex())
        leftList.add(numbers[0].toInt())
        rightList.add(numbers[1].toInt())
    }

    leftList.sort()
    rightList.sort()

    var distanceSum = 0

    for (i in 0..<input.count()) {
        val distance = abs(leftList[i]-rightList[i])
        distanceSum += distance
    }

    println(distanceSum)
}

private fun part2() {

}