package baekjoon.p11650

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val inputs = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }

    for (solve in solve(inputs)) {
        println(solve.joinToString(" "))
    }
}

private fun solve(inputs: Array<IntArray>): List<IntArray> {
    return inputs.sortedWith(compareBy({ it[0] }, { it[1] }))
}