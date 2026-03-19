import models.ComparableMessage
import java.lang.Exception

enum class ChatServiceError {
    FETCH_MISSING_MESSAGES_FAILED, ACKNOWLEDGE_FAILED, MESSAGE_LEAK_ERROR, LOCAL_SAVE_FAILED, SEND_FAILED
}

data class ChatServiceErrorResponse<M: ComparableMessage>(
    val statusCode: Int,
    val exception: Exception?,
    val reason: String,
    val message: String,
    val failedMessage: M? = null
)