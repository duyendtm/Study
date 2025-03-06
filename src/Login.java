import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void TestLogin() {
        System.setProperty("webdriver.chrome.driver", "D:\\4.ECLIPSE SETUP\\chromedriver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.masimosafetynetdev.com/remote-monitoring");

        // Click btn Please log in to view list of CarePrograms.
        WebElement BoxReqLogin = driver.findElement(By.id("box-req-login"));
        BoxReqLogin.click();

        // Nhập username và password
        WebElement username= driver.findElement(By.id("inp-account"));
        username.sendKeys("duyendm@doctella.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement password = driver.findElement(By.id("inp-pass-email"));
        password.sendKeys("Doctella@2020");

        //Click Login btn
        WebElement Loginbtn = driver.findElement(By.id("click-login"));
        Loginbtn.click();
    }
}
