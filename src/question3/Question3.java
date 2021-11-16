package question3;
/**
 * Homework - 3
 * Open url : http://automationpractice.com/index.php
 * Click on Sign In
 * Enter correct Email in Email field
 * Enter wrong Password in Password field
 * Click on the Sign In button.
 * Expected Result:
 * Error Message “There is 1 error”
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import question1.Base1;

public class Question3 extends Base1 {
    String baseUrl= "http://automationpractice.com/index.php";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void singInFunctionality(){
        WebElement login = driver.findElement(By.className("login"));
        login.click();

        driver.findElement(By.xpath("//input [contains(@class,'input form') and @id='email' ]")).sendKeys(randomString()+"@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@//23£");
        driver.findElement(By.id("SubmitLogin")).click();
        String expectedErMes="There is 1 error";
        WebElement errorMessage =driver.findElement(By.xpath("//p [text()='There is 1 error']"));
        String actualErMes= errorMessage.getText();
        Assert.assertEquals(expectedErMes,actualErMes);
    }
    @After
    public void close(){
        closeBrowser();
    }


}
