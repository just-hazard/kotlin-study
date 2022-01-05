package algorithm

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpansionFunction {

    @Test
    fun name() {
        assertThat("Test".lastChar()).isEqualTo('t')
    }

    private fun String.lastChar(): Char {
        return this[this.length.minus(1)]
    }

    @Test
    fun scope() {
        StringBuilder().apply {

        }
    }
}