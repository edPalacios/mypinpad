fun main() {

}

object Task1 {
    /**
     * Function that will accept a string and will return true if the first letter of that string is found in the range [A-Z]
     */
    fun find(input: String?): Boolean = when {
        input.isNullOrBlank() -> false
        else -> input.substring(0,1).matches(RANGE)
    }

    /**
     * Regex to match the first char as capital letter followed by any chars (words)
     */
    private val RANGE = "[A-Z]".toRegex()
}