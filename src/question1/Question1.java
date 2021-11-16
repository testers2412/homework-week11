package question1;
/**
 * Homework -1
 * Navigate to google https://www.google.com/
 * In Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Computers and Verify that the user successfully navigated to the Computers page.
 * Navigate to google https://www.google.com/
 * In Google search type "demo nopCommerce store" and click search
 * Click on the link "nopCommerce demo store"
 * Click on Electronics and Verify that the user successfully navigated to the Electronics page.
 * Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Question1 extends Base1 {
    String baseUrl="https://www.google.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void nopCom(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Computers ']")).click();
        String expMsg="Computers";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);
    }
    @Test
    public void nopEle(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Electronics ']")).click();
        String expMsg="Electronics";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);
    }
    @Test
    public void nopApp(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Apparel ']")).click();
        String expMsg="Apparel";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);

    }
    @Test
    public void nopDD(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Digital downloads ']")).click();
        String expMsg="Digital downloads";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);

    }
    @Test
    public void nopBooks(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Books ']")).click();
        String expMsg="Books";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Books']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);
    }
    @Test
    public void nopJwl(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Jewelry ']")).click();
        String expMsg="Jewelry";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);
    }
    @Test
    public void nopGC(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and contains(text(),'nopCommerce demo store')]")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Gift Cards ']")).click();
        String expMsg="Gift Cards";
        WebElement comText =driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actText= comText.getText();
        Assert.assertEquals(expMsg,actText);
    }
    @After
    public void closeAll(){
        closeBrowser();
    }



}
