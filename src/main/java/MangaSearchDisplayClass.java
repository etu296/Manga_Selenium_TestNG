import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class MangaSearchDisplayClass extends LoginClass{
    @Test(priority = 5, description = "Ensure the user is on the manga search page..")
    public void ensureMangaSearchPage() throws Exception
    {
        WebElement searchBox = driver.findElement(By.id("manga-search"));
        Assert.assertTrue(searchBox.isDisplayed());
        Assert.assertEquals(searchBox.getAttribute("placeholder"),"Search Manga");
        Thread.sleep(1000);
    }
    @Test (priority = 6, description = "Enter the search term Naruto into the search box & click the search button & Verify that manga cards with the name Naruto are displayed.")
    public void searchNaruto() throws Exception
    {
        //Enter the search term Naruto into the search box
        WebElement searchBox = driver.findElement(By.id("manga-search"));
        searchBox.sendKeys("Naruto");
        Thread.sleep(1000);
        //click ok login button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button")).click();
        Thread.sleep(1000);
        //Verify that manga cards with the name "Naruto" are displayed
        WebElement findNaruto = driver.findElement(By.xpath("//*[@id=\"manga-name\"]"));
        Assert.assertTrue(findNaruto.isDisplayed());
        Assert.assertEquals("Naruto", findNaruto.getText());
        Thread.sleep(1000);
        // Clear the search box after assertions
        searchBox.clear();



    }
    @Test (priority = 7, description = "Enter the search term One Piece into the search box & click the search button & Verify that manga cards with the name One Piece are displayed.")
    public void searchOnePiece() throws Exception
    {
        //Enter the search term One Piece into the search box
        WebElement searchBox = driver.findElement(By.id("manga-search"));
        searchBox.sendKeys("One Piece");
        Thread.sleep(1000);
        //click ok login button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button")).click();
        Thread.sleep(1000);
        //Verify that manga cards with the name  are displayed
        WebElement findOnePiece = driver.findElement(By.xpath("//*[@id=\"manga-name\"]"));
        Assert.assertTrue(findOnePiece.isDisplayed());
        Assert.assertEquals("One Piece", findOnePiece.getText());
        Thread.sleep(1000);
        // Clear the search box after assertions
        searchBox.clear();

    }
    @Test (priority = 8, description = "Enter the search term Seven Deadly Sins into the search box & click the search button & Verify that a No manga found message is displayed.")
    public void searchSevenDeadlySins() throws Exception
    {

        //Enter the search term Seven Deadly Sins into the search box
        WebElement searchBox = driver.findElement(By.id("manga-search"));
        searchBox.sendKeys("Seven Deadly Sins");
        Thread.sleep(1000);
        //click ok login button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button")).click();
        Thread.sleep(1000);
        //Verify that manga cards with the name  are displayed
        WebElement noResultForSevenDeadlySins = driver.findElement(By.cssSelector("#root > div > div.grid.grid-cols-1.sm\\:grid-cols-2.lg\\:grid-cols-4.gap-6 > p"));
        Assert.assertTrue(noResultForSevenDeadlySins.isDisplayed(), "The 'No manga found' message is not displayed.");
        Thread.sleep(1000);
        // Clear the search box after assertions
        searchBox.clear();

    }

}
