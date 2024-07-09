package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchBox {
	
//	  1)Locate the Search box using Xpath
//    2)send key "print"
//    3)press enter 
//    4)scroll down to find the element 
//    5)mover hover on the element 
//    6)press the add to cart button 
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		WebElement searchBox =driver.findElement(By.xpath("//input[@id='search_query_top']"));
		searchBox.sendKeys("Print");
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform(); 
		
		WebElement product=driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line first-item-of-tablet-line last-mobile-line']//img[@title='Printed Summer Dress']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",product);
		
		act.moveToElement(product).build().perform();
		Thread.sleep(2000);
		WebElement cartButton = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line first-item-of-tablet-line last-mobile-line']//span[@class='button ajax_add_to_cart_button btn btn-default disabled']"));
		if (cartButton.isEnabled()) {
			
			js.executeScript("arguments[0].click()",cartButton);
		}
		else {
			System.out.println("button disable ");
		}

		driver.quit(); 
	}

}
