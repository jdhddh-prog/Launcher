# ProGuard rules for Android application
# Date: 2026-01-06 15:15:22 UTC

# ============================================================================
# General Android Rules
# ============================================================================

-optimizationpasses 5
-dontusemixedcaseclassnames
-verbose

# Preserve line numbers for stack traces
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Preserve exceptions
-keepattributes Exceptions

# ============================================================================
# Hilt Dependency Injection Rules
# ============================================================================

-keep class dagger.hilt.** { *; }
-keep class hilt_aggregated_deps.** { *; }
-keep class * extends dagger.hilt.android.HiltAndroidApp { *; }
-keep @dagger.hilt.** class * { *; }
-keep @javax.inject.* class * { *; }
-keep @javax.inject.* interface * { *; }

# Hilt entry points
-keep @dagger.hilt.android.AndroidEntryPoint class * { *; }
-keep @dagger.hilt.android.lifecycle.HiltViewModel class * { *; }

# ============================================================================
# Room Database Rules
# ============================================================================

-keep class androidx.room.** { *; }
-keep @androidx.room.Entity class * { *; }
-keep @androidx.room.Database class * { *; }
-keep @androidx.room.Dao class * { *; }

# Room annotations
-keepattributes *Annotation*
-keep class * extends androidx.room.RoomDatabase { *; }
-keep interface * extends androidx.room.Dao { *; }

# ============================================================================
# Retrofit Rules
# ============================================================================

-keep class retrofit2.** { *; }
-keep interface retrofit2.** { *; }
-keep class retrofit2.adapter.** { *; }
-keep class retrofit2.converter.** { *; }
-keepattributes Signature
-keepattributes InnerClasses

# Retrofit annotations
-keepattributes *Annotation*
-keep interface * { *Annotation*; }

# OkHttp (used by Retrofit)
-dontwarn okhttp3.**
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }

# ============================================================================
# Gson Rules
# ============================================================================

-keep class com.google.gson.** { *; }
-keep interface com.google.gson.** { *; }

# Preserve generic types
-keepattributes Signature
-keepattributes *Annotation*

# Preserve classes with Gson annotations
-keep class * implements com.google.gson.JsonSerializer { *; }
-keep class * implements com.google.gson.JsonDeserializer { *; }

# Preserve your model classes
-keepclassmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
    @com.google.gson.annotations.Expose <fields>;
}

# ============================================================================
# Kotlin Rules
# ============================================================================

-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# Kotlin metadata
-keepattributes *Annotation*
-keep class kotlin.** { *; }
-keep class kotlin.jvm.** { *; }
-keep interface kotlin.** { *; }

# Kotlin extensions
-keep class androidx.core.graphics.drawable.DrawableKt { *; }

# Data classes
-keep class * implements kotlin.jvm.internal.MappedSuperclass { *; }
-keepclasseswithmembernames class * {
    java.lang.String <init>(...);
}

# ============================================================================
# Ktor Client Rules
# ============================================================================

-keep class io.ktor.** { *; }
-keep interface io.ktor.** { *; }
-keep class io.ktor.client.** { *; }
-keep class io.ktor.client.engine.** { *; }
-keep class io.ktor.client.features.** { *; }

# Ktor annotations
-keepattributes *Annotation*
-keep @io.ktor.** class * { *; }

# ============================================================================
# kotlinx-serialization Rules
# ============================================================================

-keep class kotlinx.serialization.** { *; }
-keep class kotlinx.serialization.internal.** { *; }
-keep class kotlinx.serialization.json.** { *; }

# Serializable classes
-keep @kotlinx.serialization.Serializable class * { *; }

# Keep classes with @Serializer annotation
-keep class * implements kotlinx.serialization.KSerializer { *; }

# Keep companion objects of Serializable classes
-keepclassmembers class ** {
    *** companion;
}

# Preserve SerialNames
-keepattributes SerialName
-keepattributes Serializable

# ============================================================================
# AndroidX Rules
# ============================================================================

-keep class androidx.** { *; }
-keep interface androidx.** { *; }
-dontwarn androidx.**

# ============================================================================
# Lifecycle Rules
# ============================================================================

-keep class androidx.lifecycle.** { *; }
-keep interface androidx.lifecycle.** { *; }

# ============================================================================
# AppCompat Rules
# ============================================================================

-keep class androidx.appcompat.** { *; }
-keep interface androidx.appcompat.** { *; }

# ============================================================================
# Fragment Rules
# ============================================================================

-keep class androidx.fragment.app.Fragment { *; }
-keep class * extends androidx.fragment.app.Fragment { *; }

# ============================================================================
# ViewModel Rules
# ============================================================================

-keep class androidx.lifecycle.ViewModel { *; }
-keep class * extends androidx.lifecycle.ViewModel { *; }

# ============================================================================
# Keep your application classes
# ============================================================================

-keep class com.example.** { *; }
-keep interface com.example.** { *; }

# ============================================================================
# Debugging and Logging
# ============================================================================

# Keep line numbers for debugging
-keepattributes SourceFile,LineNumberTable

# Remove logging calls in release builds
# Uncomment if using a logging library
# -assumenosideeffects class android.util.Log {
#     public static *** d(...);
#     public static *** v(...);
#     public static *** i(...);
# }

# ============================================================================
# Native Methods
# ============================================================================

-keepclasseswithmembernames class * {
    native <methods>;
}

# ============================================================================
# Enums
# ============================================================================

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# ============================================================================
# Parcelable Classes
# ============================================================================

-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# ============================================================================
# Serializable Classes
# ============================================================================

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# ============================================================================
# View Classes
# ============================================================================

-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}

# ============================================================================
# R Classes
# ============================================================================

-keepclassmembers class **.R$* {
    public static <fields>;
}

# ============================================================================
# BuildConfig
# ============================================================================

-keep class **.BuildConfig { *; }
