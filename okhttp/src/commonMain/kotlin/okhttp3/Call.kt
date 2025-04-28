fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach {
        if (it % 2 == 0) continue // Now allowed
        println(it)
    }
    for (i in 2..1) {}
}

class User(val name: String)

context(User)
fun greet() {
    println("Hello, $name!")
}

fun main() {
    val user = User("Alice")
    with(user) {
        greet() // prints: Hello, Alice!
    }
}

fun foo(x: String & Any) {
  
}
