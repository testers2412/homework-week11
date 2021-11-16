package question2;
/**
 * Homework – 2
 * Navigate to website "https://demo.nopcommerce.com/"
 * Click on the register link.
 * Fill in all the fields.
 * Click on the register button.
 * Verify that the user registered successfully.
 */

import net.bytebuddy.utility.RandomString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import question1.Base1;

public class Question2 extends Base1 {
    String baseUrl= "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void registrationPage(){
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        driver.findElement(By.xpath("//input[@value='M' and @name='Gender']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Yadav");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("8");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("August");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1980");
        RandomString radstr= new RandomString(10);
        String randomString = radstr.nextString();
        driver.findElement(By.xpath("//input[@type='email' and @id='Email']")).sendKeys(randomString+"@gmail.com");
        driver.findElement(By.xpath("//input[@type='password' and @id='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@type='password' and @id='ConfirmPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit' and @id='register-button']")).click();
        String confirmation= "Your registration completed";
        WebElement confirmationText= driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualConfirmationText= confirmationText.getText();
        Assert.assertEquals(confirmation,actualConfirmationText);
    }
    @After
    public void close(){
        closeBrowser();
    }

}
