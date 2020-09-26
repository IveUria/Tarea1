package test;
import activityTodoApk.MainActivityTodoApk;
import activityTodoApk.TodoApkActivityAdd;
import activityTodoApk.TodoApkActivityMoreOptions;
import activityTodoApk.TodoApkActivitySearch;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;
import java.net.MalformedURLException;

public class TodoApkTest {
    MainActivityTodoApk mainActivityTodoApk = new MainActivityTodoApk();
    TodoApkActivityAdd todoApkActivity = new TodoApkActivityAdd();
    TodoApkActivitySearch todoApkActivitySearch = new TodoApkActivitySearch();
    TodoApkActivityMoreOptions todoApkActivityMoreOptions = new TodoApkActivityMoreOptions();

    private AppiumDriver driver;

   /* @Test // ingreso a la aplicacion
    public void testEntryApp() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
        String actualResult = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")).getText();
        String expectResult = "My List";
        Assert.assertEquals("Error no se ingreso",expectResult,actualResult);
    }*/
    @Test //ingresar a la opcion busqueda
    public void testMainFind() throws MalformedURLException {
        mainActivityTodoApk.searchButton.click();
        String actualResult = mainActivityTodoApk.resultSearchLabel.getText();
        String expectResult = "Enter text in Search Bar";
        Assert.assertEquals("Error no se encontro la busqueda",expectResult,actualResult);
    }

    @Test //busqueda de un item
    public void testFindITem() throws MalformedURLException {
        // creacion del item
        String title = "dos";
        mainActivityTodoApk.addListButton.click();
        todoApkActivity.markCheck.click();
        todoApkActivity.titleText.type(title);
        todoApkActivity.notesText.type("prueba dosssss");
        todoApkActivity.saveTextButton.click();
        //busqueda
        String textSearch= "dos"+"\\n";
        mainActivityTodoApk.searchButton.click();
        todoApkActivitySearch.titleTextSearch.type(textSearch);
        String actualResult = todoApkActivitySearch.cantSearch.getText();
        String expectResult = "1";
        Assert.assertEquals("Error no se encontro el item",expectResult,actualResult);
    }
    @Test  //mas opciones
    public void testMoreOptions () throws  MalformedURLException{
        mainActivityTodoApk.moreOptions.click();
        todoApkActivityMoreOptions.selectOptionHide.click();
        mainActivityTodoApk.moreOptions.click();
        String actualResult = todoApkActivityMoreOptions.selectOptionShow.getText();
        String expectResult = "Show Completed";
        Assert.assertEquals("Error!!! ",actualResult,expectResult);
    }

    @After
    public void testAfter() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
