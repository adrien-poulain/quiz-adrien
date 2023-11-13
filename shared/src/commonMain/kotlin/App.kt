import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import classes.Answer
import classes.Question

val questions = listOf(
    Question(
        id = 1,
        label = "Film ou série ?",
        correctAnswerId = 2,
        answers = listOf(
            Answer(
                id = 1,
                label = "Film"
            ),
            Answer(
                id = 2,
                label = "Série"
            )
        )
    ),
    Question(
        id = 2,
        label = "Playstation ou XBOX ?",
        correctAnswerId = 1,
        answers = listOf(
            Answer(
                id = 1,
                label = "Playstation"
            ),
            Answer(
                id = 2,
                label = "XBOX"
            )
        )
    ),
    Question(
        id = 3,
        label = "Discord ou Skype ?",
        correctAnswerId = 1,
        answers = listOf(
            Answer(
                id = 1,
                label = "Discord"
            ),
            Answer(
                id = 2,
                label = "Skype"
            )
        )
    )
)

@Composable
fun App() {
    MaterialTheme {
        QuestionScreen(questions)
    }
}

expect fun getPlatformName(): String