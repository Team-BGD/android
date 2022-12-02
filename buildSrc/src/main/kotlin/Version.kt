import org.gradle.api.JavaVersion

object Version {
    const val COMPILE_VERSION = 32
    const val MIN_VERSION = 28
    const val TARGET_VERSION = 32
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    val JAVA_VERSION = JavaVersion.VERSION_1_8

    const val GRADLE_ANDROID = "7.0.4"
    const val GRADLE_KOTLIN = "1.6.10"
    const val GRADLE_FIREBASE = "4.3.13"

    const val CONSTRAINT_LAYOUT = "2.1.2"
    const val CORE_KTX = "1.5.0"
    const val APP_COMPAT = "1.3.0"
    const val NAV = "2.5.2"
    const val ROOM = "2.4.3"

    const val HILT = "2.38.1"
    const val MATERIAL = "1.3.0"
    const val FIREBASE_BOM = "31.0.2"
    const val FIREBASE_ANALYTICS = "21.2.0"
    const val FIREBASE_MESSAGE = "23.1.0"

    const val RETROFIT = "2.7.1"
    const val OKHTTP = "3.14.9"

    const val COIL = "0.10.0"

    const val JUNIT = "4.13.2"
    const val ANDROID_JUNIT = "1.1.3"
    const val ESPRESSO_CORE = "3.4.0"
}