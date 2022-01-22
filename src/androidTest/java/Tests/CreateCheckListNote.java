package Tests;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import PageObject.CheckListScreen;
import PageObject.NotesScreen;
import PageObject.TextNotescreen;

@RunWith(AndroidJUnit4.class)
public class CreateCheckListNote extends TestBase{

    NotesScreen notesScreen = new NotesScreen();
    CheckListScreen checkListScreen = new CheckListScreen();

    private final String title = "New Check List Note";
    @Test
    public void createCheckListNote(){
        notesScreen.ClickOnExpandedImage();
        notesScreen.clickOnCheckListNote();
        checkListScreen.addTitle(title);
        notesScreen.saveNote();
        checkListScreen.isSuccessfullyDisplayed(title);
    }
}
