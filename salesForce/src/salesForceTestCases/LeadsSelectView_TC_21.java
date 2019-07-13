package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadsSelectView_TC_21 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Leads Select view");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		LeadsTab.click();
		Thread.sleep(2000);
		WebElement LeadsViewDropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
		LeadsViewDropdown.click();
		Thread.sleep(3000);
		
		
		WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		Thread.sleep(3000);
		UserMenuDropdown.click();
		WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		Thread.sleep(5000);
		LogoutOption.click();
		
		System.out.println("Logout Successful");
		driver.quit();

	}

}
