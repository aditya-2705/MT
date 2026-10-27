# Mobile Technology Laboratory (MT-Lab)

A collection of practical experiments completed as part of the Mobile Technology Laboratory course.

## Experiments

| No. | Experiment | Technology / Approach |
|---|---|---|
| 1 | Android Development Environment Setup | Android SDK, Java, Gradle |
| 2 | My First Android App | Java, XML |
| 3 | Event Handling in Android | Java, XML |
| 4 | Login Screen Using Layouts | Java, XML |
| 5 | Activity Lifecycle | Java, XML |
| 6 | Fragments and Reusable UI | Java, XML, Android Fragments |
| 7 | Dynamic Student List Using SQLite | Java, XML, RecyclerView, SQLite |
| 8 | iOS Interface Design | HTML, CSS (browser-based simulation) |
| 9 | iOS Table View | HTML, CSS, JavaScript (browser-based simulation) |
| 10 | Simple Cross-Platform-Style Application | HTML, CSS, JavaScript |

## Repository Structure

```text
MT-Lab/
├── Exp2-MyFirstApp/
├── Exp3-EventHandling/
├── Exp4-LoginScreen/
├── Exp5-ActivityLifecycle/
├── Exp6-Fragments/
├── Exp7-RecyclerViewSQLite/
├── Exp8-iOS-InterfaceBuilder/
│   └── index.html
├── Exp9-iOS-TableView/
│   └── index.html
├── Exp10-CrossPlatformApp/
│   └── index.html
└── README.md
```

Experiment 1 covers development environment setup. Its separate project folder may not be present because setup was performed in the development environment.

## Requirements

For Android experiments:
- Java Development Kit (JDK)
- Android SDK
- Gradle
- Android device or emulator for running the apps

For browser-based demonstrations:
- Modern web browser
- Python 3 (optional, for running a local HTTP server)

## Running Browser-Based Experiments

Open a terminal in the relevant experiment folder.

For Experiment 8:

```bash
cd Exp8-iOS-InterfaceBuilder
python3 -m http.server 8000
```

For Experiment 9:

```bash
cd Exp9-iOS-TableView
python3 -m http.server 8001
```

For Experiment 10:

```bash
cd Exp10-CrossPlatformApp
python3 -m http.server 8002
```

Open the corresponding forwarded port in GitHub Codespaces.

## Important Note

Experiments 8, 9, and 10 are browser-based demonstrations created because Xcode and a native iOS development environment were unavailable. They are not native iOS applications or packaged cross-platform mobile applications.

## Academic Purpose

This repository organizes the practical work completed for the Mobile Technology Laboratory course.
