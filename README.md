Ekvip Task – Command Feature Console Application
================================================

Overview
--------

This project is a **console-based Java application** that performs operations on a numeric value.The application accepts an initial number and then repeatedly prompts the user to enter commands that modify the value.

Supported commands:

*   increment – increases the value by 1

*   decrement – decreases the value by 1

*   double – doubles the current value

*   random – adds a random number

*   undo – reverts the most recent command

*   exit – terminates the application


Each command is implemented as its **own class**, following object-oriented design principles.

Architecture
============

The project follows **OOP principles and design patterns**:

*   **Command Pattern** – Each operation is represented as a command class.

*   **Factory Pattern** – FeatureFactory creates command objects.

*   **Encapsulation** – History manages application state.

*   **Enum-based command mapping** – FeatureType provides type-safe command matching.