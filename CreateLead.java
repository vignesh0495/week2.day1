
	package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLead {
	public static void main(String[] args) {
		// Open the browser
		// Setup the driver
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the username
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("DemoSalesManager");

				// Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// Click on login
				driver.findElement(By.className("decorativeSubmit")).click();

				// Click on CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click leads 
				driver.findElement(By.linkText("Leads")).click();
				
				//Click Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Fill  details
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RND");
				driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Company");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				//Selecting the value for Source field from the dropdown
				WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select source = new Select(dropdown);
				source.selectByVisibleText("Employee");
				
				//SelectMarketing Campaign field from the dropdown
				WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select marketCamp = new Select(market);
				marketCamp.selectByIndex(2);
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vicky");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Associate");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/10/95");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tier 2");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BPO");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25Lakhs");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("75");
				
	//select currency dropdown
				
				WebElement curr = driver.findElement(By.id("createLeadForm_currencyUomId"));
			    Select currency = new Select(curr);
			    currency.selectByVisibleText("INR - Indian Rupee");
				
	// ownership dropdown
			    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			    Select owner = new Select(ownership);
			    owner.selectByVisibleText("Corporation");
				
	// Industry dropdown
				WebElement work = driver.findElement(By.id("createLeadForm_industryEnumId"));
			    Select industry = new Select(work);
                industry.selectByVisibleText("Health Care");
			    
	// Contact Details
	            driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641025");
			    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9500890901");
			    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2500");
			    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("vignesh");
			    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vigneshsz1995@gmail.com");
			    
	 //Selecting City from the dropdown
			    WebElement city = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			    Select cit = new Select(city);
			    int size1 = cit.getOptions().size();
			    cit.selectByIndex(size1-2);
	 //Printing the title click submit		    
			    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("98890");
			    driver.findElement(By.className("smallSubmit")).click();
	 
			    String title = driver.getTitle();
			    System.out.println(title);
			    
				
	}
	}


