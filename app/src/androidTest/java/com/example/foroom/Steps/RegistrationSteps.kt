package com.example.foroom.Steps

import com.example.foroom.Helper.tap
import com.example.foroom.Helper.typeText
import com.example.foroom.Pagematchers.RegistrationPageMatchers
import net.datafaker.Faker


class RegistrationSteps {

    fun enterUserNameToRegister(name:String) : RegistrationSteps
    {
        with(RegistrationPageMatchers){
            nameInputField.typeText(name)
        }
        return this
    }

    fun enterPasswordToRegister(password:String) : RegistrationSteps
    {
        with(RegistrationPageMatchers)
        {
            passwordInputField.typeText(password)
        }
        return this;
    }

    fun repeatPassword(password:String) : RegistrationSteps
    {
        with(RegistrationPageMatchers)
        {
            repeatPasswordInputField.typeText(password)
        }
        return this;
    }

    fun clickSignUpButton() : RegistrationSteps
    {
        with(RegistrationPageMatchers)
        {
            signUpButton.tap(1)
        }
        return this
    }

    fun generateCustomPassword(faker: Faker): String {
        val upperCase = faker.letterify("?").uppercase()
        val numbers = faker.number().numberBetween(10, 99)
        val lowerCase = faker.letterify("???")
        val specialChar = listOf("!", "@", "#", "$", "%", "^", "&", "*").random()
        return "$upperCase$numbers$lowerCase$specialChar"
    }
}