package singletonSession;

import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import util.GetProperties;


public class Session {
    private static Session session = null;
    private final AppiumDriver device;

    private Session() {
        device = FactoryDevice.make(GetProperties.getInstance().getPlatformName()).create();
    }

    public static Session getSession() {
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession() {
        device.quit();
        session = null;
    }

    public AppiumDriver getDevice() {
        return device;
    }
}
