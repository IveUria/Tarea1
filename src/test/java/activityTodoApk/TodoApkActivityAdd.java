package activityTodoApk;

import appiumControl.Button;
import appiumControl.Control;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class TodoApkActivityAdd {

    public Button markCheck;
    public TextBox titleText;
    public TextBox notesText;
    public TextBox emailText;
    public Button saveTextButton;
    public TodoApkActivityAdd(){

        markCheck = new Button(By.id("com.vrproductiveapps.whendo:id/note_item_marked"));
        titleText = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notesText = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        emailText = new TextBox(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
        saveTextButton = new Button (By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
