package deviceFactory;

public class FactoryDevice {
    //metodo encargado de la creacion  de las conexiones
    public static IDevice make(String type){
        IDevice device;
        switch (type){
            case "android": { device =new Android(); break;}
            //case "browserStack": {device = new BrowserStack(); break; }
            default : device =new Android(); break;
        }
        return device;
    }
}
