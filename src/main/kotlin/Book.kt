class Book(override val wordCount: Int, override val price: Int) : Publication {
    override fun getType(): String = when {
        wordCount <= 1000 -> "Flash Fiction"
        wordCount <= 7500 -> "Short Story"
        else -> "Novel"

    }

     // Задание 2
    override fun equals(other: Any?): Boolean {
        if (other is Book) {
            return (wordCount == other.wordCount) && (price == other.price)

        }
        return false
    }
}


