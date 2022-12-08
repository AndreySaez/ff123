fun main() {
    val time = Magazine(900, 10)

    val harryPotter = Book(10000, 50)
    val gameOfThrones = Book(7000, 60)

    zalupa228(gameOfThrones)
    zalupa228(harryPotter)
    zalupa228(time)
}

fun zalupa228(paper: Publication) {
    println("type: ${(paper.getType())}, wordCount: ${paper.wordCount}, price: ${paper.price}")
}
