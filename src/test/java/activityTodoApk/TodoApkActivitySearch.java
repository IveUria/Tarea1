package activityTodoApk;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class TodoApkActivitySearch {
    public TextBox titleTextSearch;
    public TextBox resultTextSearch;
    public Button exitButtonSearch;
    public Button returnButtonSearch;
    public Label cantSearch;

    public TodoApkActivitySearch(){

        titleTextSearch = new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));
        resultTextSearch = new TextBox(By.id("com.vrproductiveapps.whendo:id/search_list_item_text"));
        exitButtonSearch = new Button (By.id("com.vrproductiveapps.whendo:id/search_close_btn"));
        returnButtonSearch =  new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
        cantSearch = new Label(By.id("com.vrproductiveapps.whendo:id/search_header2"));
    }

}
