plugins {
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    // fully-qualified main class:
    mainClass.set("app.Main")
}

dependencies {
    // (add test libs later if you want)
}