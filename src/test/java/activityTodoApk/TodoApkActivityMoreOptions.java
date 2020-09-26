package activityTodoApk;

import appiumControl.Button;
import org.openqa.selenium.By;

public class TodoApkActivityMoreOptions {

    public Button selectOptionHide;
    public Button selectOptionShow;


    public TodoApkActivityMoreOptions(){

        selectOptionHide = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
        selectOptionShow = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));

    }
}
