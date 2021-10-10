fun main() {
    val options = arrayOf("rock","paper","scissors")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String{
    var userChoice: String?
    do{
        printIN("Make your choice: rock - paper - scissors")
        userChoice = readline()
    }while (!options.contains(userChoice))
    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String?){
    if(computerChoice == userChoice){
        printIn("It's a draw")
        return
    }

    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when(computerChoice){
        "rock" -> if (userChoice == "paper") printIn(winMessage) elseprintIn(loseMessage)
        "paper" -> if (userChoice == "scissors") printIn(winMessage) elseprintIn(loseMessage)
        "scissors" -> if (userChoice == "rock") printIn(winMessage) elseprintIn(loseMessage)
    }


}