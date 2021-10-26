import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class AddtoBasket {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Monster/Desktop/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sosyopix.com/");

        WebElement find =driver.findElement(By.xpath("//div/ul/li/a[@href='/sosyopix-art-c-116']"));

        find.click();

        WebElement find2 = driver.findElement(By.xpath("//div/div/div/div/a[@href='/art-kanvas-tablolar-c-117']"));

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(find2));

        find2.click();

        WebElement cover = driver.findElement(By.xpath("//div/div/div/div//div/img[@class='cover']"));

        List<WebElement> l1 = cover.findElements(By.tagName("src"));

        System.out.println(l1.size());


        /*
        WebElement text = driver.findElement(new By.ByCssSelector(".cover[alt='Bez Çantalar']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(text));

        text.click();
         */



/*
        Thread.sleep(5000);

        select.click();

        // WebElement searchButton = driver.findElement(By.cssSelector("[xpath='1']"));

        WebElement art = driver.findElement(By.className("image"));

        // WebElement searchButton = driver.findElement(By.xpath("//a[@class='xpath="1"']"));
        WebElement cover = driver.findElement(By.className("cover"));

        cover.click();

       //List<WebElement> l1 = cover.findElements(By.tagName("src"));

       //System.out.println(l1.size());

*/

    }








}
