package factoryDevices;

public class FactoryDevice {
    public static IDevices make(String typeDevice) {
        IDevices device;
        switch (typeDevice) {
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new Ios();
                break;
            case "androidCloud":
                device = new AndroidCloud();
                break;
            default:
                device = null;
                break;
        }
        return device;
    }
}
