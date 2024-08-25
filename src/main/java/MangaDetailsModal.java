import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MangaDetailsModal extends LoginClass{
    @Test(priority = 9, description = "Ensure the user is on the manga search page & Click the Details link on a manga card. .")
    public void ensureMangaSearchPage() throws Exception
    {
        //Ensure the user is on the manga search page
        WebElement searchBox = driver.findElement(By.id("manga-search"));
        Assert.assertTrue(searchBox.isDisplayed());
        Assert.assertEquals(searchBox.getAttribute("placeholder"),"Search Manga");
        Thread.sleep(1000);
        //click on a link
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/p[1]/span")).click();

    }
    @Test(priority = 10, description = " Verify that the modal appears and displays the correct manga information & click close button & Verify that the modal is closed and no longer visible.")
    public void verifyModalInfo() throws Exception
    {
        //Verify that the modal appears and displays the correct manga information
        //verify title
        WebElement verifyTitle = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/h3"));
        Assert.assertTrue(verifyTitle.isDisplayed());
        Assert.assertEquals("Death Note", verifyTitle.getText());
        Thread.sleep(1000);
        //verify image
        WebElement verifyImage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/img"));
        Assert.assertTrue(verifyImage.isDisplayed());
        Assert.assertEquals("Death Note", verifyImage.getAttribute("alt"));
        Thread.sleep(1000);
        //verify details
        WebElement verifyDetails = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/p"));
        Assert.assertTrue(verifyDetails.isDisplayed());
        Assert.assertEquals("A high school student discovers a mysterious notebook that allows him to kill anyone by writing their name.", verifyDetails.getText());
        Thread.sleep(1000);
        //click on close button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/button")).click();

    }

}
