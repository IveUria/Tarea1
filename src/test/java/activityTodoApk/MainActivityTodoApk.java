package activityTodoApk;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivityTodoApk {
    public Button addListButton;
    public Button searchButton;
    public Button selectButton;
    public Button navegationButton;
    public Label resultSearchLabel;
    public Button moreOptions;

    public MainActivityTodoApk(){
        addListButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
        selectButton = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        navegationButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
        resultSearchLabel = new Label(By.id("com.vrproductiveapps.whendo:id/search_header"));
        moreOptions = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
    }
    public boolean isDisplayedItem (String nameItem){
        String locator = ""+nameItem+"" +"'";
        Label contact = new Label(By.xpath(locator));
        return  contact.isDisplayed();
    }
}
