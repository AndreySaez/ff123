class Book(override val wordCount: Int, override val price: Int) : Publication {
    override fun getType(): String = when {
        wordCount <= 1000 -> "Flash Fiction"
        wordCount <= 7500 -> "Short Story"
        else -> "Novel"

    }

}
