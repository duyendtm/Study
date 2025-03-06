import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.testng.annotations.Test;

public class Login {
    @Test (groups = "Login")
    public void TestLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\4.ECLIPSE SETUP\\chromedriver\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.masimosafetynetdev.com/remote-monitoring");

        // Click btn Please log in to view list of CarePrograms.
        WebElement BoxReqLogin = driver.findElement(By.id("box-req-login"));
        BoxReqLogin.click();

        //Check case nhap sai email đúng password
        WebElement wrongusername = driver.findElement(By.id("inp-account"));
        wrongusername.sendKeys("duyendm1@doctella.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement password = driver.findElement(By.id("inp-pass-email"));
        password.sendKeys("Doctella@2020");

        WebElement Loginbtn = driver.findElement(By.id("click-login"));
        Loginbtn.click();

        Thread.sleep(5000);
        WebElement message1=driver.findElement(By.id("dialogContent_newDialog"));
        WebElement buttonGotIt1 = driver.findElement(By.xpath("//*[@id='newDialog']/md-dialog-actions/button"));
        System.out.println(message1.getText());
        buttonGotIt1.click();

        // Check case nhap dung email, sai password
        WebElement username1 = driver.findElement(By.id("inp-account"));
        Thread.sleep(5000);
        username1.clear();
        username1.sendKeys("duyendm@doctella.com");

        WebElement wrongpassword = driver.findElement(By.id("inp-pass-email"));
        Thread.sleep(5000);
        wrongpassword.clear();
        wrongpassword.sendKeys("Doctella@2021");

        WebElement Loginbtn1 = driver.findElement(By.id("click-login"));
        Loginbtn1.click();

        Thread.sleep(5000);
        WebElement message2=driver.findElement(By.id("dialogContent_newDialog"));
        WebElement buttonGotIt2 = driver.findElement(By.xpath("//*[@id='newDialog']/md-dialog-actions/button"));
        System.out.println(message2.getText());
        buttonGotIt2.click();


        // Nhập correct username và password
        WebElement username= driver.findElement(By.id("inp-account"));
        Thread.sleep(5000);
        username.clear();
        username.sendKeys("duyendm@doctella.com");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


       WebElement password1 = driver.findElement(By.id("inp-pass-email"));
        Thread.sleep(5000);
       password1.clear();
        password.sendKeys("Doctella@2020");

        //Click Login btn
       WebElement Loginbtn2 = driver.findElement(By.id("click-login"));
        Loginbtn2.click();



    }
}
