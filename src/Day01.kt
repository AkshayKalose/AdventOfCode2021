fun part1(input: List<String>): Int =
    input.map { it.toInt() }
        .zipWithNext()
        .count { it.first < it.second }

// Alternative: Use .windowed on Collections.
fun part2(input: List<String>): Int =
    with(input.map { it.toInt() }) {
        subList(0, count() - 3)
            .zip(subList(3, count()))
            .count { it.first < it.second }
    }

fun main() {
    val exampleInput = readInput("Day01_example")
//    val input = readInput("Day01_actual")

    check(part1(exampleInput) == 7)
//    println(part1(input))

    check(part2(exampleInput) == 5)
//    println(part2(input))
}
