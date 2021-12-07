class Duolingo(val roundsize: Int = 3, val language: String = "French") {

    var words = mutableSetOf<Word>(
        Word( "vache","koe", "French" ),
        Word( "chat","kat", "French" ),
        Word( "arbre","boom", "French" ),
        Word( "chaise","stoel", "French" ),
        Word( "écran","scherm", "French" ),
        Word( "wal","muur", "Engels" ),
        Word( "pants","broek", "Engels" ),
        Word( "milk","melk", "Engels" ),
        Word( "clothes","kleren", "Engels" ),
        Word( "finger","vinger", "Engels" ),
    )

    init {
        words = words.filter { it.language == language }.toMutableSet()
    }

    fun play(){
        val selectedWords = words.shuffled().take(roundsize).toMutableSet() //transform in integer
        //zolang er meer dan 0 words zijn gaan we door, loop
        while (selectedWords.count() >0){
            val selectedWord = selectedWords.random()
            //dit is een classe word en we willen de original zien
            println(selectedWord.original)
            val userAnswer = readLine()
            if (userAnswer == selectedWord.translated){
                //good
                selectedWords.remove(selectedWord)
            }else{
                println(selectedWord.translated)
            }
            println("good job")
            //weergeven hoeveel woorden er blijven, woorden tellen
            println(selectedWords.count())
        }
    }}




























