package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoFunctionality_TC_22 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Leads Go functionality");
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
		
		WebElement LeadsView = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select LeadsViewDropdown =new Select(LeadsView);
		LeadsViewDropdown.selectByVisibleText("Today's Leads");
		Thread.sleep(4000);
		
		
		WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		Thread.sleep(3000);
		UserMenuDropdown.click();
		
		WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		Thread.sleep(3000);
		LogoutOption.click();
		
		System.out.println("Logout Successful");
		
		Thread.sleep(7000);
		
		
		WebElement userName1 = driver.findElement(By.xpath("//input[@id='username']"));
		userName1.sendKeys("jyothipraveena194-xzax@force.com");
		
		System.out.println("Username Entered");
		
		WebElement passWord1 =driver.findElement(By.xpath("//input[@id='password']"));
		passWord1.sendKeys("Salesforce123*");
		System.out.println("password Entered");
		
		WebElement loginButton1 = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton1.click();
		
		
		System.out.println("Login Successful");
		
		Thread.sleep(2000);
		
		WebElement LeadsTab1 = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		LeadsTab1.click();
		Thread.sleep(2000);
		
		
		
		WebElement GoButton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		GoButton.click();
		Thread.sleep(4000);
		System.out.println("Leads Home is displayed with Today's Leads option in view");
		
		WebElement UserMenuDropdown1 = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		
		Thread.sleep(3000);
		UserMenuDropdown1.click();
		
		WebElement LogoutOption1 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		Thread.sleep(5000);
		LogoutOption1.click();
		
		System.out.println("Logout Successful");
		driver.quit();
		
		

	}

}
