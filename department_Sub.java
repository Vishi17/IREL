package department;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class department_Sub {

	public static void main(String[] args) throws InterruptedException {
		department_Sub login = new department_Sub();
		login.master();
		login.depart();
		login.subDepart();
		login.createNew();
		login.cancel();
		login.backTo();
		login.errorAlert();
		login.showEntries();
		login.edit();
	}
	//testcase for Login - master - department 
			public void master() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://115.124.105.99:6443/humanres/control/main");
				driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
			//TESTCASE LOGIN,HR,MASTER,department,GoBack,HR-MAIN, LOGOUT
			public void depart() throws InterruptedException {
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
				//Master - department
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				//Go back
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
			}
			//testcase-department- Sub Department-Yes- save-logout
			public void subDepart() throws InterruptedException {
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
				//Master - department and SUB department
				 driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				 driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				//Go back
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
				
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
			}
			//testcase-department - create new-Yes- save-logout
			public void createNew() throws InterruptedException {
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
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				//create New
				driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Test");
				driver.findElement(By.xpath("//input[@name='departmentCode']")).sendKeys("test1705");
				//Thread.sleep(1000);
				//TO SELECT VALUE INSIDE <OPTION>
				WebElement select = driver.findElement(By.xpath("//option[text()=' SAFETY  & TRAINING ']"));
				Thread.sleep(5000);
				select.click();
				driver.findElement(By.xpath("//input[@name='description']")).sendKeys("check");
				WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
				Thread.sleep(5000);
				option.click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
			}
			//testcase - create new-No- cancel-logout
			public void cancel() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
			    driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
			    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
			    driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("");
				driver.findElement(By.xpath("//input[@name='departmentCode']")).sendKeys("");
				//TO SELECT VALUE INSIDE <OPTION>
				WebElement select = driver.findElement(By.xpath("//option[text()=' SAFETY  & TRAINING ']"));
				Thread.sleep(5000);
				select.click();
				driver.findElement(By.xpath("//input[@name='description']")).sendKeys("check");
				WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
				Thread.sleep(5000);
				option.click();
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			  driver.quit();
			}
			//Testcase - Create new -back to sub depart page - Go back to 
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
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
				//Go Back 
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
			}
			//Testcase - handling error pop up
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
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
			    driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Test");
				driver.findElement(By.xpath("//input[@name='departmentCode']")).sendKeys("test1705");
				//TO SELECT VALUE INSIDE <OPTION>
				WebElement select = driver.findElement(By.xpath("//option[text()=' SAFETY  & TRAINING ']"));
				Thread.sleep(5000);
				select.click();
				driver.findElement(By.xpath("//input[@name='description']")).sendKeys("check");
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
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
				se.selectByValue("25");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Test");
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
			}
			//Testcase for list of sub master - Edit button
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
				driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
				driver.findElement(By.xpath("//a[text()='Sub Department']")).click();
				//edit button
				driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
				//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
			}
			
}
