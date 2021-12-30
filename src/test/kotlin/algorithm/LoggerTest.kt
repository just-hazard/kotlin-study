package algorithm

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LoggerTest {

    @Test
    fun `test example one`() {
        val logger = Logger()

        assertTrue(logger.shouldPrintMessage(Message("foo"), TimeStamp(1)))
        assertTrue(logger.shouldPrintMessage(Message("bar"), TimeStamp(2)))
        assertFalse(logger.shouldPrintMessage(Message("bar"), TimeStamp(2)))
        assertFalse(logger.shouldPrintMessage(Message("foo"), TimeStamp(3)))
        assertFalse(logger.shouldPrintMessage(Message("bar"), TimeStamp(8)))
        assertFalse(logger.shouldPrintMessage(Message("foo"), TimeStamp(10)))
        assertTrue(logger.shouldPrintMessage(Message("foo"), TimeStamp(11)))
    }
}
