package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TEST CASE
 * 1)open the web browser 
 * 2)open URL https://www.opencart.com/
 * 3)Validate title should be "Your Store"
 * 4)Close browser 
 * */

public class FirstTestCase {

	public static void main(String[] args) {
		//1)open the web browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver   driver = new ChromeDriver();
		
		//2)open URL https://www.opencart.com/
		driver.get("https://www.opencart.com/");
		
		//3)Validate title should be "Your Store"
		String act_title =driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		//4)Close browser
		//driver.close();
		driver.quit();
		
	}

}
