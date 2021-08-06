package panther.pink

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class MyTest {
    @Test
    fun `test foo`() {
        assertThat(
            foo(),
            equalTo("Hello World")
        )
    }

    @Test
    fun `test bar`() {
        assertThat(
            bar(),
            equalTo(8)
        )
    }
}