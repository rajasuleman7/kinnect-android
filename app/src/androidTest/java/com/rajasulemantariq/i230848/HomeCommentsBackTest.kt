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
class HomeCommentsBackTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun home_comments_back_returnsHome() {
        onView(withId(R.id.btn_comment)).perform(click())
        onView(withId(R.id.btn_back)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.btn_comment)).check(matches(isDisplayed()))
    }
}