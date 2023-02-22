import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

            String currentDir = System.getProperty("user.dir");
            String parentDir = new File(currentDir).getParentFile().getParentFile().getAbsolutePath();
            System.setProperty("webdriver.chrome.driver", parentDir + "/Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
