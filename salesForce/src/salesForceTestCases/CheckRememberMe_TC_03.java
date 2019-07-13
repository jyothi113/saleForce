package salesForceTestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheckRememberMe_TC_03 {
	
public static void main(String[] args) throws InterruptedException{
		
		System.out.println("RememberMe");
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
		
		
		WebElement RemembermeCheckbox =driver.findElement(By.xpath("//input[@id='rememberUn']"));
		RemembermeCheckbox.click();
		
		System.out.println("Checked RememberMe");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		loginButton.click();
		
		
		System.out.println("Cliked Login");
		
		
		
		
		//logout
		WebElement UserNameLabel = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserNameLabel.click();
		
		//WebElement CloseDialogueX =driver.findElement(By.id("trylexDialogue"));
			//driver.findElement(By.id("lexNoThanks")).click();
		//CloseDialogueX.click();
		
		
		
		Actions UserNameLabellink = new Actions(driver);
		UserNameLabellink.moveToElement(UserNameLabel).build().perform();
				WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				logout.click();
		
				System.out.println("Logout done");	
				Thread.sleep(3000);
				
				//WebElement UserNameField = driver.findElement(By.xpath("//span[@id='idcard-identity']"));
				WebElement RemembereduserName =driver.findElement(By.xpath("//span[@id='idcard-identity']"))	;
				if(userName.equals(RemembereduserName))
				{
					System.out.println("The userName is Valiadted");
				}
				else
				{
					System.out.println("The userName is Valiadted");
				}
		
		
	
		//Thread.sleep(6000);
	}	
}
