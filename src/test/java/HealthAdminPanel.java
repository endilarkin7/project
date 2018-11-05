import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthAdminPanel {

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

        driver.findElement(By.cssSelector("[data-submenu='1'] span")).click();
        System.out.println("Page title is " + driver.getTitle());

        driver.findElement(By.xpath("//li[@id='tab-AdminDashboard']//span[.='Dashboard']")).click();
        driver.findElement(By.xpath("//li[@id='subtab-AdminParentCustomer']//span[contains(text(),Пульт)]")).isDisplayed();
        driver.navigate().refresh();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace(); }

        driver.findElement(By.xpath("//li[@id='subtab-AdminParentOrders']//span[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//li[@id='subtab-AdminParentOrders']//span[1]")).isDisplayed();


        driver.findElement(By.xpath("//li[@id='subtab-AdminCatalog']//span[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@id='main-div']//h2[@class='title']")).isDisplayed();

        driver.findElement(By.xpath("//nav[@class='nav-bar']/ul[@class='main-menu']/li[5]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title']")).isDisplayed();


        driver.findElement(By.xpath("//li[@id='subtab-AdminParentCustomerThreads']//span[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title']")).isDisplayed();

        driver.findElement(By.xpath("//li[@id='subtab-AdminStats']//span[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title']")).isDisplayed();
        driver.findElement(By.linkText("Modules")).click();
        driver.navigate().refresh();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace(); }

        driver.findElement(By.xpath("//span[@id='categories']/span[1]"));

        driver.findElement(By.linkText("Design")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title'][contains(text(), Шаблон)]")).isDisplayed();

        driver.findElement(By.linkText("Доставка")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title'][contains(text(), Перевозчики)]"));

        driver.findElement(By.linkText("Способ оплаты")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//following-sibling::h2")).isDisplayed();

        driver.findElement(By.linkText("International")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title'][contains(text(), Локализация)]")).isDisplayed();

        driver.findElement(By.linkText("Shop Parameters")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title'][contains(text(),General)]")).isDisplayed();

        driver.findElement(By.linkText("Конфигурация")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html//div[@id='content']//h2[@class='page-title'][contains(text(),Information)]")).isDisplayed();

        driver.findElement(By.cssSelector("[width='32']")).click();
        driver.findElement(By.id("header_logout")).click();
        driver.quit();

    }


}

