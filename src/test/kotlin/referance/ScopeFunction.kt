package referance

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScopeFunction {

    @Test
    fun `let Test`() {
        Person("이름",25).let {
            assertThat(it.name).isEqualTo("이름")
            assertThat(it.age).isEqualTo(25)
        }
    }

    @Test
    fun `with Test`() {
        with(Person("이름", 25)) {
            assertThat(this.name).isEqualTo("이름")
            assertThat(this.age).isEqualTo(25)
        }
    }

    @Test
    fun `also Test`() {
        Person("이름", 25).apply {
            assertThat(this.name).isEqualTo("이름")
            assertThat(this.age).isEqualTo(25)
        }
    }
}

data class Person(
    val name: String,
    val age: Int
)

