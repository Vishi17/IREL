package employees;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewEmployee {
	public static void main(String[] args) throws InterruptedException {
		NewEmployee login = new NewEmployee();
//		login.irelLogin();
//		login.masterdrop();
//		login.employee();
		login.employeeFill();
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
	//TESTCASE2- LOGIN,HR,MASTER,LANGAUGE,LOGOUT
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
	//TESTCASE2- LOGIN,HR,MASTER,LANGAUGE,LOGOUT
		public void employee() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[text()=' New Employee']")).click();
			    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Main')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
//Testcase3- New employee field		
		public void employeeFill() throws InterruptedException {
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
		    driver.findElement(By.xpath("//a[text()=' New Employee']")).click();
		    driver.findElement(By.xpath("//input[@name ='employeeCardNumber']")).sendKeys("2");
		    driver.findElement(By.xpath("//input[@name='salutation']")).sendKeys("Test");
		    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Dhara");
		    driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Gautam");
		    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pandya");
		    driver.findElement(By.xpath("//input[@name='displayName']")).sendKeys("DGP");
		    driver.findElement(By.xpath("//input[@name='AliasName']")).sendKeys("Dhara");
		    driver.findElement(By.xpath("//input[@name='NameAsAadhar']")).sendKeys("Dhara pandya");
		    WebElement gender = driver.findElement(By.xpath("//option[text()='Female ']"));
			Thread.sleep(5000);
			gender.click();
			driver.findElement(By.xpath("//input[@name='Religion']")).sendKeys("Hindu");
			driver.findElement(By.xpath("//option[text()='OBC/ ESM ']")).click();
			Thread.sleep(5000);
//			driver.findElement(By.xpath("//option[text()='SC / ESM ']")).click();
			WebElement dob= driver.findElement(By.xpath("//input[@name='birthDate']"));
			Thread.sleep(3000);
			dob.sendKeys("05/17/1993");
			driver.findElement(By.xpath("//input[@name='PlaceOfBirth']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@name='Birthdistrict']")).sendKeys("Pune");
			driver.findElement(By.xpath("//input[@name='BirthState']")).sendKeys("Maharashtra");
			driver.findElement(By.xpath("//input[@name='hometown']")).sendKeys("Pune");
			WebElement bloodgr = driver.findElement(By.xpath("//option[text()='A+']"));
			Thread.sleep(5000);
			bloodgr.click();
			driver.findElement(By.xpath("//input[@name='personalMarksOfIdentification']")).sendKeys("none");
			WebElement et = driver.findElement(By.xpath("//option[text()='PERMANENT']"));
			Thread.sleep(5000);
			et.click();
			WebElement doj= driver.findElement(By.xpath("//input[@name='dateOfJoining']"));
			Thread.sleep(3000);
			doj.sendKeys("07/13/2001");
			WebElement dot= driver.findElement(By.xpath("//input[@name='dateOfJoiningAsTrainee']"));
			Thread.sleep(3000);
			dot.sendKeys("07/14/2001");
			WebElement dojr= driver.findElement(By.xpath("//input[@name='dateOfJoiningOnRegular']"));
			Thread.sleep(3000);
			dojr.sendKeys("08/01/2001");
			driver.findElement(By.xpath("//input[@name='placeOfJoining']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//div[contains(text(),'Select some options')]")).click();
			WebElement qualification = driver.findElement(By.xpath("//div[text()='screenlet_1_col']"));
			qualification.click();
			Thread.sleep(5000);
}
}
