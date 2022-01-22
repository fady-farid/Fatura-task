package Tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;

import it.feio.android.omninotes.MainActivity;

public class TestBase {

    @Rule
    public ActivityTestRule<MainActivity> rule =
            new ActivityTestRule<>(MainActivity.class);
}
