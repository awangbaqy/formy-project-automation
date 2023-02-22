import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.security.Key;

public class Form {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String parentDir = new File(currentDir).getParentFile().getParentFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", parentDir + "/Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Awang");
        driver.findElement(By.id("last-name")).sendKeys("Baqy");
        driver.findElement(By.id("job-title")).sendKeys("Driver");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("01/01/2001");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
