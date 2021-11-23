class commedian (override val name: string): person(name), chatPartner{
    override fun talk(){
        joke()
    }
    fun joke(){
        println('I commedian.')
    }
}