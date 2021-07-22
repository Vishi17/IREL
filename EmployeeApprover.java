package employees;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeApprover {

	public static void main(String[] args) throws InterruptedException {
		EmployeeApprover login = new EmployeeApprover();
		login.irelLogin();
		login.masterdrop();
		login.employeeAprrove();
		login.employeeView();
		login.employeeReset();
		login.showEntries();

	}
	//test case 1- login page
			public void irelLogin() throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://115.124.105.99:6443/humanres/control/main");
				driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[text()='Language : English']")).click();
				driver.findElement(By.xpath("//a[text()='Cancel']")).click();
				driver.findElement(By.xpath("//h2[text()='Applications']")).click();
				driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				 driver.quit();
				}
			//TESTCASE- LOGIN,HR,MASTER,LANGAUGE,LOGOUT
			public void masterdrop() throws InterruptedException {
					System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					WebDriver driver = new ChromeDriver(); 
					driver.get("https://115.124.105.99:6443/humanres/control/main");
					driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
					driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
					driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
					driver.findElement(By.xpath("//input[@type='submit']")).click(); 
				    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
					driver.findElement(By.xpath("//a[text()='Language : English']")).click();
					driver.findElement(By.xpath("//a[text()='Cancel']")).click();
					driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Main')]")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
			}
			//TESTCASE- LOGIN,HR,MASTER,LANGAUGE,LOGOUT
				public void employeeAprrove() throws InterruptedException {
						System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						WebDriver driver = new ChromeDriver(); 
						driver.get("https://115.124.105.99:6443/humanres/control/main");
						driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
						driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
						driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
						driver.findElement(By.xpath("//input[@type='submit']")).click(); 
					    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
					    driver.findElement(By.xpath("//a[text()=' Employee Addition Approver']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
						driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Main')]")).click();
						driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
	}
				//TESTCASE- Employee view -submit
				public void employeeView() throws InterruptedException {
						System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						WebDriver driver = new ChromeDriver(); 
						driver.get("https://115.124.105.99:6443/humanres/control/main");
						driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
						driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
						driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
						driver.findElement(By.xpath("//input[@type='submit']")).click(); 
					    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
					    driver.findElement(By.xpath("//a[text()=' Employee Addition Approver']")).click();
					    driver.findElement(By.xpath("//a[text()='View'][1]")).click();
					    driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("completed");
					    driver.findElement(By.xpath("//option[text()='Accept']")).click();
					    driver.findElement(By.xpath("//input[@type='submit']")).click();
					    driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
	}
				//TESTCASE- Employee view -reset
				public void employeeReset() throws InterruptedException {
						System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						WebDriver driver = new ChromeDriver(); 
						driver.get("https://115.124.105.99:6443/humanres/control/main");
						driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
						driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
						driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
						driver.findElement(By.xpath("//input[@type='submit']")).click(); 
					    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
					    driver.findElement(By.xpath("//a[text()=' Employee Addition Approver']")).click();
					    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Arun");
					    driver.findElement(By.xpath("//a[text()='View']")).click();
					    driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("completed");
					    driver.findElement(By.xpath("//option[text()='Accept']")).click();
					    driver.findElement(By.xpath("//input[@type='reset']")).click();
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
					driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Employee Addition Approver')]")).click();
					Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
					se.selectByValue("10");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Arun");
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
				    driver.quit();
				}
}