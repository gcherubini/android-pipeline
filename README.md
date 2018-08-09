# Android Pipeline

1 - Create Android application following Android Studio Wizard, 
you may choose any prefered language (Android or Kotlin)

## Learning the basics of Build

1 - Run the Gradle build task: 
./gradlew build

## Learning the basics of Unit Testing

1 - Open "ExampleUnitTest" file and make the test fail

 ```
 class ExampleUnitTest {
     @Test
     fun addition_isCorrect() {
         Assert.assertEquals(5, 2 + 2)
     }
 }
 ```

2 - Run the Gradle test task: 
./gradlew test

If there is some unit test failing it will appear in your console:

```
> Task :app:testDebugUnitTest FAILED

com.tw.pipeline.ExampleUnitTest > addition_isCorrect FAILED
    java.lang.AssertionError at ExampleUnitTest.kt:9

2 tests completed, 1 failed


FAILURE: Build failed with an exception.
```

3 - Fix the unit test that you have modified, and run the command again.
Just a Build Succeed will appear:

```
BUILD SUCCESSFUL in 5s
38 actionable tasks: 6 executed, 32 up-to-date
```

If you want to run your tests for only one build type (this can be important for a large test suite) you can use ./gradlew testDebug or ./gradlew testRelease.


## Learning the basics of Android UI testing

1 - Be connected with some Android device (real or emulator)

2 - Open "ExampleInstrumentedTest" file and make the test fail

 ```
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("package.name.to.fail", appContext.packageName)
    }
}
 ```

3 - Run the Gradle test task: 
./gradlew connectedAndroidTest

If there is some unit test failing it will appear in your console:

```
Starting 1 tests on Nexus_5_API_27_PLAY(AVD) - 8.1.0ctedAndroidTest 

com.tw.pipeline.ExampleInstrumentedTest > useAppContext[Nexus_5_API_27_PLAY(AVD) - 8.1.0] FAILED 
        org.junit.ComparisonFailure: expected:<[different.name.of.packag]e> but was:<[com.tw.pipelin]e>
        at org.junit.Assert.assertEquals(Assert.java:115)
Starting 1 tests on Moto E (4) - 7.1.1

com.tw.pipeline.ExampleInstrumentedTest > useAppContext[Moto E (4) - 7.1.1] FAILED 
        org.junit.ComparisonFailure: expected:<[different.name.of.packag]e> but was:<[com.tw.pipelin]e>
        at org.junit.Assert.assertEquals(Assert.java:115)

FAILURE: Build failed with an exception.
```

4 - Fix the UI test that you have modified, and run the command again.
Just a Build Succeed will appear:

```
Starting 1 tests on Nexus_5_API_27_PLAY(AVD) - 8.1.0

BUILD SUCCESSFUL in 26s
52 actionable tasks: 1 executed, 51 up-to-date
```

If you want to run your tests for only one build type (this can be important for a large test suite) you can use ./gradlew connectedDebugAndroidTest or ./gradlew connectedReleaseAndroidTest.
