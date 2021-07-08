package master;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class grade {

	public static void main(String[] args) throws InterruptedException {
		grade login = new grade();
		login.login();
		login.gR();
		login.grCreate();
		login.grFill();
		login.grBack();
		login.grErroralert();
		login.grShowentries();
		login.grEdit();
		login.grEditfield(); 
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
	  //TESTCASE LOGIN,HR,MASTER,Grade,GoBack,HR-MAIN, LOGOUT
	  public void gR() throws InterruptedException {
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
	  	driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-Grade - create new-Yes- save-logout
	public void grCreate() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='GradeName']")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='GradeCode']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Non-Executive']"));
		Thread.sleep(5000);
		option.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='Yes']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@name='sequenceId']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase-Grade - create new-No- cancel-logout
	public void grFill() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Grade')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='GradeName']")).sendKeys("july");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='GradeCode']")).sendKeys("check123");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("check");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Executive']"));
		Thread.sleep(5000);
		option.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='Yes']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@name='sequenceId']")).sendKeys("D101");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//Testcase - Create new -back to doc page - Go back to 
	public void grBack() {
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
		driver.findElement(By.xpath("//a[contains(text(),' Grade')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		//Go Back 
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - handling error pop up
	public void grErroralert() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='GradeName']")).sendKeys("july");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='GradeCode']")).sendKeys("check123");
		driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("check");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Executive']"));
		Thread.sleep(5000);
		option.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='Yes']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@name='sequenceId']")).sendKeys("D101");
		//Alert message -close
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  driver.quit();
	}
	//Testcase for show entries and search 
	public void grShowentries() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
		Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
		se.selectByValue("10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(" ");
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  driver.quit();
	}
	//Testcase for list of grade master - Edit button
	public void grEdit() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
		//edit button
		driver.findElement(By.xpath("(//a[@class='fixed-button'])")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - edit the data 
	public void grEditfield() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Grade')]")).click();
		//edit button
		driver.findElement(By.xpath("(//a[@class='fixed-button'])")).click();
		WebElement name = driver.findElement(By.xpath("//input[@name='GradeName']"));
		name.clear();
		name.sendKeys("Chairman");
		WebElement code= driver.findElement(By.xpath("//input[@name='GradeCode']"));
		code.clear();
		code.sendKeys("0707");
		WebElement d=driver.findElement(By.xpath("//input[@name='Description']"));
		d.clear();
		d.sendKeys("check");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Executive']"));
		Thread.sleep(5000);
		option.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='N']"));
		Thread.sleep(5000);
		active.click();
		WebElement sq= driver.findElement(By.xpath("//input[@name='sequenceId']"));
		sq.clear();
		sq.sendKeys("10");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();	
	}
	

}
