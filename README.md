# Settings App — Kotlin Desktop Lesson 03

A settings form built with Compose Desktop and Material 3, demonstrating state management and input controls.

This is the companion code for **[Kotlin Desktop Lesson 03: State & Input](https://youtube.com/@GoCeleste)**.

![Settings App](https://img.shields.io/badge/Kotlin-2.1.0-7F52FF?logo=kotlin&logoColor=white) ![Compose](https://img.shields.io/badge/Compose-1.7.3-4285F4?logo=jetpackcompose&logoColor=white) ![Material3](https://img.shields.io/badge/Material_3-Desktop-green)

## What It Does

A dark-themed settings form with:

- **Text fields** — Name and email with `OutlinedTextField`
- **Checkbox** — Enable notifications toggle
- **Switch** — Dark mode toggle
- **Radio buttons** — Language selection (English, Spanish, Japanese)
- **Validation** — Email field shows error for invalid input
- **Save button** — Prints current form state

## Key Concepts

| Concept | How It's Used |
|---------|--------------|
| `OutlinedTextField` | `value` / `onValueChange` two-way binding |
| `Checkbox` / `Switch` | `checked` / `onCheckedChange` pattern |
| `RadioButton` | `selected` / `onClick` in a `forEach` loop |
| State hoisting | Parent owns state, child is stateless |
| `data class copy()` | Immutable state updates |
| Validation | Pure function returning nullable error string |

## Project Structure

```
src/main/kotlin/
  Colors.kt          8 lines — Purple color palette
  FormState.kt       15 lines — Data class + validateEmail()
  SectionLabel.kt    19 lines — Reusable section header
  FormFields.kt      68 lines — ProfileFields, PreferenceControls, LanguageSelector
  SettingsForm.kt    41 lines — Card shell assembling all sections
  Main.kt            43 lines — State owner + window setup
```

6 files, 194 lines total.

## Run

```bash
# Generate Gradle wrapper (first time only)
gradle wrapper --gradle-version 8.10

# Run the app
./gradlew run
```

Requires JDK 17+.

## Prerequisites

- [Lesson 01: Hello Compose](https://github.com/GoCelesteAI/kotlin-desktop-lesson01-hello-compose) — Window, Text, basic composables
- [Lesson 02: Profile Card](https://github.com/GoCelesteAI/kotlin-desktop-lesson02-profile-card) — Layouts, styling, modifiers

## License

MIT
