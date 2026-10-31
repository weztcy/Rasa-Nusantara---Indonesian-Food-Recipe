# Rasa Nusantara — Indonesian Food Recipe

[![Platform](https://img.shields.io/badge/Platform-Android%208.0%2B%20(API%2026%2B)-brightgreen?logo=android&logoColor=white)](https://www.android.com/)
[![Java](https://img.shields.io/badge/Java-11-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![UI Architecture](https://img.shields.io/badge/Architecture-Native%20Android%20Views-blue?logo=android&logoColor=white)](https://developer.android.com/guide/components/activities/intro-activities)
[![Material Design 3](https://img.shields.io/badge/Material_Design-3%20(v1.10.0)-7C4DFF?logo=materialdesign&logoColor=white)](https://m3.material.io/)
[![RecyclerView](https://img.shields.io/badge/RecyclerView-1.4.0-4285F4?logo=android&logoColor=white)](https://developer.android.com/develop/ui/views/layout/recyclerview)
[![Glide](https://img.shields.io/badge/Glide-4.16.0-4285F4?logo=android&logoColor=white)](https://github.com/bumptech/glide)
[![Android Gradle Plugin](https://img.shields.io/badge/AGP-9.3.2-02303A?logo=gradle&logoColor=white)](https://developer.android.com/build)
[![Gradle](https://img.shields.io/badge/Gradle-9.5.0-02303A?logo=gradle&logoColor=white)](https://gradle.org/)
[![Privacy](https://img.shields.io/badge/Privacy-100%25%20Offline%20%7C%20Zero%20Permissions-blueviolet)](#permissions--device-requirements)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)

<p align="center">
  <img src="./screenshots/banner.png" alt="Rasa Nusantara — Indonesian Food Recipe Banner" width="100%" />
</p>

Rasa Nusantara is an offline-first native Android culinary recipe catalog application engineered to preserve, celebrate, and present authentic Indonesian cuisine. Designed for home cooks, cooking enthusiasts, and culinary explorers, Rasa Nusantara provides an instant, self-contained digital cookbook featuring 20 of Indonesia's most celebrated traditional dishes—from fragrant street food favorites like Nasi Goreng and Ayam Geprek to complex heritage masterpieces such as Rendang, Rawon, and Sop Buntut.

Built with native Java 11 and modern Android development components, the application delivers a smooth, responsive browsing experience powered by a two-column `RecyclerView` with `GridLayoutManager`, Google's Material Design 3 design system, and Bumptech Glide v4.16.0 for memory-safe image downsampling. Rasa Nusantara operates under an uncompromising zero-permission philosophy: it requires zero internet connectivity, requests zero device permissions, and stores all recipe data and high-definition imagery locally within the application package, guaranteeing instant startup, battery efficiency, and absolute privacy.

---

## Features

- **Curated Catalog of 20 Authentic Indonesian Dishes**:
  - Comprehensive selection of traditional recipes covering regional cuisines from Java, Sumatra, Bali, and across the Indonesian archipelago.
  - Diverse dish varieties including stir-fried staples (*Nasi Goreng*, *Mie Goreng*), hearty soups and broths (*Soto Ayam*, *Rawon*, *Bakso Kuah*, *Sop Buntut*), slow-cooked specialties (*Rendang*, *Ayam Opor*), grilled proteins (*Ayam Bakar*, *Ikan Bakar*, *Sate Ayam*), and street food classics (*Pempek*, *Martabak Telur*, *Pecel Lele*, *Gado-Gado*).
- **Culinary Metadata & Difficulty Classification**:
  - **Difficulty Tiers**: Each recipe is classified into distinct culinary skill ratings—**Mudah** (Easy), **Sedang** (Medium), or **Sulit** (Advanced/Hard)—highlighted by styled badge chips.
  - **Preparation & Cooking Durations**: Realistic estimated cooking times ranging from rapid 15-minute meals (*Mie Goreng*) to elaborate 120-minute slow simmer dishes (*Rendang*, *Sop Buntut*).
  - **Narrative Culinary Descriptions**: Engaging background context detailing flavor profiles, aromatic spices, and cultural serving traditions for each dish.
- **Structured Ingredients & Sequential Preparation Steps**:
  - **Bullet-Formatted Ingredients**: Clean, standardized bulleted lists (`•`) specifying exact measurements, proteins, aromatic spices, and sauces.
  - **Numbered Step-by-Step Instructions**: Sequential cooking procedures numbered chronologically (`1. `, `2. `) with generous line spacing for effortless kitchen readability while preparing dishes.
- **High-Performance Memory-Safe Image Delivery**:
  - Powered by Bumptech Glide 4.16.0 to load high-resolution culinary photography stored in local drawable resources.
  - Memory-safe downsampling via `Glide.with(...).load(...).override(800, 800).centerCrop()`, preventing `OutOfMemoryError` (OOM) exceptions and ensuring fluid 60fps/120fps scrolling on the two-column grid.
- **Modern Material Design 3 Warm Aesthetic**:
  - Tailored color palette inspired by Indonesian culinary warmth: Soft Cream background (`#FFF8F3`), Terracotta Coral primary accents (`#FF7043`), and Deep Terracotta Dark (`#E85A2F`).
  - Elevated `MaterialCardView` components featuring 16dp corner radiuses, subtle drop shadows (`3dp`), and tactile touch ripple feedback.
  - Native Edge-to-Edge window styling matching status and navigation bar tones to the application theme.
- **Zero-Permission Privacy & 100% Offline Autonomy**:
  - Operates completely offline with zero dependency on external servers, cloud synchronizations, or remote APIs.
  - Zero manifest permissions requested: no network access, no camera, no location, and no local device file system permissions required.

---

## Preview & Demo

### Interactive Recipe Explorer & Comprehensive Detail View

<p align="center">
  <img src="./screenshots/Rasa%20Nusantara%20-%20Indonesian%20Food%20Recipe%201.png" alt="Rasa Nusantara Recipe Explorer and Recipe Detail Screen Showcase" width="100%" />
</p>

_Showcase of the Rasa Nusantara mobile user interface: The primary catalog view (left) highlights the warm terracotta header, category subtitle, and dual-column grid of elevated recipe cards showing dish photography, cooking durations, and difficulty badges. The recipe detail view (right) demonstrates the full-width culinary hero banner, cooking duration chip, difficulty rating, culinary overview, structured ingredients checklist, and numbered step-by-step cooking instructions._

---

## Platform Support

| Dimension | Specification | Verification Source |
| :--- | :--- | :--- |
| **Target Operating System** | Android | Android Manifest & Gradle Build Configuration |
| **Minimum OS Version** | Android 8.0 (Oreo, API Level 26) | `minSdk = 26` in `app/build.gradle.kts` |
| **Target OS Version** | Android 16 (API Level 37) | `targetSdk = 37` in `app/build.gradle.kts` |
| **Compile SDK** | Android 16 (API Level 37) | `compileSdk { version = release(37) }` in `app/build.gradle.kts` |
| **Supported Architectures** | `arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64` | Android Runtime (Dalvik / ART VM) |
| **Form Factors** | Smartphones & Tablets | Responsive two-column `GridLayoutManager` with vertical scrolling |
| **Tested Targets** | Android Emulators & Physical Hardware (API 26–37) | Local unit test execution and device deployment |
| **Published Targets** | Installable Debug APK | `app-debug.apk` built in `app/build/outputs/apk/debug/` |

---

## Tech Stack

### Core Platform & Languages

- **Programming Language**: Java 11 (`sourceCompatibility = JavaVersion.VERSION_11`, `targetCompatibility = JavaVersion.VERSION_11`)
- **Platform SDK**: Native Android SDK (API Level 37, Android 16)
- **Architecture Pattern**: Native Android View-based Activity & Adapter Architecture

### UI Framework & System Integration

- **Design System**: Material Design 3 (`com.google.android.material:material:1.10.0`)
- **Compatibility Support**: AndroidX AppCompat (`androidx.appcompat:appcompat:1.6.1`)
- **List & Grid Management**: AndroidX RecyclerView (`androidx.recyclerview:recyclerview:1.4.0`) with `GridLayoutManager` (span count 2)
- **Layout Architecture**: AndroidX ConstraintLayout (`androidx.constraintlayout:constraintlayout:2.1.4`), `LinearLayout`, and `ScrollView`
- **Card Containers**: MaterialCardView (`com.google.android.material.card.MaterialCardView`) with 16dp rounded corners and elevation

### Image Loading & Bitmap Processing

- **Image Loading Library**: Bumptech Glide 4.16.0 (`com.github.bumptech.glide:glide:4.16.0`)
- **Optimization Strategy**: Runtime bitmap downsampling (`override(800, 800)`) and center-crop scaling to eliminate large drawable heap overhead

### Build System & Toolchain

- **Build Automation**: Gradle 9.5.0 (`gradle-wrapper.properties`)
- **Android Gradle Plugin (AGP)**: Version 9.3.2 (`libs.versions.toml`)
- **Toolchain Conventions**: Foojay Resolver Convention Plugin 1.0.0
- **Bytecode Optimization**: R8 configuration via `app/src/main/keepRules/rules.keep`

### Testing Frameworks

- **Host Unit Testing**: JUnit 4.13.2 (`junit:junit:4.13.2`)
- **Instrumented Testing**: AndroidX Test JUnit Extension 1.1.5 (`androidx.test.ext:junit:1.1.5`)
- **UI & Integration Testing**: AndroidX Espresso Core 3.5.1 (`androidx.test.espresso:espresso-core:3.5.1`)

---

## Prerequisites

### Developer Environment

Before compiling and running the project from source, ensure your development workstation meets the following requirements:

- **Java Development Kit (JDK)**: JDK 11 or higher (JDK 17 or JDK 21 recommended).
- **Android Studio**: Android Studio Ladybug (2024.2+), Meerkat, or newer with Android SDK Build-Tools installed.
- **Android SDK**: Android API Level 37 SDK Platform installed via Android Studio SDK Manager.
- **Execution Target**:
  - Android Virtual Device (AVD) running Android 8.0 (API Level 26) or higher.
  - Physical Android smartphone/tablet running Android 8.0+ with **USB Debugging** enabled in Developer Options.

### End-User Requirements

For end users installing the standalone pre-built application package:

- **Operating System**: Android 8.0 (Oreo, API Level 26) or newer.
- **Storage**: Minimum 25 MB of free internal storage for APK installation and cached assets.
- **Network**: None (100% offline).

---

## Installation & Setup

### Developer Setup (Build from Source)

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/weztcy/Rasa-Nusantara---Indonesian-Food-Recipe.git
   cd "Rasa-Nusantara---Indonesian-Food-Recipe"
   ```

2. **Open in Android Studio**:
   - Launch Android Studio.
   - Select **File** > **Open...** and select the root project directory.
   - Wait for Gradle to synchronize dependencies and build the project model.

3. **Compile the Debug Package**:
   ```bash
   # On macOS / Linux
   ./gradlew assembleDebug

   # On Windows (PowerShell / Command Prompt)
   .\gradlew.bat assembleDebug
   ```

4. **Deploy to a Connected Device or Emulator**:
   ```bash
   # Install and launch directly via ADB
   ./gradlew installDebug
   ```

### End-User Installation (Pre-Built APK)

If you have downloaded the pre-compiled `app-debug.apk`:

1. Transfer `app-debug.apk` to your Android device via USB, direct download, or local file sharing.
2. Open your device's **File Manager** and tap on `app-debug.apk`.
3. If prompted, grant temporary permission to install apps from unknown sources.
4. Tap **Install** and launch **Recipe** (labeled **Rasa Nusantara** in the app) from your launcher.

Alternatively, install directly via the Android Debug Bridge (ADB):

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

---

## Environment Variables & Configuration

Rasa Nusantara is designed as a fully self-contained local application. It operates without external web servers, remote databases, or cloud APIs:

- **Zero Environment Variables**: No `.env` files or remote API tokens are required.
- **Application Identifiers (`app/build.gradle.kts`)**:
  - `namespace`: `com.example.recipe`
  - `applicationId`: `com.example.recipe`
  - `minSdk`: `26` (Android 8.0)
  - `targetSdk`: `37` (Android 16)
  - `versionCode`: `1`
  - `versionName`: `"1.0"`

---

## Usage / Getting Started

### 1. Launching the Application

Upon opening Rasa Nusantara, the application immediately displays the main screen (`MainActivity`), featuring the welcoming header title **Rasa Nusantara** and the subtitle **Jelajahi Resep Lezat Makanan Indonesia 🍲** ("Explore Delicious Indonesian Food Recipes").

### 2. Exploring the Culinary Grid

- Scroll vertically through the two-column grid layout displaying 20 traditional Indonesian dishes.
- Each elevated recipe card provides:
  - High-resolution dish photography.
  - Official dish title (e.g., *Nasi Goreng*, *Rendang*, *Ayam Geprek*).
  - Estimated cooking time indicator (e.g., `⏱ 20 menit`, `⏱ 120 menit`).
  - Cooking difficulty badge chip (**Mudah**, **Sedang**, or **Sulit**).

### 3. Inspecting Recipe Details

- Tap on any recipe card to launch `DetailActivity`.
- The detail view provides:
  - **Hero Image**: 260dp edge-to-edge culinary banner photo.
  - **Header Info**: Dish title, cooking duration badge, and difficulty rating.
  - **Deskripsi (Description)**: In-depth culinary overview explaining the background and taste characteristics of the dish.
  - **Bahan-bahan (Ingredients)**: Complete list of ingredients formatted with clear bullet points (`•`).
  - **Cara Membuat (Instructions)**: Chronological step-by-step cooking directions with clear numbering (`1. `, `2. `) and readable spacing.

### 4. Returning to the Catalog

- Tap the system back button or perform the edge-swipe gesture to return to the recipe grid. The scroll position in `MainActivity` is preserved seamlessly.

---

## Available Scripts / Commands

All project compilation, testing, packaging, and maintenance tasks are executed through the Gradle wrapper:

| Task / Command | Purpose & Description |
| :--- | :--- |
| `./gradlew assembleDebug` | Compiles Java source files and packages the installable debug APK (`app/build/outputs/apk/debug/app-debug.apk`). |
| `./gradlew assembleRelease` | Compiles, optimizes, and packages the production release APK (`app/build/outputs/apk/release/`). |
| `./gradlew testDebugUnitTest` | Executes local host JVM unit test suites via JUnit 4. |
| `./gradlew connectedAndroidTest` | Runs instrumentation and UI test suites on an active Android emulator or physical device. |
| `./gradlew installDebug` | Compiles and installs the debug APK directly to the connected Android device or running emulator. |
| `./gradlew lint` | Executes Android Lint static code analysis and generates diagnostic reports in `app/build/reports/lint-results.html`. |
| `./gradlew clean` | Deletes the `build/` directories and clears intermediate compilation caches. |

---

## Permissions & Device Requirements

Rasa Nusantara enforces a strict **Zero-Permission Architecture**. The application manifest declares no special runtime or hardware permissions:

```xml
<!-- Rasa Nusantara operates 100% locally with zero declared permissions -->
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Recipe">
        ...
    </application>
</manifest>
```

| Permission Category | Status | Architectural Rationale |
| :--- | :--- | :--- |
| `android.permission.INTERNET` | **Not Declared** | The app operates entirely offline. No recipe data, images, or telemetry are fetched or sent over the network. |
| `android.permission.ACCESS_NETWORK_STATE` | **Not Declared** | No network monitoring or connectivity checks are performed. |
| `android.permission.READ_EXTERNAL_STORAGE` | **Not Declared** | All recipe assets and imagery are bundled internally in application resources; no access to external files is required. |
| `android.permission.WRITE_EXTERNAL_STORAGE` | **Not Declared** | The application does not write files to external device storage. |
| `android.permission.ACCESS_FINE_LOCATION` | **Not Declared** | Zero location or geolocation tracking is implemented. |
| `android.permission.CAMERA` | **Not Declared** | No camera access is required or requested. |

---

## Data Storage & Synchronization

### Bundled Static Repository Pattern

Rasa Nusantara utilizes an immutable, self-contained local repository architecture:

- **In-Memory Data Source (`RecipeData.java`)**:
  - All 20 recipe records are statically defined as Java model objects within `RecipeData.getRecipeList()`.
  - Each `Recipe` entity encapsulates an integer ID, localized dish name, `@DrawableRes` image identifier, descriptive overview, cooking duration, difficulty level, list of ingredients (`List<String>`), and list of sequential cooking instructions (`List<String>`).
- **Packaged Culinary Visual Assets**:
  - High-resolution culinary photos for all 20 dishes are stored directly within the application's resources directory (`app/src/main/res/drawable/`).
  - No internet connection or remote CDN downloads are required to display dish imagery.
- **Glide Memory & Disk Cache Management**:
  - Image loading in `RecipeAdapter` is managed by Bumptech Glide 4.16.0.
  - Glide performs automated runtime downsampling (`override(800, 800)`) and disk/memory caching, preventing large drawable allocations from exhausting the Android Dalvik/ART virtual machine heap memory.
- **Offline Reliability**:
  - Zero background synchronization or cloud databases. The entire cookbook remains immediately accessible in environments with zero network coverage.

---

## Testing

Rasa Nusantara includes automated test suites for host-based unit verification and on-device instrumentation testing.

### Test Structure

- **Local Unit Tests (`app/src/test/java/com/example/recipe/`)**:
  - `ExampleUnitTest.java`: Validates host JVM unit testing pipelines using JUnit 4.
  - Verifies data manipulation and formatting utilities without requiring the Android operating system runtime.
- **Android Instrumentation Tests (`app/src/androidTest/java/com/example/recipe/`)**:
  - `ExampleInstrumentedTest.java`: Validates application context resolution and package identity (`com.example.recipe`) on live Android hardware or emulators via AndroidX Test Runner and Espresso.

### Executing Unit Tests

To run the local unit test suite from your terminal:

```bash
# On macOS / Linux
./gradlew testDebugUnitTest

# On Windows (PowerShell / Command Prompt)
.\gradlew.bat testDebugUnitTest
```

### Executing Instrumentation Tests

With an active Android emulator or connected device via ADB:

```bash
# On macOS / Linux
./gradlew connectedAndroidTest

# On Windows (PowerShell / Command Prompt)
.\gradlew.bat connectedAndroidTest
```

---

## Build & Release

### Generating Build Artifacts

Rasa Nusantara supports standard Android build variants configured via the Gradle build system:

#### Debug Build

The debug build includes debugging symbols and default diagnostic logging:

```bash
./gradlew assembleDebug
```

- **Output Artifact**: `app/build/outputs/apk/debug/app-debug.apk`
- **Artifact Size**: ~22.3 MB (inclusive of all embedded high-resolution culinary photography)

#### Release Build

To assemble an optimized release APK:

```bash
./gradlew assembleRelease
```

- **Output Artifact**: `app/build/outputs/apk/release/app-release-unsigned.apk`
- **R8 Bytecode Rules**: Managed via `app/src/main/keepRules/rules.keep`.

---

## License

Please see the [LICENSE](./LICENSE) file for the terms and conditions governing the use, modification, and distribution of this project.

---

## Author & Contact

**Yohanes Dimas Pratama**

- GitHub: [github.com/weztcy](https://github.com/weztcy)
- Portfolio: [dimaspratama.vercel.app](https://dimaspratama.vercel.app)
- LinkedIn: [linkedin.com/in/yohanes-dimas](https://www.linkedin.com/in/yohanes-dimas)

