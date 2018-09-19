println("lib location start")
//if (isComponentMode.toBoolean()) {
//    apply plugin: 'com.android.application'
////    apply plugin: 'versionplugin'
//} else {
//    apply plugin: 'com.android.library'
//}
//apply {
//    plugin("com.android.library")
//    plugin("kotlin-android")
//    plugin("kotlin-kapt")
//    plugin("kotlin-android-extensions")
//}

plugins {
    id("com.android.library")
    kotlin("android")
//    kotlin("android-extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(deps.ext.compileSdkVersion)
    buildToolsVersion(deps.ext.buildToolsVersion)
    defaultConfig {
        minSdkVersion(deps.ext.minSdkVersion)
        targetSdkVersion(deps.ext.targetSdkVersion)
        versionCode = deps.ext.versionCode
        versionName = deps.ext.versionName

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
//            buildConfigField("String", "BASE_URL", '"https://weatherapi.market.xiaomi.com"')
        }
        getByName("debug") {
            isMinifyEnabled = false
//            buildConfigField("String", "BASE_URL", '"https://api.caiyunapp.com/"')
//            buildConfigField("String", "BASE_URL", '"https://weatherapi.market.xiaomi.com"')
        }
//        getByName("component") {
//            initWith(debug)
//            debuggable = true
//        }
    }

}
//    if (isComponentMode.toBoolean()) {
//        versionPlugin {
//            buildTypeMatcher = 'debug'
////        '$appName/project/buildType-v_$versionName-c_$versionCode'
////        fileFormat = '$appName-v_$versionName-c_$versionCode'
//            fileFormat = '$project-$appName-$buildType-v_$versionName-c_$versionCode'
//
//        }
//    }

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    testImplementation("junit:junit:${deps.ext.junitVersion}")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")


    implementation("io.reactivex.rxjava2:rxjava:${deps.ext.rxjavaVersion}")
    implementation("com.android.support:design:${deps.ext.supportLibraryVersion}")
    implementation("com.android.support:appcompat-v7:${deps.ext.supportLibraryVersion}")
}
println("lib location end")