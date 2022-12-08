class Magazine(override val wordCount: Int, override val price: Int) : Publication {
    override fun getType() = "Magazine"
}
