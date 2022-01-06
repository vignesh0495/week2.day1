package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {
public static void main(String[] args) {
		
		//setup the drive
		
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise the Browser
		
		driver.manage().window().maximize();
		
		//enter the username
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("Democsr");
		
		//enter the password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crmsfa
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on contact
		
		driver.findElement(By.linkText("Contacts")).click();
		
		//click on find contact
		
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//click on email
		
		driver.findElement(By.linkText("Email")).click();
		
		//enter email address
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("vigneshsz1995@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		
				
}
}