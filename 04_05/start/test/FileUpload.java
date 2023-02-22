import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.io.File;


public class FileUpload {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String parentDir = new File(currentDir).getParentFile().getParentFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", parentDir + "/Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));

        fileUploadField.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
