package com.example.foroom.Pagematchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.design_system.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.containsString

object LoginPageMatchers {
    val nameInputField: Matcher<View> by lazy {
        allOf(withId(R.id.inputEditText),
            withHint(containsString("მომხმარებლის")))
    }

    val signUpButton: Matcher<View> by lazy {
        withId(com.alternator.foroom.R.id.signUpButton)
    }

    val loginInButton : Matcher<View> by lazy {
        withId(com.alternator.foroom.R.id.logInButton)
    }

    val passwordInputField: Matcher<View>by lazy {
        allOf(withId(R.id.inputEditText), withHint("პაროლი"))
    }

    val incorrectPasswordText : Matcher<View>by lazy{allOf(withId(R.id.descriptionTextView),
        withText("პაროლი არასწორია")) }

    val incorrectUserNameText : Matcher<View>by lazy{allOf(withId(R.id.descriptionTextView),
        withText("მომხმარებელი ვერ მოიძებნა")) }

}

















