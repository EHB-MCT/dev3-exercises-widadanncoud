class student (override val name: string): person(name), chatPartner{
    override fun talk(){
        gossip()
    }
    fun gossip(){
        println('I gossip.')
    }
}