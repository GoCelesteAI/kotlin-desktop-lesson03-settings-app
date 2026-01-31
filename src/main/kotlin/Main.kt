import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun App() {
  val formState = remember { mutableStateOf(FormState()) }

  MaterialTheme(colorScheme = darkColorScheme()) {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = DarkBackground
    ) {
      Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
      ) {
        SettingsForm(
          state = formState.value,
          onStateChange = { formState.value = it },
          onSave = { println("Saved: ${formState.value}") }
        )
      }
    }
  }
}

fun main() = application {
  Window(
    onCloseRequest = ::exitApplication,
    title = "Settings App"
  ) {
    App()
  }
}

