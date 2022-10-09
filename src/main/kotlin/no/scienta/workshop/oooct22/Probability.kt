package no.scienta.workshop.oooct22

data class Probability(private val fraction: Double) : Comparable<Probability> {

    override operator fun compareTo(other: Probability) =
        when {
            fraction < other.fraction -> -1
            fraction > other.fraction -> 1
            else -> 0
        }

    operator fun not() =
        Probability(1.0 - fraction)

    infix fun and(probability: Probability) = this * probability

    operator fun times(probability: Probability) =
        Probability(fraction * probability.fraction)
}
