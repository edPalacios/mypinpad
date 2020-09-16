import org.junit.Assert.*
import org.junit.Test

class Task1Test {
    @Test
    fun `should return false when input is null`() {
        assertFalse(Task1.find(null))
    }

    @Test
    fun `should return false when input is empty`() {
        assertFalse(Task1.find(""))
    }

    @Test
    fun `should return false when input is blank`() {
        assertFalse(Task1.find(" "))
    }

    @Test
    fun `should return false when input is within range a-z but first letter is lower case`() {
        assertFalse(Task1.find("task"))
    }

    @Test
    fun `should return true when input is within range A-Z and first letter is capital case`() {
        assertTrue(Task1.find("Task"))
    }

}