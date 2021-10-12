fun main() {
    println("You will be playing some games about Rick and Morty.")
    challengeOne()
}



fun challengeOne(){

    println("Rick and Morty destroyed there planet so they went to another planet with other Rick and Morty. " +
                "They had to kill them. Where did Rick and Morty bury Rick and Morty? ")

    val goodAnswer = setOf<String>("in the garden", "garden", "Garden")

    val response = readLine()
    if (goodAnswer .contains(response)){
        println("you won")
    }else{
        println("you lose")
    }
}
