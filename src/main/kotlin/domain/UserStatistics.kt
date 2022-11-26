package domain

// we store millisecond value (how long does user take to complete)
// so we use Long type
data class UserStatistics(
    val fourEasy: Long = 0,
    val fourMedium: Long = 0,
    val fourHard: Long = 0,
    val nineEasy: Long = 0,
    val nineMedium: Long = 0,
    val nineHard: Long = 0,
)
