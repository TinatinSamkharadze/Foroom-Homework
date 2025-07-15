package com.example.foroom.Pagematchers

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withClassName
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.design_system.R

import com.google.android.material.textfield.TextInputLayout
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.equalTo

object RegistrationPageMatchers {
    val passwordInputField: Matcher<View> by lazy {
        allOf(
            withId(R.id.inputEditText),
            withHint("პაროლი"),
            isDescendantOfA(allOf(
                withId(com.alternator.foroom.R.id.passwordInput),
                hasSibling(withId(com.alternator.foroom.R.id.listView))
            )),
            isDisplayed()
        )
    }

    val repeatPasswordInputField: Matcher<View> by lazy {
        allOf(
            withId(R.id.inputEditText),
            withHint("გაიმეორეთ პაროლი"),
            isDescendantOfA(allOf(
                withId(com.alternator.foroom.R.id.repeatPasswordInput),
                hasSibling(withId(com.alternator.foroom.R.id.listView))
            )),
            isDisplayed()
        )
    }

    val nameInputField: Matcher<View> by lazy {
        allOf(
            withId(R.id.inputEditText),
            withHint(containsString("მომხმარებლის")),
            isDescendantOfA(allOf(
                withId(com.alternator.foroom.R.id.userNameInput),
                hasSibling(withId(com.alternator.foroom.R.id.listView))
            )),
            isDisplayed()
        )
    }

    val signUpButton: Matcher<View> by lazy {
        allOf(
            withId(com.alternator.foroom.R.id.signUpButton),
            hasSibling(withId(com.alternator.foroom.R.id.logInTextView)),
            isDisplayed()
        )
    }
}