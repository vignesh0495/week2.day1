package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {
	public static void main(String[] args) {
		//setup the driver
		
         WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//maximise the Browser
		
		driver.manage().window().maximize();
		
        WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("vignesh@testleaf.com");
		
		String emailValue = email.getAttribute("value");
		
		System.out.println(emailValue);
		
		email.clear();
		
		email.sendKeys("sekar", Keys.TAB);
		
	}
	

}
