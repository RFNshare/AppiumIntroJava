import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class Gestures extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//        driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
//        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        TouchActions t = new TouchActions(driver);
//        t.singleTap(driver.findElementByXPath("\"//android.widget.TextView[@text='People Names']\""));
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//        t.singleTap(tapOptions().withElement(ElementOption.element(WebElement)));


//        WebElement expandList =
//                driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists");
//
//        TouchActions t = new TouchActions(driver);
//        t.singleTap(expandList);
//        t.perform();


        driver.quit();

    }
}
