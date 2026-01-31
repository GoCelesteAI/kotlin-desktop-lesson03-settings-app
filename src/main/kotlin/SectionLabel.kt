import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionLabel(text: String) {
  Text(
    text = text,
    fontSize = 13.sp,
    fontWeight = FontWeight.Bold,
    color = Purple80,
    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
  )
}

