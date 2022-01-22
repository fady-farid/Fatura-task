package PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.contrib.RecyclerViewActions;

import it.feio.android.omninotes.R;

public class SettingsScreen {

    private final int behaviorItem = 4;

    public void openBehaviors(){
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(behaviorItem,click()));
    }
}
