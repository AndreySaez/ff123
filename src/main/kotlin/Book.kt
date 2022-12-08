class Book(override val wordCount: Int, override val price: Int) : Publication {
    override fun getType() {
        when {
            wordCount <= 1000 -> println("Flash Fiction")
            wordCount <= 7500 -> println("Short Story")
            else -> println("Novel")
        }
    }

}
val harryPotter = Book(10000, 50)
val gameOfThrones = Book(7000, 60)