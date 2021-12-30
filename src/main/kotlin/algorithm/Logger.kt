package algorithm

class Logger(private var map: HashMap<String,Int> = HashMap()) {

    fun shouldPrintMessage(message: Message, timestamp: TimeStamp): Boolean {

        return when(!map.containsKey(message.message) || timestamp.confirmOutputAfterTenSecond(map[message.message]!!)) {
            true -> addLogger(message, timestamp)
            false -> false
        }
    }

    private fun addLogger(message: Message, timestamp: TimeStamp): Boolean {
        map[message.message] = timestamp.timeStamp
        return true
    }
}

class Message(val message: String) {
    init {
        require(message.length in (MIN_MESSAGE_LENGTH) until MAX_MESSAGE_LENGTH) {
            throw IllegalArgumentException("메세지 길이가 1-30 범위를 벗어 났습니다.")
        }
    }
}
private const val MIN_MESSAGE_LENGTH = 1
private const val MAX_MESSAGE_LENGTH = 30

class TimeStamp(val timeStamp: Int) {
    init {
        require(timeStamp in (MIN_TIMESTAMP) until (MAX_TIMESTAMP)) {
            throw IllegalArgumentException("시간 설정이 0-109 범위를 벗어 났습니다.")
        }
    }

    fun confirmOutputAfterTenSecond(beforeTimeStamp: Int): Boolean {
        return when(timeStamp - beforeTimeStamp >= MESSAGE_DELIVERY_MAX_TIME) {
            true -> true
            false -> false
        }
    }
}
private const val MESSAGE_DELIVERY_MAX_TIME = 10
private const val MIN_TIMESTAMP = 0
private const val MAX_TIMESTAMP = 110
