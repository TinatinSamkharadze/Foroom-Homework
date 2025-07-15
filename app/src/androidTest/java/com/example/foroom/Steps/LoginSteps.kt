package com.example.foroom.Steps

import com.example.foroom.Helper.isViewDisplayed
import com.example.foroom.Helper.tap
import com.example.foroom.Helper.typeText
import com.example.foroom.Pagematchers.LoginPageMatchers

class LoginSteps {

    fun enterUserName(name:String) : LoginSteps
    {
        with(LoginPageMatchers){
            nameInputField.typeText(name)
        }
        return this
    }

    fun pressSignUpButton() : LoginSteps
    {
        with(LoginPageMatchers){
            signUpButton.tap(1)
        }
        return this;
    }

    fun enterUserPassword(password:String) : LoginSteps
    {
         with(LoginPageMatchers){
             passwordInputField.typeText(password)
         }
        return this;
    }

    fun clickLoginInButton(): LoginSteps
    {
        with(LoginPageMatchers)
        {
            loginInButton.tap(1)
        }
        return this
    }

    fun validateErrorMessageForIncorrectPassword() : LoginSteps
    {
        with(LoginPageMatchers)
        {
            incorrectPasswordText.isViewDisplayed()
        }
        return this;
    }

    fun validateErrorMessageForIncorrectUser() : LoginSteps
    {
        with(LoginPageMatchers)
        {
            incorrectUserNameText.isViewDisplayed()
        }
        return this
    }
}