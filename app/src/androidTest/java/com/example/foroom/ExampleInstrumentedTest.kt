package com.example.foroom

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.foroom.Steps.LoginSteps
import com.example.foroom.Steps.ProfileSteps
import com.example.foroom.Steps.RegistrationSteps
import com.example.foroom.presentation.ui.activity.ForoomActivity
import net.datafaker.Faker
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activity = ActivityScenarioRule(ForoomActivity::class.java)
    val loginSteps = LoginSteps()
    val registrationSteps = RegistrationSteps()
    val profileSteps = ProfileSteps()
    val VALID_USER_NAME = "Tiko1111"
    val VALID_USER_PASSWORD = "D0nk3!"
    val INVALID_USER_NAME = "Natia5555"
    val INVALID_USER_PASSOWRD = "Tiko1111"
    val faker = Faker()
    val generatedUsername = faker.name().username()
    val generatedPassword = registrationSteps.generateCustomPassword(faker)

//    @Test()
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        assertEquals("com.example.foroom", appContext.packageName)
//    }

    @Test
    fun validateInvalidName()
    {
        loginSteps
            .enterUserName(INVALID_USER_NAME)
            .enterUserPassword(VALID_USER_PASSWORD)
            .clickLoginInButton()
            .validateErrorMessageForIncorrectUser()
    }
    @Test
    fun validateInvalidPassword()
    {
        loginSteps
            .enterUserName(VALID_USER_NAME)
            .enterUserPassword(INVALID_USER_PASSOWRD)
            .clickLoginInButton()
            .validateErrorMessageForIncorrectPassword()

    }

    @Test
    fun registerUserAndValidate()
    {
        loginSteps
            .pressSignUpButton()
        registrationSteps
            .enterUserNameToRegister(generatedUsername)
            .enterPasswordToRegister(generatedPassword)
            .repeatPassword(generatedPassword)
            .clickSignUpButton()
        profileSteps
            .clickOnProfile()
            .validateUserIsCreated(generatedUsername)
            .clickOnProfile()
            .clickSignOutButton()
    }
}