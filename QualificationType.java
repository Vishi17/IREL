package master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QualificationType {

	public static void main(String[] args) throws InterruptedException {
		QualificationType login = new QualificationType();
		login.login();
		login.qualificatioType();
		login.qtCreate();
		login.qtFill();
		login.qtBack();
		login.qtErroralert();
		login.showEntries();
		login.edit();
		login.editField();

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
	  //TESTCASE LOGIN,HR,MASTER,qualificatioType,GoBack,HR-MAIN, LOGOUT
	  public void qualificatioType() throws InterruptedException {
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
	  	driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-qualificatioType - create new-Yes- save-logout
	public void qtCreate() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Qualification Type')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='qualificationType']")).sendKeys("check");
		WebElement active = driver.findElement(By.xpath("//option[text()='N']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase-Qualification Type
	public void qtFill() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Qualification Type')]")).click();
		
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='qualificationType']")).sendKeys("TEST12");
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		active.click();
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//Testcase - Create new -back to qualificatioType - Go back to 
	public void qtBack() {
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
		driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		//Go Back 
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - handling error pop up
	public void qtErroralert() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
		//create New
				driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
				driver.findElement(By.xpath("//input[@name='qualificationType']")).sendKeys("TEST12");
				WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
				Thread.sleep(5000);
				active.click();
			
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
	}
	//Testcase for show entries and search 
			public void showEntries() throws InterruptedException {
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
				driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
				Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
				se.selectByValue("25");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Testing ");
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
			}
			//Testcase for list of  master - Edit button
			public void edit() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://115.124.105.99:6443/humanres/control/main");
				driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();

				//Thread.sleep(7000);
				driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
				driver.findElement(By.xpath("//input[@type='submit']")).click(); 
			    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
				//edit button
				driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
				//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
			}
			//Testcase - edit the data 
			public void editField() throws InterruptedException {
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
				driver.findElement(By.xpath("//a[contains(text(),'Qualification Type')]")).click();
		
				//edit button
				driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
				//edit field 
				WebElement qt = driver.findElement(By.xpath("//input[@name='qualificationType']"));
				qt.clear();
				qt.sendKeys("test12");
				WebElement active = driver.findElement(By.xpath("//option[text()='N']"));
				Thread.sleep(5000);
				active.click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();	
			}


}
