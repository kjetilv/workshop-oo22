package no.scienta.workshop.oooct22

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertTrue

class MainTest {

    @Test
    fun testKotlin(){
        assertTrue ("The developer has fixed the example test") {
            false
        }
    }

    @Test
    fun testAssertJ() {
        assertThat(false)
            .describedAs("The developer has fixed the example test")
            .isTrue
    }
}
