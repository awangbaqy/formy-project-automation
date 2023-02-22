import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class DragAndDrop {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String parentDir = new File(currentDir).getParentFile().getParentFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", parentDir + "/Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();

        driver.quit();
    }
}

