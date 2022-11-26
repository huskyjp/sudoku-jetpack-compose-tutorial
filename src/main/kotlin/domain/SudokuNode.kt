package domain

import java.io.Serializable

data class SudokuNode(
    val x: Int,
    val y: Int,
    var color: Int = 0, // we use "var" since the value can be change during the execution
    var readOnly: Boolean = true

// make it Serializable for converting data to some other format when storing to database
): Serializable  {
    override fun hashCode(): Int {
        return getHash(x, y)
    }
}


internal fun getHash(x: Int, y: Int): Int {
    val newX = x * 100
    return "$newX$y".toInt()
}
