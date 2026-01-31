import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsForm(
  state: FormState,
  onStateChange: (FormState) -> Unit,
  onSave: () -> Unit
) {
  Card(
    modifier = Modifier.width(420.dp).padding(16.dp),
    shape = RoundedCornerShape(24.dp),
    colors = CardDefaults.cardColors(containerColor = DarkSurface),
    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
  ) {
    Column(modifier = Modifier.fillMaxWidth().padding(32.dp)) {
      Text("Settings", fontSize = 28.sp, color = androidx.compose.ui.graphics.Color.White)
      Spacer(modifier = Modifier.height(16.dp))

      ProfileFields(state, onStateChange)
      PreferenceControls(state, onStateChange)
      LanguageSelector(state, onStateChange)

      Spacer(modifier = Modifier.height(24.dp))
      Button(
        onClick = onSave,
        modifier = Modifier.fillMaxWidth().height(48.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Purple40)
      ) {
        Text("Save", fontSize = 16.sp)
      }
    }
  }
}

