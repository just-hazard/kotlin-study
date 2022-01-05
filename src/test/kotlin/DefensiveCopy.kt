import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class Number(var number: Int = 0)

class DefensiveCopy(numbers: List<Number>) {
    private val _numbers: List<Number> = numbers.toList()
    val numbers: List<Number>
        get() = _numbers.map { it.copy() }
}

class Test {

    @Test
    fun test() {
        val numbers = mutableListOf(Number(1))
        val numbers1 = DefensiveCopy(numbers)
        assertThat(numbers1.numbers).hasSize(1)
        numbers.add(Number(2))
        assertThat(numbers1.numbers).hasSize(1)
    }
}

