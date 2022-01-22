package PageObject;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import it.feio.android.omninotes.R;
public class TextNotescreen {

    private final int titleHeader = R.id.detail_title;

    public void addTitle(String title){
            onView(withId(titleHeader)).perform(typeText(title));
    }

    public void isSuccessfullyDisplayed(String title){
        onView(withText(title)).check(matches(isDisplayed()));
    }

    public void trashTheNote(){
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Trash")).perform(click());
    }
}
