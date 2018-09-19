apply {
    plugin("kotlin")
    plugin("groovy")
}

buildscript {

    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.21"))
    }
}

dependencies {
    implementation(gradleKotlinDsl())
    implementation(kotlin("stdlib", "1.2.21"))
    implementation(gradleApi())
    implementation(localGroovy())
}

repositories {
    gradlePluginPortal()
}
//plugins {
//    id 'com.jfrog.bintray' version '0.4.1'
//}
//
//buildscript {
//    repositories {
//        maven {
//            url uri('../repo')
//        }
//    }
//    dependencies {
//        classpath group: 'org.gradle', name: 'customPlugin',
//                version: '1.0-SNAPSHOT'
//    }
//}



