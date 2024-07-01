package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).click();
		//System.out.println(driver.getWindowHandles());
//		 Set<String> windowsids =driver.getWindowHandles();
//		 System.out.println(windowsids);
		 
		 //conditional method 
         boolean status=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).isEnabled();
         System.out.println(status);
         
      WebElement  element=driver.findElement(By.xpath("//input[@id='male']"));
      element.click();
      status =element.isSelected();
        System.out.println(status);
        
        driver.quit();
		 
		
		

	}

}
