import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SwitchToAlert {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String parentDir = new File(currentDir).getParentFile().getParentFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", parentDir + "/Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
