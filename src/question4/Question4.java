package question4;
/**
 * Homework – 4
 * https://opensource-demo.orangehrmlive.com/
 * ( Username : Admin | Password : admin123 )
 * Enter username
 * Enter password
 * Click login
 * Verify that the text “Welcome Paul”
 * After Paul one symbol there so click on the symbol for logout.
 * Verify the below text.
 * LOGIN Panel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import question1.Base1;

public class Question4 extends Base1 {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyLoginPage() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @id='btnLogin']"));
        login.click();
        String expectedMessage = "Welcome MOHAMED";
        WebElement message = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        message.click();
        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
        logout.click();
        String loginPanelText = "LOGIN Panel";
        WebElement loginPanel = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
        String actualLoginMessage = loginPanel.getText();
        Assert.assertEquals(loginPanelText, actualLoginMessage);

    }

    @After
    public void close() {
        closeBrowser();
    }
}
