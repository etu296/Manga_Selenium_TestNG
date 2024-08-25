plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    implementation("org.testng:testng:7.1.0")
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.7.1")

// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation("io.github.bonigarcia:webdrivermanager:5.7.0")

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.20.0")


}

tasks.test {
    useTestNG()
}