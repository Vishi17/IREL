package designation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class designation_General {

	public static void main(String[] args) throws InterruptedException {
		designation_General login = new designation_General();
		login.master();
		login.designation();
		login.createNew();
		login.cancel();
		login.backTo();
		login.errorAlert();
		login.showEntries();
		login.edit();
		login.editField();	
	}
//testcase for Login - HR -master -Language- HR- main-logout
		public void master() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			Thread.sleep(1000);
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
//TESTCASE LOGIN,HR,MASTER,designation,GoBack,HR-MAIN, LOGOUT
		public void designation() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
			driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();

		    driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
			//Master - 
			driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
			//Go back
			driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.quit();
		}
//testcase-designation - create new-Yes- save-logout
				public void createNew() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//input[@name='GeneralDesName']")).sendKeys("TEST");
					//TO SELECT VALUE INSIDE <OPTION>
					WebElement select = driver.findElement(By.xpath("//option[text()=' CMD ']"));
					Thread.sleep(5000);
					select.click();
					driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("check ");
					WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
					Thread.sleep(5000);
					option.click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
//testcase-designation- create new-Yes- save-logout
				public void cancel() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					//create New
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//input[@name='GeneralDesName']")).sendKeys("TEST");
					//TO SELECT VALUE INSIDE <OPTION>
					WebElement select = driver.findElement(By.xpath("//option[text()=' CMD ']"));
					Thread.sleep(5000);
					select.click();
					driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("check ");
					WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
					Thread.sleep(5000);
					option.click();
					driver.findElement(By.xpath("//input[@type='reset']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
//Testcase - Create new -back to general designation page - Go back to 
				public void backTo() {
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					//Go Back 
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
				}
// testcase error alert
				public void errorAlert() throws InterruptedException {
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
					driver.findElement(By.xpath("//input[@name='GeneralDesName']")).sendKeys("TEST");
					//TO SELECT VALUE INSIDE <OPTION>
					WebElement select = driver.findElement(By.xpath("//option[text()=' CMD ']"));
					Thread.sleep(5000);
					select.click();
					driver.findElement(By.xpath("//input[@name='Description']")).sendKeys("check ");
					WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
					Thread.sleep(5000);
					option.click();
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					//Alert message -close
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se.selectByValue("25");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("TEST");
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
				//Testcase for list of General designation master - Edit button
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
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
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
					//Thread.sleep(7000);
					driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
					driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
					driver.findElement(By.xpath("//input[@type='submit']")).click(); 
				    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),' Designation')]")).click();
					driver.findElement(By.xpath("//a[text()='General Designation']")).click();
					//edit button
					driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
					WebElement pd = driver.findElement(By.xpath("//input[@name='GeneralDesName']"));
					pd.clear();
					pd.sendKeys("Test");
					WebElement type = driver.findElement(By.xpath("//option[text()='A-1']"));
					Thread.sleep(5000);
					type.click();
					WebElement pc = driver.findElement(By.xpath("//input[@name='Description']"));
					pc.clear();
					pc.sendKeys("none");
					WebElement option = driver.findElement(By.xpath("//option[text()='N']"));
					Thread.sleep(5000);
					option.click();	
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();	
				}				
}

	