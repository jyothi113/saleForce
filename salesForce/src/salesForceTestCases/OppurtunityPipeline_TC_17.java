package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OppurtunityPipeline_TC_17 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Oppurtunities Pipeline");
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
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
		
		WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		oppurtunities.click();
		Thread.sleep(2000);
		
		WebElement oppurtunitiesPipelinelink = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		oppurtunitiesPipelinelink.click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
