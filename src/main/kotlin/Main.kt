private val entries = arrayOf(
    intArrayOf(),
    intArrayOf(1, 2),
    intArrayOf(2, 1, 3),
    intArrayOf(2, 3, 1, 5),
    intArrayOf(2, 3, 4, 5, 6),
    intArrayOf(4, 2, 3, 5, 1, 6, 8, 9)
)

private fun solution(A: IntArray): Int {
    val one = 1
    return if (A.isEmpty())
        one
    else {
        val current = A.toHashSet()
        val sizeInc = A.size + one
        val expected = IntRange(one, sizeInc)
        val missing = expected - current
        missing.first()
    }
}

private fun IntArray.toStr() = this.map { it.toString() }

private fun printlnSolution(values: IntArray) {
    println("${values.toStr()} -> ${solution(values)}")
}

fun main() {
    entries.forEach { printlnSolution(it) }
}