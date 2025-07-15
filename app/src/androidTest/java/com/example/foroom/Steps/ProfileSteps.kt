package com.example.foroom.Steps
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.foroom.Helper.tap
import com.example.foroom.Helper.waitForViewVisible
import com.example.foroom.Pagematchers.ProfilePageMatchers

class ProfileSteps {

    fun clickOnProfile() : ProfileSteps
    {
        with(ProfilePageMatchers)
        {
            homeNavigationButton.tap(1)
        }
        return this
    }

    fun validateUserIsCreated(username: String): ProfileSteps {
        with(ProfilePageMatchers) {
            nameInputField.matches(withText(username))
        }
        return this
    }

    fun clickSignOutButton() : ProfileSteps{
        with(ProfilePageMatchers)
        {
            signOutButton.tap(1)
        }
        return this
    }
}