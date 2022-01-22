package Tests;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import PageObject.NotesScreen;
import PageObject.TextNotescreen;

@RunWith(AndroidJUnit4.class)
public class CreateTextNote extends TestBase {
    NotesScreen notesScreen = new NotesScreen();
    TextNotescreen textNotescreen = new TextNotescreen();

    private final String title = "New Note";
    @Test
    public void createTextNote(){
        notesScreen.ClickOnExpandedImage();
        notesScreen.clickOnNotList();
        textNotescreen.addTitle(title);
        notesScreen.saveNote();
        textNotescreen.isSuccessfullyDisplayed(title);
    }

}
