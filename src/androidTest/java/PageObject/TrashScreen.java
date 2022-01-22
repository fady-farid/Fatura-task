package PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class TrashScreen {

    public void isSuccessfullyDisplayed(String title){
        onView(withText(title)).check(matches(isDisplayed()));
    }
}
