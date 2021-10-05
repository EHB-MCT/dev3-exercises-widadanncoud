

fun main () {
    val friends = arrayOf("jan", "Piet", "Pol")
    for (friend in friends){
        greet(friend)
    }
}


fun greet(name: String){
    println("Hello $name")
}