package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {
    private static Session session = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        //crea la sesion en el dispositivo
        driver = FactoryDevice.make("android").create();
//      driver = FactoryDevice.make("browserStck").create();
    }
    public static Session getInstance() throws MalformedURLException {
        if (session == null)
            session = new Session();
        return session;
    }
    public void closeSession() {
        // cuando la prueba falla se cierra sesion
        driver.quit();
        session = null;
    }
    public AppiumDriver getDriver() {
        return driver;
    }
}
