data class FormState(
  val name: String = "",
  val email: String = "",
  val notifications: Boolean = true,
  val darkMode: Boolean = true,
  val language: String = "English"
)

fun validateEmail(email: String): String? {
  if (email.isBlank()) return null
  if (!email.contains("@") || !email.contains(".")) {
    return "Invalid email address"
  }
  return null
}
