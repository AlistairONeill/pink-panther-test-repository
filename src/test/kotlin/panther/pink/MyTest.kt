package panther.pink

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class MyTest {

    //TODO: I should probably test foo as well

    @Test
    fun `test bar`() {
        assertThat(
            bar(),
            equalTo(8)
        )
    }
}