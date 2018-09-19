println("app start")
//apply plugin: 'com.android.application'
//apply {
//    plugin("com.android.application")
//    plugin("kotlin-android")
//    plugin("kotlin-kapt")
//    plugin("kotlin-android-extensions")
//}
plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("android-extensions")
    kotlin("kapt")
}


//val isComponentMode :Boolean by project
android {
    compileSdkVersion(deps.ext.compileSdkVersion)
    buildToolsVersion(deps.ext.buildToolsVersion)
    defaultConfig {
        minSdkVersion(deps.ext.minSdkVersion)
        targetSdkVersion(deps.ext.targetSdkVersion)
        versionCode = deps.ext.versionCode
        versionName = deps.ext.versionName


        multiDexEnabled = true
        applicationId = "com.hawksjamesf.simpleweather"
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
    }
}
dependencies {
    //    implementation fileTree (include: ['*.jar'], dir: 'libs')
//    implementation 'com.jakewharton:butterknife:8.8.1'
//    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
//    implementation 'com.google.dagger:dagger:2.11'
//    annotationProcessor 'com.google.dagger:dagger-compiler:2.11'
//    implementation "com.squareup.retrofit2:retrofit:${rootProject.ext.retrofitVersion}"
//    implementation "com.squareup.retrofit2:retrofit-converters:${rootProject.ext.retrofitVersion}"
//    implementation "com.squareup.retrofit2:converter-gson:${rootProject.ext.retrofitVersion}"
//    implementation "com.squareup.retrofit2:adapter-rxjava2:${rootProject.ext.retrofitVersion}"
////    implementation 'com.squareup.okhttp3:okhttp:3.8.1'
//    implementation 'com.squareup.okhttp3:logging-interceptor:3.4.1'
//    //    implementation 'com.jakewharton.timber:timber:4.5.1'
//    implementation 'com.orhanobut:logger:2.1.1'
////    implementation 'com.google.code.gson:gson:2.8.2'
//    implementation 'org.greenrobot:eventbus:3.0.0'
//    implementation "io.reactivex.rxjava2:rxjava:${rootProject.ext.rxjavaVersion}"
//    implementation 'com.tencent.bugly:crashreport:2.6.6.1'
//    implementation 'com.tencent.bugly:nativecrashreport:3.3.1'
//    // Test helpers for Room
//    testImplementation 'android.arch.persistence.room:testing:1.0.0'
//    // Room (use 1.1.0-alpha1 for latest alpha)
//    implementation 'android.arch.persistence.room:runtime:1.0.0'
//    annotationProcessor "android.arch.persistence.room:compiler:1.0.0"
//    // RxJava support for Room
//    implementation 'android.arch.persistence.room:rxjava2:1.0.0'
//    //    implementation "com.android.support:multidex:1.0.1"
//    implementation "com.android.support:appcompat-v7:${rootProject.ext.supportLibraryVersion}"
//    implementation "com.android.support:design:${rootProject.ext.supportLibraryVersion}"
//    implementation "com.android.support:recyclerview-v7:${rootProject.ext.supportLibraryVersion}"
//    implementation project (path: ':location')

    //==========================
    implementation(fileTree(mapOf(
            "dir" to "libs",
            "include" to listOf("*.jar")
    )))
//    implementation(project(mapOf(
//            "path" to "location"
//    )))
    implementation("com.jakewharton:butterknife:8.8.1")
    kapt("com.jakewharton:butterknife-compiler:8.8.1")
    implementation("com.google.dagger:dagger:2.11")
    kapt("com.google.dagger:dagger-compiler:2.11")
    implementation("com.squareup.retrofit2:retrofit:${deps.ext.retrofitVersion}")
    implementation("com.squareup.retrofit2:retrofit-converters:${deps.ext.retrofitVersion}")
    implementation("com.squareup.retrofit2:converter-gson:${deps.ext.retrofitVersion}")
    implementation("com.squareup.retrofit2:adapter-rxjava2:${deps.ext.retrofitVersion}")
//    implementation("om.squareup.okhttp3:okhttp:3.8.1")
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.0")
    //    implementation("om.jakewharton.timber:timber:4.5.1")
    implementation("com.orhanobut:logger:2.1.1")
//    implementation("om.google.code.gson:gson:2.8.2")
    implementation("org.greenrobot:eventbus:3.1.1")
    implementation("io.reactivex.rxjava2:rxjava:${deps.ext.rxjavaVersion}")
    implementation("com.tencent.bugly:crashreport:2.6.6.1")
    implementation("com.tencent.bugly:nativecrashreport:3.3.1")
    // Test helpers for Room
    testImplementation("android.arch.persistence.room:testing:${deps.ext.roomVersion}")
    // Room (use 1.1.0-alpha1 for latest alpha)
    implementation("android.arch.persistence.room:runtime:${deps.ext.roomVersion}")
//    kapt("android.arch.persistence.room:compiler:${deps.ext.roomVersion}")
    // RxJava support for Room
    implementation("android.arch.persistence.room:rxjava2:${deps.ext.roomVersion}")
    //    implementation("om.android.support:multidex:1.0.1")
    implementation("com.android.support:appcompat-v7:${deps.ext.supportLibraryVersion}")
    implementation("com.android.support:design:${deps.ext.supportLibraryVersion}")
    implementation("com.android.support:recyclerview-v7:${deps.ext.supportLibraryVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:${deps.ext.kotlinVersion}")
}
println("app end")
