fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach {
        if (it % 2 == 0) continue // Now allowed
        println(it)
    }
    for (i in 2..1) {}
}

fun processList(elements: List<Int>): Boolean {
    for (element in elements) {
        val variable = element.nullableMethod() ?: run {
            log.warning("Element is null or invalid, continuing...")
            continue
        }
        if (variable == 0) return true // If variable is zero, return true
    }
    return false
}
