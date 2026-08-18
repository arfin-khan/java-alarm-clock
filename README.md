# Java Alarm Clock

A simple console-based alarm clock built in Java as part of my Java programming practice.

The program allows the user to enter an alarm time in `HH:MM:SS` format, waits until the specified time, and then plays a WAV alarm sound.

## Features

* Set an alarm using `HH:MM:SS` format
* Validates the entered time
* Displays the current time while waiting
* Runs the alarm using a separate thread
* Plays a WAV audio file when the alarm time is reached
* Allows the user to stop the alarm by pressing Enter
* Handles invalid time input
* Handles unsupported audio files and audio errors

## How It Works

1. The user enters an alarm time.
2. The program validates the input using Java's `LocalTime` and `DateTimeFormatter`.
3. A separate alarm thread waits until the specified time.
4. The current time is displayed while the program waits.
5. When the alarm time is reached, the WAV file is played.
6. The user can press Enter to stop the alarm.

## Concepts Practiced

* Java classes and objects
* `LocalTime`
* `DateTimeFormatter`
* Exception handling
* `Scanner`
* `Runnable`
* Threads
* `Thread.sleep()`
* File handling
* Java Sound API
* Methods
* `try-catch`
* Input validation

## Project Structure

```text
java-alarm-clock/
├── Alarmclock.java
├── Alarm.java
├── mixkit-retro-game-emergency-alarm-1000.wav
└── README.md
```

## Requirements

* Java 15 or later
* A system capable of playing WAV audio

## How to Run

1. Clone this repository.
2. Open the project in a Java-supported IDE such as IntelliJ IDEA.
3. Make sure the Java files and WAV audio file are in the expected project location.
4. Run `Alarmclock.java`.
5. Enter an alarm time using the format:

```text
HH:MM:SS
```

For example:

```text
14:30:00
```

6. Wait for the alarm to trigger.
7. Press Enter to stop the alarm.

## Audio

The alarm sound used in this project is a free sound effect from Mixkit.

Attribution is not required under the applicable Mixkit sound-effect license, but the source is acknowledged here for transparency.

## Purpose

This project was created to practice Java fundamentals while building a small practical application involving time handling, file/audio playback, exception handling, and multithreading.
