import kotlin.test.Test
import kotlin.test.assertEquals

class StubTest {
    var x = 5

    @Test
    fun `my first test`() {
        x = 6
        assertEquals(6, x)
    }

    @Test
    fun `my second test`() {
        assertEquals(5, x)
    }
}