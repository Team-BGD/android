plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    compileSdk = Version.COMPILE_VERSION
    namespace = "com.example.gdg"

    defaultConfig {
        applicationId = "com.example.gdg"
        minSdk = Version.MIN_VERSION
        targetSdk = Version.TARGET_VERSION
        versionCode = Version.VERSION_CODE
        versionName = Version.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Version.JAVA_VERSION
        targetCompatibility = Version.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Version.JAVA_VERSION.toString()
    }
    buildFeatures {
        dataBinding = true
    }
    packagingOptions.resources.excludes += setOf(
        "META-INF/DEPENDENCIES",
        "META-INF/LICENSE",
        "META-INF/LICENSE.txt",
        "META-INF/license.txt",
        "META-INF/NOTICE",
        "META-INF/NOTICE.txt",
        "META-INF/INDEX.LIST",
        "META-INF/notice.txt",
        "META-INF/ASL2.0",
        "META-INF/gradle/incremental.annotation.processors"
    )}

dependencies {
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Dependency.AndroidX.CORE_KTX)
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.NAV_FRAGMENT)
    implementation(Dependency.AndroidX.NAV_UI)
    implementation(Dependency.AndroidX.ROOM)
    kapt(Dependency.AndroidX.ROOM_COMPILER)
    implementation(Dependency.Google.HILT_ANDROID)
    kapt(Dependency.Google.HILT_ANDROID_COMPILER)
    implementation(Dependency.Google.MATERIAL)
    platform(Dependency.Google.FIREBASE_BOM)
    implementation(Dependency.Google.FIREBASE_ANALYTICS)
    implementation(Dependency.Google.FIREBASE_MESSAGE)
    implementation(Dependency.Libraries.RETROFIT)
    implementation(Dependency.Libraries.RETROFIT_CONVERTER_GSON)
    implementation(Dependency.Libraries.OKHTTP)
    implementation(Dependency.Libraries.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Dependency.Coil.COIL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.ANDROID_JUNIT)
    androidTestImplementation(Dependency.Test.ESPRESSO_CORE)
}