package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyContacts_TC_28 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("My contacts ");
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
		WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		ContactTab.click();
		
		WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select viewDropdownDropdown =new Select(view);
		viewDropdownDropdown.selectByVisibleText("My Contacts");
		
		
		Thread.sleep(4000);
		System.out.println("My contacts view is displayed");

	}

}
