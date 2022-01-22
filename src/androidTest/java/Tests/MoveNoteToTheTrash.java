package Tests;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import PageObject.NotesScreen;
import PageObject.TextNotescreen;
import PageObject.TrashScreen;

@RunWith(AndroidJUnit4.class)
public class MoveNoteToTheTrash extends TestBase{
    NotesScreen notesScreen = new NotesScreen();
    TextNotescreen textNotescreen = new TextNotescreen();
    TrashScreen trashScreen = new TrashScreen();

    private final String title = "New Note";

    @Test
    public void moveToTheTrash(){

        notesScreen.ClickOnExpandedImage();
        notesScreen.clickOnNotList();
        textNotescreen.addTitle(title);
        notesScreen.saveNote();
        textNotescreen.isSuccessfullyDisplayed(title);
        notesScreen.clickOnNote();
        textNotescreen.trashTheNote();
        notesScreen.openTrash();
        trashScreen.isSuccessfullyDisplayed(title);
    }
}
