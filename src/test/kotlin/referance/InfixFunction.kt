package referance

class InfixFunction {

    infix fun String.add(songTitle: String) = songTitle + this
    val text = "justhis".add("gone").chars()
}