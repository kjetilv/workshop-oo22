package no.scienta.workshop.oooct22

data class Probability(private val fraction: Double) : Comparable<Probability> {

    override operator fun compareTo(other: Probability) =
        when {
            fraction < other.fraction -> -1
            fraction > other.fraction -> 1
            else -> 0
        }
}
