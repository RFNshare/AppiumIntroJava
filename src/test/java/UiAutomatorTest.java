import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomatorTest extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElementByAndroidUIAutomator("att(val)").click();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//        driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
//        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
        driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").get(1).click();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());;
    }
}

