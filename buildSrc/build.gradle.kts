apply {
    plugin("kotlin")
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
}

repositories {
    gradlePluginPortal()
    gradleScriptKotlin()
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

//apply {
//    plugin("kotlin")
//    plugin("groovy")
//}
//
//buildscript {
//
//    repositories {
////        gradlePluginPortal()
////        gradleScriptKotlin()
//    }
//
//    dependencies {
////        classpath(kotlinModule("gradle-plugin"))
//        classpath(kotlin("gradle-plugin", "1.2.21"))
//    }
//}
//dependencies {
//    implementation(gradleKotlinDsl())
//    implementation(kotlin("stdlib", "1.2.21"))
//    compile(gradleApi())
//    compile(localGroovy())
//}
//
//repositories {
//    gradlePluginPortal()
////    gradleScriptKotlin()
//}



