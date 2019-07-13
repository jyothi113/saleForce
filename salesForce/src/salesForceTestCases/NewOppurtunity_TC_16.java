package salesForceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewOppurtunity_TC_16 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("New Oppurtunities ");
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
		
		WebElement oppurtunitiesNewButton = driver.findElement(By.xpath("//input[@name='new']"));
		oppurtunitiesNewButton.click();
		
		WebElement oppurtunitiesName = driver.findElement(By.xpath("//input[@id='opp3']"));
		oppurtunitiesName.sendKeys("sampleOpp");
		
		WebElement AccountName = driver.findElement(By.xpath("//input[@id='opp4']"));
		AccountName.sendKeys("Jyo");
		
		WebElement closeDate = driver.findElement(By.xpath("//input[@id='opp9']"));
		closeDate.click();
		
		WebElement closeDateToday = driver.findElement(By.xpath("//a[@class='calToday']"));
		closeDateToday.click();
		
	
		WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
		Select stageDropdown =new Select(stage);
		stageDropdown.selectByVisibleText("Proposal");
		
		
		WebElement LeadSource = driver.findElement(By.xpath("//select[@id='opp6']"));
		Select LeadSourceDropdown =new Select(LeadSource);
		LeadSourceDropdown.selectByVisibleText("Website");
		
		
		//WebElement PrimaryCampaignsource = driver.findElement(By.xpath("//input[@id='opp17']"));
		//PrimaryCampaignsource.sendKeys("Website");
		
		WebElement saveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		saveButton.click();
		
	}

}
