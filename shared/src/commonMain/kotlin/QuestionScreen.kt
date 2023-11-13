import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import classes.Question

@Composable
fun QuestionScreen() {
    Column (
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
        ) {
            Card {
                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = "Question 1",
                        fontSize = 18.sp
                    )
                }
            }
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = false,
                        onClick = { }
                    )
                    Text("Réponse 1")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = false,
                        onClick = { },

                        )
                    Text("Réponse 2")
                }
            }
        }
        Column {
            Button(onClick = {}) {
                Text("Suivant")
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null
                )
            }
        }
        LinearProgressIndicator(
            progress = 0.1f,
            color = Color.Blue,
            modifier = Modifier
                .height(10.dp)
                .clip(shape = RoundedCornerShape(15.dp))
        )
    }
}