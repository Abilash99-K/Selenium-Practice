package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		driver. navigate(). refresh();
		String value=driver.findElement(By.xpath("//a[normalize-space()='ITI']/self::a")).getText();
		System.out.println(value);
		
		//childs
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='ITI']/ancestor::tr/child::td"));
		System.out.println(childs.size());
		//ancestor
		value=driver.findElement(By.xpath("//a[normalize-space()='ITI']/ancestor::tr")).getText();
		System.out.println(value);
		//decendant 
		childs=driver.findElements(By.xpath("//a[normalize-space()='ITI']/ancestor::tr/descendant::*"));
		System.out.println("No of decendant"+" "+childs.size());
		//following 
		childs=driver.findElements(By.xpath("//a[normalize-space()='ITI']/following::tr"));
		System.out.println("No of following"+" "+childs.size());
		
		driver.close();
	}

}
