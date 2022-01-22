package Tests;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import PageObject.BehaviorsScreen;
import PageObject.NotesScreen;
import PageObject.SettingsScreen;

@RunWith(AndroidJUnit4.class)
public class EnableSwipeToTrash extends TestBase{

    NotesScreen notesScreen = new NotesScreen();
    SettingsScreen settingsScreen = new SettingsScreen();
    BehaviorsScreen behaviorsScreen = new BehaviorsScreen();

    @Test
    public void enableSwipeToTrash(){
        notesScreen.openSettings();
        settingsScreen.openBehaviors();
        behaviorsScreen.swipeToTrashToggle();
    }
}
