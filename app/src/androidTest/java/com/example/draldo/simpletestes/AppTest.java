package com.example.draldo.simpletestes;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Draldo on 17/08/2016.
 */
public class AppTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSimpleClick() {
        onView(withId(R.id.a_main_text)).perform(typeText("Roma"));

        onView(withId(R.id.a_main_btn)).perform(click());

        onView(withId(R.id.a_detail_text)).check(matches(withText("amoR")));
    }

}
