# Day 4 – Exceptions & Logging

### Q1:
> What’s the difference between *checked* and *unchecked* exceptions?
> ### Example:
> Write a method that tries to read a file. If it doesn’t exist, handle the exception.
> ### Requirement:
> - You can explain checked vs unchecked exceptions.
> - You can write `try/catch/finally`.
> - You know when to declare `throws` in a method signature.

### Q2:
> How do you create and use a custom exception?
> ### Example:
> Create an `InvalidHealthException` that extends `RuntimeException`. Throw it if a player’s health is set below zero.
> ### Requirement:
> - You can define a new exception class.
> - You can throw exceptions with `throw new ...`.
> - You can catch and handle custom exceptions.

### Q3:
> Why is logging better than `System.out.println` for debugging?
> ### Example:
> Add `java.util.logging` (or SLF4J/Logback if you prefer). Log messages at `INFO`, `WARN`, and `ERROR` levels when certain actions happen.
> ### Requirement:
> - You can configure a logger.
> - You can log at different levels (info, warning, error).
> - You understand why logging is preferred over `println`.

### Mini-Project:
> Add **robust error handling + logging** to your previous “game” project.
> - If a player’s health is set below 0, throw a custom exception.
> - Log key game events (`Player joined`, `Player attacked`, `Player defeated`) at `INFO` level.
> - Log errors (like invalid input) at `ERROR` level.
> ### Requirement:
> - You can integrate exceptions with game logic.
> - You can use logging to trace program flow.
> - You can clearly separate error handling from normal control flow.

### Notes
> - Unchecked are not enforced by compiler and happen at runtime.
> - Checked MUSt be declared or caught as compiler enforces them.
> - Try catch will catch any exception thrown in the try block.
> - Finally will execute no matter what after the try/catch. Usually used for cleanup code.
> - Throws allows you to declare that a method might throw an exception.
> - You can make your own exception by extending Exception or RuntimeException.