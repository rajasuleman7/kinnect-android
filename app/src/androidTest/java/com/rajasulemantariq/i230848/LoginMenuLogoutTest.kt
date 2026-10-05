package com.rajasulemantariq.i230848

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.onView
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginMenuLogoutTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun login_menu_logout_returnsToLogin() {
        onView(withId(R.id.btn_login)).perform(click())
        onView(withId(R.id.nav_menu)).perform(click())
        onView(withId(R.id.btn_logout)).perform(click())
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()))
    }
}