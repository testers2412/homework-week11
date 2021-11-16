package question1;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base1 {
    public static WebDriver driver;
    public void openBrowser(String baseUrl) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.close();
    }
    public String randomString(){
        RandomString radstr= new RandomString(10);
        String randomString = radstr.nextString();
        return randomString;
    }


}
