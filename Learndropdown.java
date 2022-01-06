package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdown {
	
	public static void main(String[] args) {
		//setup the driver
		
        WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//maximise the Browser
		
		driver.manage().window().maximize();
		
		//locate the element with select tag
		
		WebElement dd = driver.findElement(By.id("dropdown1"));
		
		//create object for select class
		
		Select dropdown = new Select(dd);
		
		//choose the option
		
	//	dropdown.selectByVisibleText("Appium");
		
	//	dropdown.selectByValue("3");
		
		dropdown.selectByIndex(1);
		
		int size = dropdown.getOptions().size();
		
		dropdown.selectByIndex(size-2);
		
	}

}
