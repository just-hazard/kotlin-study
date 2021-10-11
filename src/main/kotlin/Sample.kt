data class Sample(
    val name: String,
    val age: Int? = null)

fun main(args: Array<String>) {
    val sample = listOf(Sample("dean"),
                        Sample("alex", 29))

    val actual = sample.maxByOrNull {
        it.age ?: 0
    }

    println("max age : $actual")
}
