fun main() {
    // Задание 1
    val time = Magazine(900, 10)
    val harryPotter = Book(10000, 50)
    val gameOfThrones = Book(7000, 60)

    getType(gameOfThrones)
    getType(harryPotter)
    getType(time)

    // Задание 2
    println(harryPotter === gameOfThrones)
    println(harryPotter == gameOfThrones)


    // Задание 3
    buy(harryPotter)
    buy(gameOfThrones)

    // Задание 4
    val sum = { param1: Int, param2: Int -> println(param1 + param2) }
    var b = sum(2, 3)
}

// Задане 1
fun getType(paper: Publication) {
    println("type: ${(paper.getType())}, wordCount: ${paper.wordCount}, price: ${paper.price}")
}

// Задание 3

fun buy(paper: Publication) = println("The purchase is complete. The purchase was ${paper.price}")

