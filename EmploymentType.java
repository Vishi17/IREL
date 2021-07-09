package master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EmploymentType {

	public static void main(String[] args) throws InterruptedException {
		EmploymentType login = new EmploymentType();
		login.login();
		login.employmentType();
		login.etCreate();
		login.etFill();
		login.backTo();
		login.etError();
		login.showEntries();
		login.etEdit();
//		login.etEdifield();

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
	  //TESTCASE LOGIN,HR,MASTER,employmenttype,GoBack,HR-MAIN, LOGOUT
	  public void employmentType() throws InterruptedException {
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
	  	driver.findElement(By.xpath("//a[contains(text(),' Employment Type')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-EmploymentType - create new-Yes- save-logout
		public void etCreate() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
			//create New
			driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
			driver.findElement(By.xpath("//option[text()='CMS Queens Road']")).click();
			driver.findElement(By.xpath("//input[@name='EmploymentTypeName']")).sendKeys("TESTCHECK");
			driver.findElement(By.xpath("//input[@name='description']")).sendKeys("CHECKTEST");
			driver.findElement(By.xpath("//input[@name='Prefix']")).sendKeys("Check");
			driver.findElement(By.xpath("//input[@name='Suffix']")).sendKeys("Test");
			driver.findElement(By.xpath("//option[text()='5']")).click();
			WebElement unit = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
			Thread.sleep(5000);
			unit.click();
			WebElement np= driver.findElement(By.xpath("//input[@name='NumberPreview']"));
			np.clear();
			np.sendKeys("numer122");
			WebElement nnp = driver.findElement(By.xpath("//input[@name='NextNumberPreview']"));
			nnp.clear();
			nnp.sendKeys("numer123");
		    driver.findElement(By.xpath("//option[@value='Y']")).click();
		    driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		    driver.quit();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		    driver.quit();
		}
		//testcase-EmploymentType - create new-Yes- save-logout
				public void etFill() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					WebElement name = driver.findElement(By.xpath("//option[text()='CMS Queens Road']"));
					Thread.sleep(5000);
					name.click();
					driver.findElement(By.xpath("//input[@name='EmploymentTypeName']")).sendKeys("TESTCHECK");
					driver.findElement(By.xpath("//input[@name='description']")).sendKeys("CHECKTEST");
					driver.findElement(By.xpath("//input[@name='Prefix']")).sendKeys("Check");
					driver.findElement(By.xpath("//input[@name='Suffix']")).sendKeys("Test");
					driver.findElement(By.xpath("//option[text()='5']")).click();
					WebElement unit = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
					Thread.sleep(5000);
					unit.click();
					WebElement unit1 = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
					Thread.sleep(5000);
					unit1.click();
					WebElement np= driver.findElement(By.xpath("//input[@name='NumberPreview']"));
					np.clear();
					np.sendKeys("numer122");
					WebElement nnp = driver.findElement(By.xpath("//input[@name='NextNumberPreview']"));
					nnp.clear();
					nnp.sendKeys("numer123");
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
					driver.findElement(By.xpath("//a[text()=' Employment Type']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//Go Back 
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
				}
				//testcase-EmploymentType - create new-Yes- save-logout
				public void etError() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					WebElement name = driver.findElement(By.xpath("//option[text()='CMS Queens Road']"));
					Thread.sleep(5000);
					name.click();
					driver.findElement(By.xpath("//input[@name='EmploymentTypeName']")).sendKeys("TESTCHECK");
					driver.findElement(By.xpath("//input[@name='description']")).sendKeys("CHECKTEST");
					driver.findElement(By.xpath("//input[@name='Prefix']")).sendKeys("Check");
					driver.findElement(By.xpath("//input[@name='Suffix']")).sendKeys("Test");
					driver.findElement(By.xpath("//option[text()='5']")).click();
					WebElement unit = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
					Thread.sleep(5000);
					unit.click();
					WebElement np= driver.findElement(By.xpath("//input[@name='NumberPreview']"));
					np.clear();
					np.sendKeys("numer122");
					WebElement nnp = driver.findElement(By.xpath("//input[@name='NextNumberPreview']"));
					nnp.clear();
					nnp.sendKeys("numer123");
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
					driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
					Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se.selectByValue("25");
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Permanent");
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//testcase-Edit 
				public void etEdit() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					Thread.sleep(5000);
					//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				// Edit fields
				public void etEdifield() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),'Employment Type')]")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					WebElement type= driver.findElement(By.xpath("//option[@value='wilmar']"));
					type.click();
					WebElement name = driver.findElement(By.xpath("//input[@name='EmploymentTypeName']"));
					name.clear();
					name.sendKeys("Permanent");
					WebElement description = driver.findElement(By.xpath("//input[@name='description']"));
					description.clear();
					description.sendKeys("checkagain");
//					WebElement prefix = driver.findElement(By.xpath("//input[@name='Prefix']"));
//					prefix.clear();
//					prefix.sendKeys("per");
//					WebElement suffix =driver.findElement(By.xpath("//input[@name='Suffix']"));
//					suffix.clear();
//					suffix.sendKeys("manent1");
					WebElement number= driver.findElement(By.xpath("//option[text()='5']"));
					number.click();
//					WebElement unit = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
//					Thread.sleep(5000);
//					unit.click();
					WebElement numberp= driver.findElement(By.xpath("//input[@name='NumberPreview']"));
					numberp.clear();
					numberp.sendKeys("numer1220");
					WebElement nextnumberp=driver.findElement(By.xpath("//input[@name='NextNumberPreview']"));
					nextnumberp.clear();
					nextnumberp.sendKeys("numer121");
					WebElement active = driver.findElement(By.xpath("//option[@value='N']"));
					active.click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}

}
