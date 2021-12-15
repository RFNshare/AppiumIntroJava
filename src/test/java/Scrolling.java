import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Scrolling extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Dimension windowSize = driver.manage().window().getSize();

        Double scrollHeightStart = windowSize.getHeight() * 0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = windowSize.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();

//        new TouchActions((PerformsActions) driver).longPress(press)
    }
}
