plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
// https://mvnrepository.com/artifact/org.ejml/ejml-all
    implementation("org.ejml:ejml-all:0.43.1")


}

tasks.test {
    useJUnitPlatform()
}