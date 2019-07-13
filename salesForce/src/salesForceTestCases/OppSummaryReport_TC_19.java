package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OppSummaryReport_TC_19 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Oppurtunities Summary Report");
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
		
		WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		oppurtunities.click();
		Thread.sleep(2000);
		
		WebElement QSInterval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select QSIntervalDropdown =new Select(QSInterval);
		//QSIntervalDropdown.selectByVisibleText("Current FQ");
		QSIntervalDropdown.selectByVisibleText("Next FQ");
		//QSIntervalDropdown.selectByVisibleText("Current and Next FQ");
		
		WebElement QSInclude = driver.findElement(By.xpath("//select[@id='open']"));
		Select QSIncludeDropdown =new Select(QSInclude);
		//QSIncludeDropdown.selectByVisibleText("All Opportunities");
		QSIncludeDropdown.selectByVisibleText("Open Opportunities");
		//QSIncludeDropdown.selectByVisibleText("Closed Opportunities");
		
		WebElement RunReport = driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
		RunReport.click();
	}

}
