package Projrct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboDemo {

	public static void main(String[] args) throws InterruptedException {

// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

// Navigate to Goibibo's homepage
		driver.get("https://www.goibibo.com/");
		Thread.sleep(1000);
		
// Maximize the browser window
		driver.manage().window().maximize();
		
//Close login pop-up window
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/span/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/p[1]")).click();
		Thread.sleep(1000);

// Find the 'Flights' tab and click on it
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/header/ul/li[1]/a")).click();

// Find the 'Round Trip' radio button and click on it
		WebElement roundTripRadioButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/ul/li[2]"));
		roundTripRadioButton.click();
	
// Find the 'From' input field, enter the source city, and select the first suggestion
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div")).click();    //Click search button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div[2]/div/input")).sendKeys("Delhi");  //enter boarding city
		Thread.sleep(1000); // Wait for suggestions to appear
		//driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div")).click();
		WebElement firstSourceSuggestion = driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div"));   //click on suggested city
		firstSourceSuggestion.click();

// Find the 'To' input field, enter the destination city, and select the first suggestion
		WebElement toInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input"));
		toInput.sendKeys("Mumbai");
		Thread.sleep(1000); // Wait for suggestions to appear
		WebElement firstDestSuggestion = driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]"));
		firstDestSuggestion.click();
		Thread.sleep(1000);
       
// Find the 'Departure' input field, enter the date, and select it
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div[4]")).click();    //Click on date  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();         //click on ok button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
		Thread.sleep(1000);
		
// Find the 'Return' input field, enter the date, and select it		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[5]/div[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[4]/div[2]/div[3]/span[2]")).click();
		Thread.sleep(2000);
		
// Find 'Travellers & Class' input field		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
		//Thread.sleep(2000);
		
// Find the 'Search' button and click on it
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[3]/span"));
		searchButton.click();
		Thread.sleep(1000);

// Wait for the search results page to load
		Thread.sleep(5000); // You can use explicit or implicit waits here
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//Click on veiw fares 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/button")).click();
		Thread.sleep(1000);
//Click on Book 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/span[2]")).click();
		Thread.sleep(5000);
		
// Close the browser
		driver.quit();
		
	}

}
