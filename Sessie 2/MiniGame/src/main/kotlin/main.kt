fun main() {
    println("You will be playing some games about Rick and Morty.")
    challengeOne()
    challengeTwo()
    challengeThree()
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

fun challengeTwo(){

    println("Guess the correct number.")

    val diceResult = setOf<Int>(1, 2, 3, 4, 5, 6).random()

    val userResult = readLine()
        if (userResult == "low"){
            if (arrayOf(1,2,3).contains(diceResult)){
                println("winner")
            }else{
                println("loser")
            }
        }else{
            if (arrayOf(4,5,6).contains(diceResult)){
                println("winner")
            }else{
                println("loser")
            }
        }
}

fun challengeThree() {
    println(
        "Rick often erases Morty's memory. Why did Morty get mad when he discovered the signification of the color " +
                "of the erased memories?"
    )

    println("1 : He felt betrayed.")
    println("2 : Rick hit him in his face because he broke one of the memories.")
    println("3 : Rick erases Morty's memory when Rick himself does something stupid.")

    val rightAnswer = arrayOf("three", "3", "drie");
    val goBack = arrayOf("twoo", "2", "twee");

    val userResponse = readLine()
    if (rightAnswer.contains(userResponse)) {
        println("winner")
    } else if (goBack.contains(userResponse)){
        println("go to previous challenge")
        challengeTwo()
    } else {
        println("game over")
        challengeOne()
    }
}





















