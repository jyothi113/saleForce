package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFirstandLastNames_TC_33 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Verify First and LastNames of user");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("jyothipraveena194-xzax@force.com");
		
		System.out.println("Username Entered");
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Salesforce123*");
		System.out.println("password Entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton.click();
		
		
		System.out.println("Login Successful");
		
		Thread.sleep(2000);
		
		WebElement Namelink = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Jyothi T')]"));
		Namelink.click();
		Thread.sleep(2000);
		WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		Thread.sleep(3000);
		UserMenuDropdown.click();
	
		WebElement myProfileOption = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		myProfileOption.click();
		System.out.println("User profile page is displayed");
		
		System.out.println("Name link is same as My profile link");

	}

}
