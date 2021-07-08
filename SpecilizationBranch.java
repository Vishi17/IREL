package master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecilizationBranch {

	public static void main(String[] args) throws InterruptedException {
		SpecilizationBranch login = new SpecilizationBranch();
		login.login();
		login.specilizationBranch();
		login.sbCreate();
		login.sbFill();
		login.sbError();
		login.showEntries();
		login.sbEdit();
		login.sbEdifield();

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
	  //TESTCASE LOGIN,HR,MASTER,salarycomponent,GoBack,HR-MAIN, LOGOUT
	  public void specilizationBranch() throws InterruptedException {
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
	  	driver.findElement(By.xpath("//a[contains(text(),'Specialization/Branch')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-salary component - create new-Yes- save-logout
		public void sbCreate() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Specialization/Branch')]")).click();
			//create New
			driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
//			WebElement type = driver.findElement(By.xpath("//option[text()='MBA ']"));
//			Thread.sleep(5000);
//			type.click();
			driver.findElement(By.xpath("//option[@value='MCOM']")).click();
			driver.findElement(By.xpath("//option[@value='B.E']")).click();
			
//			WebElement diploma = driver.findElement(By.xpath("//option[text()='MBA ']"));
//			Thread.sleep(5000);
//			diploma.click();
			driver.findElement(By.xpath("//input[@name='SpecializationOrBranchName']")).sendKeys("Finance");
		    driver.findElement(By.xpath("//option[@value='Y']")).click();
			driver.findElement(By.xpath("//input[@type='reset']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		    driver.quit();
		}
		//testcase-salary component - create new-Yes- save-logout
				public void sbFill() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Specialization/Branch')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					driver.findElement(By.xpath("//option[@value='MCOM']")).click();
					driver.findElement(By.xpath("//option[@value='B.E']")).click();
					driver.findElement(By.xpath("//input[@name='SpecializationOrBranchName']")).sendKeys("new");
					driver.findElement(By.xpath("//option[@value='Y']")).click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//Testcase -  Go back to 
				public void backTo() {
					System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					WebDriver driver =new ChromeDriver(); 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get("https://115.124.105.99:6443/humanres/control/main");
					driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
					driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
					driver.findElement(By.xpath("//input[@type='submit']")).click(); 
				    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
					driver.findElement(By.xpath("//a[text()=' Specialization/Branch']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//Go Back 
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
				}
				//testcase-salarycomponent - create new-Yes- save-logout
				public void sbError() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Specialization/Branch')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					driver.findElement(By.xpath("//option[@value='MCOM']")).click();
					driver.findElement(By.xpath("//option[@value='B.E']")).click();
					driver.findElement(By.xpath("//input[@name='SpecializationOrBranchName']")).sendKeys("new");
					driver.findElement(By.xpath("//option[@value='Y']")).click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
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
					driver.findElement(By.xpath("//a[contains(text(),'Specialization/Branch')]")).click();
					//Allownace
					Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se.selectByValue("25");
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("MCOM");
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//testcase-Edit
				public void sbEdit() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Specialization/Branch')]")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					Thread.sleep(5000);
					//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				// Edit field 
				public void sbEdifield() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Specialization/Branch')]")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					WebElement type= driver.findElement(By.xpath("//option[@value='MBA']"));
					type.click();
					WebElement name = driver.findElement(By.xpath("//option[@value='MA']"));
					name.click();
					WebElement branch = driver.findElement(By.xpath("//input[@name='SpecializationOrBranchName']"));
					branch.clear();
					branch.sendKeys("checknew");
					driver.findElement(By.xpath("//option[@value='N']")).click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
}
