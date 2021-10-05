fun main() {
    val options = arrayOf("rock","paper","scissors")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)
}