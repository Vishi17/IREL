package master;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalaryComponent {
	
	public static void main(String[] args) throws InterruptedException {
		SalaryComponent login = new SalaryComponent();
		login.login();
		login.salaryComponent();
		login.scCreate();
		login.scFill();
		login.backTo();
		login.scError();
		login.showEntries();
		login.scEdit();
		login.scView();
		login.scEdifield();

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
	  public void salaryComponent() throws InterruptedException {
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
	  	driver.findElement(By.xpath("//a[contains(text(),' Salary Component')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-salary component - create new-Yes- save-logout
		public void scCreate() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),' Salary Component')]")).click();
			//create New
			driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
			WebElement category = driver.findElement(By.xpath("//option[text()='Allowance']"));
			Thread.sleep(5000);
			category.click();
			driver.findElement(By.xpath("//input[@name='Newcomponent']")).sendKeys("");
			driver.findElement(By.xpath("//input[@id='code']")).sendKeys("");
			WebElement gl = driver.findElement(By.xpath("//option[text()='1000001 Asset child']"));
			Thread.sleep(5000);
			gl.click();
			driver.findElement(By.xpath("//input[@id='isTaxApplicableCheck']")).click();
			driver.findElement(By.xpath("//input[@id='isExemptionCheck']")).click();
			driver.findElement(By.xpath("//input[@type='reset']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		    driver.quit();
		}
		//testcase-salary component - create new-Yes- save-logout
				public void scFill() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Salary Component')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					WebElement category = driver.findElement(By.xpath("//option[text()='Allowance']"));
					Thread.sleep(5000);
					category.click();
					driver.findElement(By.xpath("//input[@name='Newcomponent']")).sendKeys("Test");
					driver.findElement(By.xpath("//input[@id='code']")).sendKeys("707");
					WebElement gl = driver.findElement(By.xpath("//option[text()='1000001 Asset child']"));
					Thread.sleep(5000);
					gl.click();
					driver.findElement(By.xpath("//input[@id='isTaxApplicableCheck']")).click();
					driver.findElement(By.xpath("//input[@type='SUBMIT']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
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
					driver.findElement(By.xpath("//a[text()=' Salary Component']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//Go Back 
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
				}
				//testcase-salarycomponent - create new-Yes- save-logout
				public void scError() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Salary Component')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					WebElement category = driver.findElement(By.xpath("//option[text()='Allowance']"));
					Thread.sleep(5000);
					category.click();
					driver.findElement(By.xpath("//input[@name='Newcomponent']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='code']")).sendKeys("");
					WebElement gl = driver.findElement(By.xpath("//option[text()='1000001 Asset child']"));
					Thread.sleep(5000);
					gl.click();
					driver.findElement(By.xpath("//input[@id='isTaxApplicableCheck']")).click();
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
					driver.findElement(By.xpath("//a[contains(text(),' Salary Component')]")).click();
					//Allownace
					driver.findElement(By.xpath("//option[text()='Allowance']")).click();
					Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se.selectByValue("25");
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Allowance to cook-cum- attender");
					Thread.sleep(5000);
					//deduction
//					driver.findElement(By.xpath("//option[text()='Deduction']")).click();
//					Select se1 = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
//					se1.selectByValue("25");
//					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Emp NPS");
//					Thread.sleep(5000);
					//company contribution
					driver.findElement(By.xpath("//option[text()='Company Contribution']")).click();
					Select se2 = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se2.selectByValue("2");
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ECL");
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//testcase-Edit
				public void scEdit() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Salary Component')]")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//testcase-view
				public void scView() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Salary Component')]")).click();
					//Allownace
					driver.findElement(By.xpath("//option[text()='Allowance']")).click();
					//view button
					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					//Deduction
//					driver.findElement(By.xpath("//option[text()='Deduction']")).click();
					//view button
//					driver.findElement(By.xpath("(//input[@id='button']/a[2])")).click();
					
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				// Edit field 
				public void scEdifield() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Salary Component')]")).click();
					//Allownace
					driver.findElement(By.xpath("//option[text()='Allowance']")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					WebElement salary= driver.findElement(By.xpath("//input[@name='allowanceName']"));
					salary.clear();
					salary.sendKeys("TesT");
					WebElement id = driver.findElement(By.xpath("//input[@value='0707']"));
					id.clear();
					id.sendKeys("1707");
					WebElement gl = driver.findElement(By.xpath("//option[text()='1000001 Asset child']"));
					Thread.sleep(5000);
					gl.click();
					driver.findElement(By.xpath("//input[@id='isTaxApplicableCheck']")).click();
					driver.findElement(By.xpath("//input[@id='isExemptionCheck']")).click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
}


