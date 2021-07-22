package employees;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindEmployee {

	public static void main(String[] args) throws InterruptedException {
		FindEmployee login =new FindEmployee();
		login.irelLogin();
		login.masterdrop();
		login.employeeCode();
		login.employeeuser();
		login.employeeSave();
		login.employeeCancel();
		login.employeeFilter();
		login.employeeExiating();
//		login.employeeRetired();
		

	}
	//test case - login page
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
	//TESTCASE- LOGIN,HR,Employee- find employee- code- Look up 
		public void employeeCode() throws InterruptedException {
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
			    driver.findElement(By.xpath("//input[@name='partyId']")).sendKeys("8800112");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//input[@value='Look Up Employee']")).click();
			    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			    driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();

}
		//TESTCASE- LOGIN,HR,Employee- find employee- Userlogin- show all record
				public void employeeuser() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("irelmk@dataone.in");
					    Thread.sleep(3000);
					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'10010')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();

		}		
				//TESTCASE- LOGIN,HR,Employee- find employee- Userlogin- save 
				public void employeeSave() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("irelmk@dataone.in");
					    Thread.sleep(3000);
					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'10010')]")).click();
					    driver.findElement(By.xpath("//input[@type='submit']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();

		}	
				//TESTCASE- LOGIN,HR,Employee- find employee- Userlogin- cancel 
				public void employeeCancel() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("irelmk@dataone.in");
					    Thread.sleep(3000);
					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'10010')]")).click();
					    driver.findElement(By.xpath("//a[text()='Cancel']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
}
				//TESTCASE2- LOGIN,HR,Employee- find employee- all the filter 
				public void employeeFilter() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arun");
					    Thread.sleep(3000);
					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    Thread.sleep(5000);
					    WebElement fn= driver.findElement(By.xpath("//input[@name='firstName']"));
					    fn.clear();
					    fn.sendKeys("Arun");
					    driver.findElement(By.xpath("//input[@value='Look Up Employee']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    WebElement fn1= driver.findElement(By.xpath("//input[@name='firstName']"));
					    fn1.clear();
					    Thread.sleep(5000);
					    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nahak");
					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
                       WebElement ln= driver.findElement(By.xpath("//input[@name='lastName']"));
                       ln.clear();
                       ln.sendKeys("Nahak");
                       WebElement ln1= driver.findElement(By.xpath("//input[@name='lastName']"));
					    ln1.clear();
                        Thread.sleep(5000);
					    driver.findElement(By.xpath("//input[@value='Look Up Employee']")).click();
					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
//					    driver.findElement(By.xpath("//option[text()='Executive']")).click();
//					    driver.findElement(By.xpath("//a[contains(text(),'Show all records')]")).click();
//					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
//					    Thread.sleep(3000);
//					    driver.findElement(By.xpath("//option[text()='Executive']")).click();
//					    driver.findElement(By.xpath("//input[@value='Look Up Employee']")).click();
//					    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
}
				//TESTCASE- LOGIN,HR,Employee- find employee- radio button 
				public void employeeExiating() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@type='radio' and @id='Existing']")).click();
					    driver.findElement(By.xpath("//option[text()='RED']")).click();
					    Thread.sleep(3000);
					    WebElement status = driver.findElement(By.xpath("//option[contains(text(),'All')]"));
						status.click();
						Thread.sleep(5000);
						WebElement type = driver.findElement(By.xpath("//option[contains(text(),'PERMANENT')]"));
						type.click();
					    driver.findElement(By.xpath("//input[@id='ExistingEmp']")).click();
					    Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
						se.selectByValue("10");
						Thread.sleep(5000);
						driver.findElement(By.xpath("//input[@type='search']")).sendKeys("K RANI ALEX ALEX");
						driver.findElement(By.xpath("//a[contains(text(),'8800038')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
					    
}
				//TESTCASE- LOGIN,HR,Employee- find employee- radio button - retired 
				public void employeeRetired() throws InterruptedException {
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
					    driver.findElement(By.xpath("//input[@type='radio' and @id='Retired']")).click();
					    Thread.sleep(5000);
					    driver.findElement(By.xpath("//option[text()='RED']")).click();
					    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					    WebElement option = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
						Thread.sleep(5000);
						option.click();
					    driver.findElement(By.xpath("//input[@id='RetiredEmp']")).click();
					    Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
						se.selectByValue("10");
						Thread.sleep(5000);
						driver.findElement(By.xpath("//input[@type='search']")).sendKeys("K RANI ALEX ALEX");
						driver.findElement(By.xpath("//a[contains(text(),'8800038')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					    driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.quit();
}
				
}