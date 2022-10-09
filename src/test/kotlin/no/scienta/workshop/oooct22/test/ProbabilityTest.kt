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

    @Test
    fun should_support_comparisons() {
        assertThat(Probability(0.5)).isLessThan(Probability(0.6))
        assertThat(Probability(0.5)).isGreaterThan(Probability(0.1))
        assertThat(Probability(0.5)).isEqualByComparingTo(Probability(0.5))
    }

    @Test
    fun should_support_inversion() {
        val ratherLikely = Probability(0.75)
        val ratherUnlikely = Probability(0.25)
        assertThat(!ratherLikely).isEqualTo(ratherUnlikely)
    }
}
