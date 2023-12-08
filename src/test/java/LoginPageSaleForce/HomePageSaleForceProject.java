package LoginPageSaleForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomePageSaleForceProject {
    WebDriver driver;
	@BeforeMethod
	public void lunchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
}
	@Test
	public void testCase1LoginErrorMessage() {
		String acutal="Login | Salesforce";
		String Expected=driver.getTitle();
		if(Expected.equalsIgnoreCase(acutal)) {
			System.out.println("This is the login Page || Home Page displayed");
		}else {
			System.out.println("The login page not displayed");
		}
		
		WebElement userNameField=driver.findElement(By.id("username"));
		userNameField.sendKeys("jawadqureshi718@gmail.com");
		String exceptedEmail=userNameField.getAttribute("value");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.clear();
		System.out.println(passwordField.getText());
		WebElement loginButton=driver.findElement(By.id("Login"));
        loginButton.click();
        WebElement errorMessage=driver.findElement(By.id("error"));
        System.out.println(errorMessage.getText());
		
	}
	@Test
	public void testCase2loginToSaleForceHomePage() {
		String acutal="Login | Salesforce";
		String Expected=driver.getTitle();
		if(Expected.equalsIgnoreCase(acutal)) {
			System.out.println("This is the login Page || login Page displayed");
		}else {
			System.out.println("The login page not displayed");
		}
		
		WebElement userNameField=driver.findElement(By.id("username"));
		userNameField.sendKeys("jawadqureshi718@gmail.com");
		String exceptedEmail=userNameField.getAttribute("value");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys("admin123");
		System.out.println(passwordField.getText());
		WebElement loginButton=driver.findElement(By.id("Login"));
        loginButton.click();
       String actualTitle= "Home Page ~ Salesforce - Developer Edition";
       String exceptedTitle=driver.getTitle();
       if(exceptedTitle.equalsIgnoreCase(actualTitle)) {
    	   System.out.println("The home page || is displayed ");
       }else {
    	   System.out.println("The home page not displayed");
       }
      
       }
	@Test
	public void testCase3CheckRememberMe() throws Exception {
		String acutal="Login | Salesforce";
		String Expected=driver.getTitle();
		if(Expected.equalsIgnoreCase(acutal)) {
			System.out.println("This is the login Page || login Page displayed");
		}else {
			System.out.println("The login page not displayed");
		}
		
		WebElement userNameField=driver.findElement(By.id("username"));
		userNameField.sendKeys("jawadqureshi718@gmail.com");
		String exceptedEmail=userNameField.getAttribute("value");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys("admin123");
		System.out.println(passwordField.getText());
		WebElement checkButton=driver.findElement(By.id("rememberUn"));
		checkButton.click();
		WebElement loginButton=driver.findElement(By.id("Login"));
        loginButton.click();
       String actualTitle= "Home Page ~ Salesforce - Developer Edition";
       String exceptedTitle=driver.getTitle();
       if(exceptedTitle.equalsIgnoreCase(actualTitle)) {
    	   System.out.println("The home page || is displayed ");
       }else {
    	   System.out.println("The home page not displayed");
       }	
      WebElement jayAhmad= driver.findElement(By.id("userNav"));
		jayAhmad.click();
		
		WebElement logoutButton=driver.findElement(By.linkText("Logout"));
		logoutButton.click();
		
		Thread.sleep(4000);
		String actualsername="jawadqureshi718@gmail.com";
	    String expectedUsername=driver.findElement(By.xpath("//*[@id=\"idcard-identity\"]")).getText();
	    
	    if(expectedUsername.equalsIgnoreCase(actualsername)) {
	    	System.out.println("the user is displayed in the user name field");
	    }
	    else {
	    	System.out.println("user name is not displayed");
	    }
		
	}
	 
   @AfterMethod
	private void tearDown() {
		driver.quit();
	}

}
