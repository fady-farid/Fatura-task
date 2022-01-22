package PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import it.feio.android.omninotes.R;

public class CheckListScreen {

    private final int titleHeader = R.id.detail_title;

    public void addTitle(String title){
        onView(withId(titleHeader)).perform(typeText(title));
    }

    public void isSuccessfullyDisplayed(String title){
        onView(withText(title)).check(matches(isDisplayed()));
    }
}
