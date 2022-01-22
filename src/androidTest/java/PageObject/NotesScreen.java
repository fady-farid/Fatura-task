package PageObject;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.DrawerMatchers.isOpen;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.contrib.DrawerActions;

import it.feio.android.omninotes.R;

public class NotesScreen {

    private final int expandedImg = R.id.fab_note;
    private final int drawer = R.id.drawer_layout;
    private  final int checkList = R.id.fab_checklist;
    private final int note = R.id.note_title;

    public void ClickOnExpandedImage()
    {
        onView(withId(expandedImg)).perform(click());
    }

    public void clickOnNotList(){
        onView(withId(expandedImg)).perform(click());
    }

    public  void saveNote(){
        closeSoftKeyboard();
        pressBack();
    }

    public void clickOnCheckListNote(){
        onView(withId(checkList)).perform(click());
    }

    public void clickOnNote(){
        onView(withId(note)).perform(click());
    }

    public void openTrash(){
        onView(withId(drawer)).perform(DrawerActions.open())
                .check(matches(isOpen()));

        onView(withText("Trash")).perform(click());
    }

    public void openSettings(){
        onView(withId(drawer)).perform(DrawerActions.open())
                .check(matches(isOpen()));

        onView(withId(R.id.settings_view)).perform(click());
    }
}
