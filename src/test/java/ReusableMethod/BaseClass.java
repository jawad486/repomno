package ReusableMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
WebDriver driver;

	//intializating driver
	public void intialDriver() {
		WebDriver driver=new ChromeDriver();
		
		}
	//luching browser
	public void navigateTo( String url) {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}
	//Maximaz the screen
	public void maxScreen() {
	   driver.manage().window().maximize();	
	}
	
	//closing browser
	public void tearDown() {
		driver.close();
	}
	
	//Click Method
	public void clickElement(WebDriver driver,WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
		
		}
	//clear and sendkeys methods
	public void clearAndType(String value,WebElement element) {
		element.clear();
		element.sendKeys(value);
		}
	
	
	

}
