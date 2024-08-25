import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class LoginClass extends BaseClass{
    @Test (priority = 0, description = "Verify that the login page is displayed.")
    public void logIn() throws Exception
    {
       //Verify that the login page is displayed.
        WebElement logInPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/h2"));
        Assert.assertTrue(logInPage.isDisplayed());
        Assert.assertEquals("Login", logInPage.getText());
    }
    @Test (priority = 1, description = "Enter valid login credentials")
    public void enterValidCreds() throws Exception
    {
        //enter username
        List<WebElement> userName = driver.findElements(By.id("username"));
        userName.get(0).sendKeys("testuser");
        Thread.sleep(1000);
        //enter password
        List<WebElement> password = driver.findElements(By.id("password"));
        password.get(0).sendKeys("password");
        Thread.sleep(1000);
    }
    @Test (priority = 2, description = "Click the Login button.")
    public void clickOnLogInBtn() throws Exception
    {
        //click ok login button
        driver.findElement(By.id("login-btn")).click();
    }
    @Test (priority = 3, description = "Verify that the user is redirected to the manga search page.")
    public void verifyMangaSrcPage() throws Exception
    {
        //Verify that the user is redirected to the manga search page
        WebElement logInPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/h1"));
        Assert.assertTrue(logInPage.isDisplayed());
        Assert.assertEquals("Manga You Should Read", logInPage.getText());
    }

}
