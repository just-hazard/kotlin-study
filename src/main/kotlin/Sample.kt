import com.jetbrains.rd.util.string.println

data class Sample(
    val name: String,
    val age: Int? = null)

fun main(args: Array<String>) {
    val sample = listOf(Sample("dean"),
                        Sample("alex", 29))

    val actual = sample.maxByOrNull {
        it.age ?: 0
    }

    val cream = sample.lastOrNull {
        it.name.isNotBlank()
    }
    println("last name : $cream")

    println("max age : $actual")
}


