class teacher (override val name: string): person(name), chatPartner{
    override fun talk(){
        funFact()
    }
    fun funFact(){
        println('I teach.')
    }
}