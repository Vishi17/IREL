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
//		login.employeeFill();
		

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
			driver.findElement(By.xpath("//option[text()='SC / ESM ']")).click();
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
			
			//grade
			driver.findElement(By.id("select2-grade-container")).click();
			WebElement grade = driver.findElement(By.xpath("//*[contains(text(),'Chairman & Managing Director')]"));
			grade.click();
			WebElement g = driver.findElement(By.xpath("//option[text()='Chairman & Managing Director']"));
			g.click();
			Thread.sleep(3000);
			//designation dropdown
		    WebElement designation = driver.findElement(By.xpath("//option[text()='CHAIRMAN & MANAGING DIRECTOR']"));
			designation.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='select2-selection__arrow']")).click();
			//Funational
			 WebElement functional = driver.findElement(By.xpath("//option[text()='CMD']"));
			 Thread.sleep(5000);
			 functional.click();
				
			//display designation
			driver.findElement(By.xpath("//input[@name='DisplayDesignation']")).sendKeys("tester");
			
			//Directorate department drop down
			WebElement dirdepart = driver.findElement(By.xpath("//option[text()='HRM']"));
			Thread.sleep(5000);
			dirdepart.click();
			//Parent department
			 WebElement paretndepart = driver.findElement(By.xpath("//option[text()='']"));
			 Thread.sleep(5000);
			 paretndepart.click();
     		//Sub departmetn 
			 WebElement subdepart = driver.findElement(By.xpath("//option[text()='']"));
			 Thread.sleep(5000);
			 subdepart.click(); 

			//reporting authority
//			driver.findElement(By.name("supervisorId")).click();
			WebElement reportdepart = driver.findElement(By.xpath("//option[text()='RAKESH SHARMA [10011] [OSCOM]']"));
			Thread.sleep(5000);
			reportdepart.click(); 
			 Thread.sleep(5000);
		    //reviewing officer
			driver.findElement(By.xpath("//*[@id='select2-ReviewingAuthority-container']")).click();
			WebElement reviewoff = driver.findElement(By.xpath("//option[text()='NEHA NIDHI[8801831][OSCOM]']"));
			Thread.sleep(5000);
			reviewoff.click();
			//leave recommandation		
			WebElement recom=driver.findElement(By.xpath("//input[@id='leaveRecommendingAuth']"));
			recom.click();
			WebElement leaverec = driver.findElement(By.xpath("//option[text()='JOHN SSANIL [10041] []']"));
			Thread.sleep(5000);
			leaverec.click();
			//Leave sanctioning
			driver.findElement(By.id("leaveSanctioningAuth")).click();
            WebElement leavesan = driver.findElement(By.xpath("//option[text()='A RPATIL [10030] []']"));
            Thread.sleep(5000);
            leavesan.click();
			
			//Group
			WebElement group = driver.findElement(By.xpath("//option[text()='A']"));
			Thread.sleep(5000);
			group.click();
			
			//Status
			WebElement status = driver.findElement(By.xpath("//option[text()='Active']"));
			Thread.sleep(5000);
			status.click();
			
			//Status Effective Date *
			WebElement effdate= driver.findElement(By.xpath("//input[@name='StatusEffectDate']"));
			Thread.sleep(3000);
			effdate.sendKeys("07/18/2021");
			
			//Previous Government Organization Joining Date
			WebElement jdate= driver.findElement(By.xpath("//input[@name='PreGovJoiningDate']"));
			Thread.sleep(3000);
			jdate.sendKeys("07/15/2021");
			
			//Unit establishment
			WebElement unit = driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']"));
			Thread.sleep(5000);
			unit.click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.quit();
}
}