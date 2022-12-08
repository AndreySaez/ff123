class Magazine(override val wordCount: Int, override val price: Int) : Publication {
    override fun getType() {
        println("Magazine")
    }

}
val time = Magazine(900,10)