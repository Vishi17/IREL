package master;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PayScale {

	public static void main(String[] args) throws InterruptedException {
		PayScale login = new PayScale();
		login.login();
		login.payScale();
		login.payCreate();
		login.payFill();
		login.payBack();
		login.payErroralert();
		login.payEdit();
		login.payEditfield();	
	}
	//Testcase for Login - HR- master - main- logout
	  public void login() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
			driver.findElement(By.xpath("//a[text()='Language : English']")).click();
			driver.findElement(By.xpath("//a[text()='Cancel']")).click();
			driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Main')]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.quit();
	}
	  //TESTCASE LOGIN,HR,MASTER,Payscale,GoBack,HR-MAIN, LOGOUT
	  public void payScale() throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver(); 
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	driver.get("https://115.124.105.99:6443/humanres/control/main");
	  	driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
	  	driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
	  	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
	  	driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	      driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();

	      driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
	  	//Master - Category
	  	driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-Payscale - create new-Yes- save-logout
	public void payCreate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='PayBandCode']")).sendKeys("");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='']"));
		Thread.sleep(5000);
		option.click();
		WebElement grade = driver.findElement(By.xpath("//option[text()='grade']"));
		Thread.sleep(5000);
		grade.click();
		driver.findElement(By.xpath("//input[@name='LowerLimit']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='HigherLimit']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("");
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase-Payscale - create new-No- cancel-logout
	public void payFill() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pay Scale')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TEST");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='PayBandCode']")).sendKeys("CMS123");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Executive']"));
		Thread.sleep(5000);
		option.click();
		WebElement grade = driver.findElement(By.xpath("//option[text()='A-1']"));
		Thread.sleep(5000);
		grade.click();
		driver.findElement(By.xpath("//input[@name='LowerLimit']")).sendKeys("20000");
		driver.findElement(By.xpath("//input[@name='HigherLimit']")).sendKeys("500000");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("CHECK123");
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		active.click();	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//Testcase - Create new -back to payscale page - Go back to 
	public void payBack() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pay Scale')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		//Go Back 
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - handling error pop up
	public void payErroralert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='PayBandCode']")).sendKeys("");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='']"));
		Thread.sleep(5000);
		option.click();
		WebElement grade = driver.findElement(By.xpath("//option[text()='']"));
		Thread.sleep(5000);
		grade.click();
		driver.findElement(By.xpath("//input[@name='LowerLimit']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='HigherLimit']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("");
		WebElement active = driver.findElement(By.xpath("//option[text()='']"));
		Thread.sleep(5000);
		active.click();	
		//Alert message -close
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  driver.quit();
	}
	//Testcase for show entries and search 
	public void payShowentries() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
		Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
		se.selectByValue("10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(" ");
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  driver.quit();
	}
	//Testcase for list of payscale master - Edit button
	public void payEdit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
		//edit button
		driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - edit the data 
	public void payEditfield() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Pay Scale')]")).click();
		//edit button
		driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
		WebElement name=driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys("IREL");
		
		WebElement code=driver.findElement(By.xpath("//input[@name='PayBandCode']"));
		code.sendKeys("0707");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Executive']"));
		option.click();
		Thread.sleep(5000);
		WebElement grade = driver.findElement(By.xpath("//option[text()='DIR.']"));
		Thread.sleep(5000);
		grade.click();
		WebElement ll=driver.findElement(By.xpath("//input[@value='12250']"));
		ll.clear();
		ll.sendKeys("13000");
		WebElement hl= driver.findElement(By.xpath("//input[@value='30610']"));
		hl.clear();
		hl.sendKeys("30600");
		WebElement desc = driver.findElement(By.xpath("//input[@name='Description']"));
		desc.sendKeys("check again");
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		active.click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();	
	}

}
