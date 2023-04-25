val junitVersionProvider: Provider<String> = providers.gradleProperty("junitVersion")

version = "1.0.0"
group = "bar"

plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:${junitVersionProvider.get()}")
    implementation("tec.units:unit-ri:1.0.3")
}
