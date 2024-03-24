# Dependency Injection using Dagger 2

### Used API -  https://fakestoreapi.com

## Project SetUp -
    // Dagger - 2
    implementation ("com.google.dagger:dagger:2.51")
    kapt ("com.google.dagger:dagger-compiler:2.51")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Room
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:2.6.1")

    //Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")


# Project Work Flow :
## Retrofit SetUp
  - Create the Data class
  - Create the api interface
  - Now create the module class for retrofit object inside di package
    - Annotate this class as module.
    - Create a fun with return type Retrofit and Annotate it as Singleton and Produce
    - Create a fun with return type of API interface and Annotate it as Singleton and Producers.
  - Create application component class.
    - Annotate it with singleton and component & mention your modules.
    - Create the inject fun.
  - Now create the repository class


