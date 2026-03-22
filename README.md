# SpaceLaunch

A Kotlin Multiplatform app for tracking space launches, the ISS in real time, and space news — built as a portfolio project showcasing modern Android/KMP architecture.

## Features (Planned)

- **Upcoming Launches** — Browse and search upcoming rocket launches worldwide (Launch Library 2 API)
- **ISS Live Tracker** — Real-time International Space Station position on a map with crew info
- **Space News** — NASA Astronomy Picture of the Day + spaceflight news articles

## Architecture

The project follows a **KMP-first** approach with shared business logic and platform-native UI:

```
SpaceLaunch/
├── shared/              # Kotlin Multiplatform shared module
│   ├── commonMain/      #   Domain models, repositories, use cases, networking, database
│   ├── androidMain/     #   Android-specific implementations (SQLite driver, etc.)
│   └── iosMain/         #   iOS-specific implementations (native driver, etc.)
├── composeApp/          # Android app — Jetpack Compose UI
└── iosApp/              # iOS app — SwiftUI
```

**Key architectural decisions:**
- **Koin** for dependency injection (works across KMP targets, unlike Hilt)
- **Ktor** for HTTP networking (native KMP support, unlike Retrofit)
- **SQLDelight** for local database (generates Kotlin from SQL, KMP-native)
- **kotlinx.serialization** for JSON parsing (compiler plugin, no reflection)

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Shared Logic | Kotlin Multiplatform |
| Android UI | Jetpack Compose + Material 3 |
| iOS UI | SwiftUI |
| Networking | Ktor 3.4 |
| Database | SQLDelight 2.3 |
| DI | Koin 4.1 |
| Serialization | kotlinx.serialization |
| Async | Kotlin Coroutines + Flow |
| CI | GitHub Actions |

## Build & Run

**Requirements:** Android Studio with KMP plugin, JDK 17+

```shell
# Android
./gradlew :composeApp:assembleDebug

# Shared module tests
./gradlew :shared:allTests
```

For iOS, open `iosApp/` in Xcode and run from there.

## License

MIT
