package jutjuyjy;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    ChromeDriver driver = new ChromeDriver();

    @Test
    public void alloTest() throws InterruptedException {

        driver.get("http://allo.ua/");
        driver.findElement(By.id("account-top-name")).click();
        driver.findElement(By.cssSelector(".register a")).click();

        driver.findElement(By.id("firstname")).sendKeys("Blabla");
        driver.findElement(By.id("email_address")).sendKeys("testtest.com");
        driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.name("send")).click();

        assertEquals(driver.findElement(By.id("advice-validate-email-email_address")).getText(),
                "Пожалуйста, введите действительный адрес электронной почты. Например johndoe@domain.com.");


    }




    @After
    public void postCondition() {
        driver.close();
    }

}
