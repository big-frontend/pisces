println("app start")
//apply plugin: 'com.android.application'
//apply {
//    plugin("com.android.application")
//    plugin("kotlin-android")
//    plugin("kotlin-kapt")
//}
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

//android {
//    compileSdkVersion(rootProject.ext.compileSdkVersion)
//    buildToolsVersion(rootProject.ext.buildToolsVersion)
//    defaultConfig {
//        minSdkVersion(rootProject.ext.minSdkVersion)
//        targetSdkVersion(rootProject.ext.targetSdkVersion)
//        versionCode = rootProject.ext.versionCode
//        versionName = rootProject.ext.versionName
//
//
//        multiDexEnabled = true
//        applicationId = "com.hawksjamesf.simpleweather"
//        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
//    }
//    buildTypes {
//        getByName("release") {
//            isMinifyEnabled = false
//            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
////            buildConfigField("String", "BASE_URL", '"https://weatherapi.market.xiaomi.com"')
//        }
//        getByName("debug") {
//            buildConfigField("String", "BASE_URL", '"https://api.caiyunapp.com/"')
//            buildConfigField("String", "BASE_URL", '"https://weatherapi.market.xiaomi.com"')
//        }
//    }
//    sourceSets {
//        getByName("main") {
//            java.srcDirs("src/main/kotlin")
//        }
//    }
//}
android {
    compileSdkVersion(26)
    buildToolsVersion("27.0.0")

    defaultConfig {
        applicationId = "com.youngfeng.kotlindsl"
        minSdkVersion(17)
        targetSdkVersion(26)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            buildConfigField("String", "BASE_URL", "https://weatherapi.market.xiaomi.com")
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
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
//    implementation fileTree (include: ['*.jar'], dir: 'libs')
    implementation("com.jakewharton:butterknife:8.8.1")
//    kapt("com.jakewharton:butterknife-compiler:8.8.1")
    implementation("com.google.dagger:dagger:2.1")
    kapt("com.google.dagger:dagger-compiler:2.11")
    implementation("com.squareup.retrofit2:retrofit:2.3.0")
    implementation("com.squareup.retrofit2:retrofit-converters:2.3.0")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.3.0")
//    implementation("om.squareup.okhttp3:okhttp:3.8.1")
    implementation("com.squareup.okhttp3:logging-interceptor:3.4.1")
    //    implementation("om.jakewharton.timber:timber:4.5.1")
    implementation("com.orhanobut:logger:2.1.1")
//    implementation("om.google.code.gson:gson:2.8.2")
    implementation("org.greenrobot:eventbus:3.0.0")
    implementation("io.reactivex.rxjava2:rxjava:2.1.10")
    implementation("com.tencent.bugly:crashreport:2.6.6.1")
    implementation("com.tencent.bugly:nativecrashreport:3.3.1")
    // Test helpers for Room
    testImplementation("android.arch.persistence.room:testing:1.0.0")
    // Room (use 1.1.0-alpha1 for latest alpha)
    implementation("android.arch.persistence.room:runtime:1.0.0")
//    kapt("android.arch.persistence.room:compiler:1.0.0")
    // RxJava support for Room
    implementation("android.arch.persistence.room:rxjava2:1.0.0")
    //    implementation("om.android.support:multidex:1.0.1")
    implementation("com.android.support:appcompat-v7:27.0.2")
    implementation("com.android.support:design:27.0.2")
    implementation("com.android.support:recyclerview-v7:27.0.2")
//    implementation project (path: ':location')
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.21")
}
println("app end")
