package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		
		//setup the drive
		
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise the Browser
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//enter the username
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("Democsr");
		
		//enter the password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crmsfa
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create leads
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//click on company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		
		//click on first name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vicky");
		
		//click on second name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//select source
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(source);
		
		dd.selectByVisibleText("Employee");
		
		
		
		//CLick on create lead button
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.id("Create Contact")).sendKeys("Vignesh");
		
		
		
	}

}
