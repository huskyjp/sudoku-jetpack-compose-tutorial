package domain

// by declaring input value as prop in enum class,
// we can define what value does it has by default
enum class Difficulty(val modifier: Double) {
    EASY(0.50),
    MEDIUM(0.44),
    HARD(0.38)
}