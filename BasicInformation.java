package employees;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicInformation {

	public static void main(String[] args) throws InterruptedException {
		BasicInformation login = new BasicInformation();
		login.irelLogin1();
		login.masterdrop1();
		login.employeeFind();
		login.employeeBasic();
		login.employeeBasicDetails();
		login.employeePersonal();
		login.employeeQulification();
		login.employeeQEdit();
		login.employeeQDelete();
	        login.employeeEmHistory();	
		login.employeeHEdit();
		login.employeeHDelete();
		login.employeeNomDetails();
		login.employeeNEdit();
		login.employeeNDelete();
		login.employeeNAdd();
		login.declearationForm();
		login.declearationFormView();
		login.declearationFormRemove();
		login.joiningdoc();
		login.joiningDocView();
		login.joinDocRemove();
		login.trainingPeriod();
		login.probationPeriod();


	}
	//test case - login page
			public void irelLogin1() throws InterruptedException {
			
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
			public void masterdrop1() throws InterruptedException {
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
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page
			public void employeeFind() throws InterruptedException {
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
				    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				    driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();

	}				
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Basic information-go back - logout
			public void employeeBasic() throws InterruptedException {
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
				    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
			        driver.findElement(By.xpath("//a[contains(text,'Basic Information')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				    driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Basic information	
			public void employeeBasicDetails() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text,'Basic Information')]")).click();
		        driver.findElement(By.xpath("//input[@name='salutation']")).sendKeys("Mr.");
		        WebElement gender = driver.findElement(By.xpath("//option[text()='Male ']"));
				Thread.sleep(5000);
				gender.click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
	}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Basic information	
			public void employeePersonal() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();	 
		        driver.findElement(By.xpath("//input[@id='ExeNonExe']")).sendKeys("Permanant");
		        WebElement cost = driver.findElement(By.xpath("//option[text()='1012901-po']"));
				Thread.sleep(3000);
				cost.click();
				WebElement punit = driver.findElement(By.xpath("//option[text()='CO, Prabhadevi, Mumbai']"));
				Thread.sleep(3000);
				punit.click();
				driver.findElement(By.xpath("//input[@id='permanentFlatNumber']")).sendKeys("FlatNo123");
				driver.findElement(By.xpath("//input[@id='permanentStreet']")).sendKeys("streetNo123");
				driver.findElement(By.xpath("//input[@id='permanentCity']")).sendKeys("Kerala");
				driver.findElement(By.xpath("//input[@id='permanentDistrict']")).sendKeys("Kerala");
				WebElement state = driver.findElement(By.xpath("//option[text()='Kerala']"));
				Thread.sleep(3000);
				state.click();
				driver.findElement(By.xpath("//input[@id='permanentCountry']")).sendKeys("India");
				driver.findElement(By.xpath("//input[@id='permanentPinCode']")).sendKeys("1100111");
				driver.findElement(By.xpath("//input[@id='presentAddSameAsPermanentAdd']")).click();
				driver.findElement(By.xpath("//input[@id='permanentPinCode']")).sendKeys("xyz@gmail.com");
				driver.findElement(By.xpath("//input[@id='contactNo']")).sendKeys("0221-1223343");
				driver.findElement(By.xpath("//input[@id='emergencyContactNo']")).sendKeys("0221-1223343");
				driver.findElement(By.xpath("//input[@id='passportNumber']")).sendKeys("PNO.7675656");
				driver.findElement(By.xpath("//input[@id='passportIssuePlace']")).sendKeys("Kerala");
				driver.findElement(By.xpath("//input[@id='Holidaydate']")).sendKeys("09/12/2011");
				driver.findElement(By.xpath("//input[@id='Holidaydate1']")).sendKeys("09/12/2023");
				WebElement mstatus = driver.findElement(By.xpath("//option[text()='Married']"));
				Thread.sleep(3000);
				mstatus.click();
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Qualification information	
			public void employeeQulification() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employee Qualifications')]")).click();
		        WebElement type = driver.findElement(By.xpath("//option[text()='MBA ']"));
				Thread.sleep(3000);
				type.click(); 
				driver.findElement(By.xpath("//input[@name='examinationBoard']")).sendKeys("kerala Board");
				WebElement dd = driver.findElement(By.xpath("//option[text()='MA ']"));
				Thread.sleep(3000);
				dd.click(); 
				WebElement branch = driver.findElement(By.xpath("//option[text()='Industrial Economics ']"));
				Thread.sleep(3000);
				branch.click();
				WebElement mode = driver.findElement(By.xpath("//option[text()='Regular']"));
				Thread.sleep(3000);
				mode.click();
				driver.findElement(By.xpath("//input[@name='classOrDistinction']")).sendKeys("1st");
				driver.findElement(By.xpath("//input[@name='collegeOrUniversity']")).sendKeys("kerala state university");
				WebElement year = driver.findElement(By.xpath("//option[text()='1990']"));
				Thread.sleep(3000);
				year.click();
				WebElement month = driver.findElement(By.xpath("//option[text()='July']"));
				Thread.sleep(3000);
				month.click();
				WebElement group = driver.findElement(By.xpath("//option[text()='101']"));
				Thread.sleep(3000);
				group.click();
				WebElement passing= driver.findElement(By.xpath("//option[text()='2001']"));
				Thread.sleep(3000);
				passing.click();
				WebElement mpassing= driver.findElement(By.xpath("//option[text()='February']"));
				Thread.sleep(3000);
				mpassing.click();
				driver.findElement(By.xpath("//input[@name='percentage']")).sendKeys("70");
				driver.findElement(By.xpath("//input[@name='remark']")).sendKeys("Remark");
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
				
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Qualification information-Edit	
			public void employeeQEdit() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employee Qualifications')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
				WebElement branch = driver.findElement(By.xpath("//option[text()='Industrial Economics ']"));
				Thread.sleep(3000);
				branch.click();
				WebElement mode = driver.findElement(By.xpath("//option[text()='Regular']"));
				Thread.sleep(3000);
				mode.click();
				driver.findElement(By.xpath("//input[@name='classOrDistinction']")).sendKeys("1st");
				WebElement year = driver.findElement(By.xpath("//option[text()='1990']"));
				Thread.sleep(3000);
				year.click();
				WebElement month = driver.findElement(By.xpath("//option[text()='July']"));
				Thread.sleep(3000);
				month.click();
				WebElement group = driver.findElement(By.xpath("//option[text()='101']"));
				Thread.sleep(3000);
				group.click();
				WebElement passing= driver.findElement(By.xpath("//option[text()='2001']"));
				Thread.sleep(3000);
				passing.click();
				WebElement mpassing= driver.findElement(By.xpath("//option[text()='February']"));
				Thread.sleep(3000);
				mpassing.click();
				driver.findElement(By.xpath("//input[@name='percentage']")).sendKeys("70");
				driver.findElement(By.xpath("//input[@name='remark']")).sendKeys("Remark");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
				
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Qualification information-Delete
			public void employeeQDelete() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employee Qualifications')]")).click();
		        driver.findElement(By.xpath("(//a[text()='Delete'])")).click();
		        // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();				
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);		
		        // Accepting alert		
		        alert.dismiss();	
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Emp History
			public void employeeEmHistory() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employment History')]")).click();
		        driver.findElement(By.xpath("//input[@name='employer']")).sendKeys("xyz");
		        driver.findElement(By.xpath("//input[@name='AddressOfPreviousEmp']")).sendKeys("abd");
		        driver.findElement(By.xpath("//input[@name='positionHeld']")).sendKeys("AQ");
		        WebElement pt= driver.findElement(By.xpath("//option[text()='Private']"));
				Thread.sleep(3000);
				pt.click();
				driver.findElement(By.xpath("//input[@name='Areaofwork']")).sendKeys("AQ1");
				WebElement not= driver.findElement(By.xpath("//option[text()='Yes']"));
				Thread.sleep(3000);
				not.click();
				driver.findElement(By.xpath("//input[@name='reasonOfLeaving']")).sendKeys("none");
				driver.findElement(By.xpath("//input[@name='fromDate']")).sendKeys("09/09/2001");
				driver.findElement(By.xpath("//input[@name='toDate']")).sendKeys("12/12/2020");
//				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Qualification information-Edit	
			public void employeeHEdit() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employee Qualifications')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employment History')]")).click();
		        driver.findElement(By.xpath("//input[@name='employer']")).sendKeys("xyz");
		        driver.findElement(By.xpath("//input[@name='AddressOfPreviousEmp']")).sendKeys("abd");
		        driver.findElement(By.xpath("//input[@name='positionHeld']")).sendKeys("AQ");
		        WebElement pt= driver.findElement(By.xpath("//option[text()='Private']"));
				Thread.sleep(3000);
				pt.click();
				driver.findElement(By.xpath("//input[@name='Areaofwork']")).sendKeys("AQ1");
				WebElement not= driver.findElement(By.xpath("//option[text()='Yes']"));
				Thread.sleep(3000);
				not.click();
				driver.findElement(By.xpath("//input[@name='reasonOfLeaving']")).sendKeys("none");
				driver.findElement(By.xpath("//input[@name='fromDate']")).sendKeys("09/09/2001");
				driver.findElement(By.xpath("//input[@name='toDate']")).sendKeys("12/12/2020");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();				
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Qualification information-Delete
			public void employeeHDelete() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Employment History')]")).click();
		        driver.findElement(By.xpath("(//a[text()='Delete'])")).click();
		        // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();				
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);		
		        // Accepting alert		
		        alert.dismiss();	
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Nom Details
			public void employeeNomDetails() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nominee(Heir) Details')]")).click();
		        driver.findElement(By.xpath("//input[@name='nameOfHeirs']")).sendKeys("xyz");
		        WebElement address= driver.findElement(By.xpath("//input[contains(text(),'address')]"));
		        Thread.sleep(3000);
		        address.sendKeys("abd");
		        driver.findElement(By.xpath("//input[@name='contactNumber']")).sendKeys("0221-987656");
		        WebElement pt= driver.findElement(By.xpath("//option[text()='BROSIS ']"));
				Thread.sleep(3000);
				pt.click();
				driver.findElement(By.xpath("//input[@name='pf']")).sendKeys("12");
				driver.findElement(By.xpath("//input[@name='pension']")).sendKeys("10");
				driver.findElement(By.xpath("//input[@name='gratuity']")).sendKeys("2");
//				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Nom Details-Edit	
			public void employeeNEdit() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Nominee(Heir) Details')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		        WebElement name = driver.findElement(By.xpath("//input[@name='nameOfHeirs']"));
		        name.clear();
		        name.sendKeys("umesh");
		        //driver.findElement(By.xpath("//input[@name=' address']")).sendKeys("address1");
		        driver.findElement(By.xpath("//input[@name='contactNumber']")).sendKeys("0221-987656");
		        WebElement pt= driver.findElement(By.xpath("//option[text()='Arjun']"));
				Thread.sleep(3000);
				pt.click();
				WebElement pf= driver.findElement(By.xpath("//input[@name='pf']"));
				pf.clear();
				pf.sendKeys("12");
				WebElement eps=driver.findElement(By.xpath("//input[@name='pension']"));
				eps.clear();
				eps.sendKeys("10");
				WebElement g= driver.findElement(By.xpath("//input[@name='gratuity']"));
				g.clear();
				g.sendKeys("2");
				driver.findElement(By.xpath("//input[@type='reset']")).click();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();				
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Nomaniee-Delete
			public void employeeNDelete() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nominee(Heir) Details')]")).click();
		        driver.findElement(By.xpath("(//a[text()='Delete'])")).click();
		        // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        // Capturing alert message.    
		        String alertMessage= driver.switchTo().alert().getText();				
		        // Displaying alert message		
		        System.out.println(alertMessage);	
		        Thread.sleep(5000);		
		        // Accepting alert		
		        alert.dismiss();	
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Nomaniee-Addheirdetails
			public void employeeNAdd() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nominee(Heir) Details')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-declearation form
			public void declearationForm() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nomination/Declaration Forms')]")).click();
		        WebElement pt= driver.findElement(By.xpath("//option[text()='Computers']"));
				Thread.sleep(3000);
				pt.click();
				WebElement cf = driver.findElement(By.xpath("//input[@type='file']"));
			    cf.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-declearation form-View
			public void declearationFormView() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nomination/Declaration Forms')]")).click();
				WebElement button1 = driver.findElement(By.xpath("//a[text()='View']"));
				String parentWindowHandle = driver.getWindowHandle();
				button1.click();
				driver.switchTo().window(parentWindowHandle);
				Set<String> allWindows=driver.getWindowHandles();
				int count=allWindows.size();
				System.out.println("Total window" +count);
				
				for(String child:allWindows)
				{
					if(!parentWindowHandle.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						
						Thread.sleep(5000);
						driver.close();
					}
				}
				driver.switchTo().window(parentWindowHandle);
				System.out.println("Parent window title is" +driver.getTitle());

		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-declearation form-remove
			public void declearationFormRemove() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Nomination/Declaration Forms')]")).click();
		        driver.findElement(By.xpath("(//a[text()='Remove'][1])")).click();
		       // driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}		
//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Joining doc
			public void joiningdoc() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Joining Document')]")).click();
		        WebElement pt= driver.findElement(By.xpath("//option[text()='Joining formalities document.']"));
				Thread.sleep(3000);
				pt.click();
				WebElement joindoc = driver.findElement(By.xpath("//input[@type='file']"));
			    joindoc.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
//				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Joining doc-View
			public void joiningDocView() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Joining Document')]")).click();
				WebElement button1 = driver.findElement(By.xpath("//a[text()='View']"));
				String parentWindowHandle = driver.getWindowHandle();
				button1.click();
				driver.switchTo().window(parentWindowHandle);
				Set<String> allWindows=driver.getWindowHandles();
				int count=allWindows.size();
				System.out.println("Total window" +count);
				
				for(String child:allWindows)
				{
					if(!parentWindowHandle.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						
						Thread.sleep(5000);
						driver.close();
					}
				}
				driver.switchTo().window(parentWindowHandle);
				System.out.println("Parent window title is" +driver.getTitle());

		        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-declearation form-remove
			public void joinDocRemove() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Joining Document')]")).click();
		        driver.findElement(By.xpath("(//a[text()='Remove'][1])")).click();
		       // driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Trainin period
			public void trainingPeriod() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),' Training Period')]")).click();
		        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("July");
		        driver.findElement(By.xpath("//input[@name='description']")).sendKeys("7month");
		        driver.findElement(By.xpath("//input[@id='Month']")).sendKeys("JULY");
		       // driver.findElement(By.xpath("//input[@id='trainingperiod']")).click();
		        driver.findElement(By.xpath("//input[@id='StartingDate']")).sendKeys("05/05/2021");
		        driver.findElement(By.xpath("//input[@name='EndingDate']")).sendKeys("05/05/2022");
		        WebElement extn= driver.findElement(By.xpath("//option[text()='Yes']"));
				Thread.sleep(3000);
				extn.click();
				driver.findElement(By.xpath("//input[@id='ExtensionPeriod']")).sendKeys("6month");
				driver.findElement(By.xpath("//*[@class='fs-wrap multiple fs-default']")).click();
				WebElement reviewoff = driver.findElement(By.xpath("//option[text()='LOP']"));
				Thread.sleep(5000);
				reviewoff.click();
				driver.findElement(By.xpath("//*[@class='fs-arrow']")).click();
				driver.findElement(By.xpath("//input[@name='AfterTrainingPeriod']")).click();
				driver.findElement(By.xpath("//input[@id='Remarks']")).sendKeys("speak");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}
			//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-probation period
			public void probationPeriod() throws InterruptedException {
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
			    driver.findElement(By.xpath("//a[contains(text(),'8800112')]")).click();
		        driver.findElement(By.xpath("//a[contains(text(),'Probation Period')]")).click();
		        driver.findElement(By.xpath("//input[@name='ProbationPeriodName']")).sendKeys("July");
		        WebElement reviewoff = driver.findElement(By.xpath("//option[text()='Probation Period on Joining']"));
				Thread.sleep(5000);
				reviewoff.click();
		        driver.findElement(By.xpath("//input[@id='Month']")).sendKeys("May");
		        WebElement description = driver.findElement(By.xpath("//option[text()='Probation Period on Joining']"));
				Thread.sleep(5000);
				description.click();
		        driver.findElement(By.xpath("//input[@id='InductionFrom']")).sendKeys("05/05/2022");
		        driver.findElement(By.xpath("//input[@id='InductionTo']")).sendKeys("05/06/2022");
		        driver.findElement(By.xpath("//input[@id='StartingDate']")).sendKeys("05/05/2022");
		        driver.findElement(By.xpath("//input[@id='EndingDate']")).sendKeys("05/06/2022");
		        WebElement posting=driver.findElement(By.xpath("//input[@id='PlaceofPosting']"));
		        posting.clear();
		        posting.sendKeys("RED");
		        WebElement any= driver.findElement(By.xpath("//option[text()='NO']"));
				Thread.sleep(3000);
				any.click();
//				driver.findElement(By.xpath("//input[@id='ExtensionPeriod']")).sendKeys("9");
//				driver.findElement(By.xpath("//*[@class='fs-label-wrap']")).click();
//				WebElement extn = driver.findElement(By.xpath("//option[text()='LOP']"));
//				Thread.sleep(3000);
//				extn.click();
//				driver.findElement(By.xpath("//*[@class='fs-arrow']")).click();
				driver.findElement(By.xpath("//input[@id='Confirmation_W_E_F']")).sendKeys("05/06/2022");
//				WebElement designation= driver.findElement(By.xpath("//option[text()='']"));
//				Thread.sleep(3000);
//				designation.click();
				driver.findElement(By.xpath("//input[@id='Remarks']")).sendKeys("speak");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
}			
}
