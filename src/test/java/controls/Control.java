package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator) {
        this.locator = locator;
    }

    public void findControl() {
        this.control = Session.getSession().getDevice().findElement(this.locator);
    }

    public void clickControl() {
        this.findControl();
        this.control.click();
    }

    public void typeValue(String value) {
        this.findControl();
        this.control.sendKeys(value);
    }

    public String getTextControl() {
        this.findControl();
        return this.control.getText();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
