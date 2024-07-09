package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class NavigateBetweenLinks {

	public static void main(String[] args) {
		

		        // Initialize the WebDriver (Chrome in this case)
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the blog
		        driver.get("https://testautomationpractice.blogspot.com/");

		        // Maximize the browser window
		        driver.manage().window().maximize();
		        
		        // Implicit wait
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        // Find the search box and enter the search query "selenium"
		        WebElement searchBox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		        searchBox.sendKeys("selenium");
		        searchBox.submit();
		        
		        List<WebElement> links = driver.findElements(By.xpath("//form[@id='Wikipedia1_wikipedia-search-form']/following-sibling::div/div"));
		        
		        // Print the number of links found
		        System.out.println("Number of links found: " + links.size());

		        driver.quit();


		       
		    }
		

	}

