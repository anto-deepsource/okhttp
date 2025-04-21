fun main() {
    val number: Any = 10
    when (number) {
        is Int -> if (number > 5) {
            println("Number is an integer greater than 5")
        } else {
            println("Number is an integer but not greater than 5")
        }
        else -> println("Number is not an integer")
    }
}
