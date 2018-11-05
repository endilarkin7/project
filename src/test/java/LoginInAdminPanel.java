import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginInAdminPanel {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    driver.findElement(By.name("email")).sendKeys("webinar.test@gmail.com");
    driver.findElement(By.name("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
    driver.findElement(By.name("submitLogin")).click();
    try{
            Thread.sleep(5000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace(); }
    driver.findElement(By.cssSelector("[width='32']")).click();
    driver.findElement(By.id("header_logout")).click();
    driver.quit();

    }

}

