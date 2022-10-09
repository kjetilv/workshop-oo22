package no.scienta.workshop.oooct22.test

import no.scienta.workshop.oooct22.Probability
import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class ProbabilityTest {

    @Test
    fun should_support_equality() {
        assertThat(Probability(1.0)).isEqualTo(Probability(1.0))
        assertThat(Probability(1.0)).hasSameHashCodeAs(Probability(1.0))

        assertThat(Probability(1.0)).isNotEqualTo(Probability(.1))
    }
}
