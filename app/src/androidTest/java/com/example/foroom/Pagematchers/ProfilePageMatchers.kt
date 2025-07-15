package com.example.foroom.Pagematchers
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.design_system.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.containsString

object ProfilePageMatchers {

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

    val homeNavigationButton: Matcher<View> by lazy {
        withId(com.alternator.foroom.R.id.homeNavigationProfile)
    }

    val signOutButton: Matcher<View> by lazy {
        withId(com.alternator.foroom.R.id.signOutItem)
    }
}