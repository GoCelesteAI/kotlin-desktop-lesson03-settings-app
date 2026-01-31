import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileFields(state: FormState, onStateChange: (FormState) -> Unit) {
  SectionLabel("PROFILE")
  OutlinedTextField(
    value = state.name,
    onValueChange = { onStateChange(state.copy(name = it)) },
    label = { Text("Name") },
    singleLine = true,
    modifier = Modifier.fillMaxWidth()
  )
  Spacer(modifier = Modifier.height(8.dp))
  val emailError = validateEmail(state.email)
  OutlinedTextField(
    value = state.email,
    onValueChange = { onStateChange(state.copy(email = it)) },
    label = { Text("Email") },
    singleLine = true,
    isError = emailError != null,
    supportingText = if (emailError != null) {{ Text(emailError) }} else null,
    modifier = Modifier.fillMaxWidth()
  )
}

@Composable
fun PreferenceControls(state: FormState, onStateChange: (FormState) -> Unit) {
  SectionLabel("PREFERENCES")
  Row(verticalAlignment = Alignment.CenterVertically) {
    Checkbox(
      checked = state.notifications,
      onCheckedChange = { onStateChange(state.copy(notifications = it)) }
    )
    Text("Enable notifications", color = PurpleGrey80)
  }
  Row(
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween
  ) {
    Text("Dark mode", color = PurpleGrey80)
    Switch(
      checked = state.darkMode,
      onCheckedChange = { onStateChange(state.copy(darkMode = it)) }
    )
  }
}

@Composable
fun LanguageSelector(state: FormState, onStateChange: (FormState) -> Unit) {
  SectionLabel("LANGUAGE")
  val languages = listOf("English", "Spanish", "Japanese")
  languages.forEach { lang ->
    Row(verticalAlignment = Alignment.CenterVertically) {
      RadioButton(
        selected = state.language == lang,
        onClick = { onStateChange(state.copy(language = lang)) }
      )
      Text(lang, color = PurpleGrey80)
    }
  }
}

