import org.springframework.boot.gradle.tasks.bundling.BootJar

buildscript {
    val repos by extra { listOf("http://maven.aliyun.com/nexus/content/groups/public","https://jcenter.bintray.com/") }
    repositories {
        repositories { for (u in repos) { maven(u) } }
        google()
    }
}

plugins {
    val springBootVersion = "2.1.1.RELEASE"
    java
    idea
    `java-library`
    id("base")
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    id("org.springframework.boot") version springBootVersion
    id ("org.jetbrains.kotlin.kapt") version "1.3.10"
    id ("org.jetbrains.kotlin.jvm") version "1.3.10"
}
configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}


val querydslVersion = "4.2.1"
dependencies{
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    api("com.querydsl:querydsl-jpa")
    api("org.springframework.boot:spring-boot-starter-test")
    api("org.dbunit:dbunit:2.5.4")
    api("org.apache.ant:ant:1.8.2")
    compile("com.h2database:h2")
    kapt("com.querydsl:querydsl-apt:${querydslVersion}:jpa")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("javax.servlet:jstl")
    compile("org.apache.tomcat.embed:tomcat-embed-jasper")
//    compile("org.apache.shiro:shiro-spring-boot-web-starter:1.4.0")
}





