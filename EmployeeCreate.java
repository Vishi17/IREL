package employees;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreate {

	public static void main(String[] args) throws InterruptedException {
		EmployeeCreate login = new EmployeeCreate();
		login.newEmployee();
		

	}
	public void newEmployee() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//a[contains(text(),'Employees')]")).click();
	    driver.findElement(By.xpath("//a[text()=' New Employee']")).click();
	    driver.findElement(By.xpath("//input[@name ='employeeCardNumber']")).sendKeys("2");
	    driver.findElement(By.xpath("//input[@name='salutation']")).sendKeys("Test");
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("A");
	    driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("B");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("C");
	    driver.findElement(By.xpath("//input[@name='displayName']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@name='AliasName']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@name='NameAsAadhar']")).sendKeys("ABC");
	    WebElement gender = driver.findElement(By.xpath("//option[text()='Female ']"));
		Thread.sleep(5000);
		gender.click();
		driver.findElement(By.xpath("//input[@name='Religion']")).sendKeys("Hindu");
		driver.findElement(By.xpath("//option[text()='GENERAL ']")).click();
		WebElement category = driver.findElement(By.name("category"));
		Select category1 = new Select(category);
		category1.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("05/17/1993");
		driver.findElement(By.xpath("//input[@name='PlaceOfBirth']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='Birthdistrict']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='BirthState']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='hometown']")).sendKeys("Pune");
		driver.findElement(By.xpath("//option[text()='A+']")).click();
		driver.findElement(By.xpath("//input[@name='personalMarksOfIdentification']")).sendKeys("none");
		driver.findElement(By.xpath("//option[text()='PERMANENT']")).click();
		driver.findElement(By.xpath("//input[@name='dateOfJoining']")).sendKeys("07/13/2001");
        driver.findElement(By.xpath("//input[@name='dateOfJoiningAsTrainee']")).sendKeys("07/14/2001");
        driver.findElement(By.xpath("//input[@name='dateOfJoiningOnRegular']")).sendKeys("08/01/2001");
		driver.findElement(By.xpath("//input[@name='placeOfJoining']")).sendKeys("Bangalore");
		
		//grade

		WebElement grade = driver.findElement(By.xpath("//select[@name='grade']"));
		Select grade1 = new Select(grade);
		grade1.selectByVisibleText("CHIEF GENERAL MANAGER");

//		designation dropdown
		WebElement designation = driver.findElement(By.xpath("//select[@name='designation']"));
		Select designation1 = new Select(designation);
		designation1.selectByVisibleText("CHIEF GENERAL MANAGER");
		//Funational
		WebElement functional = driver.findElement(By.xpath("//select[@name='FunctionalDesignation']"));
		Select functional1 = new Select(functional);
		functional1.selectByVisibleText("ACCOUNTS");
		
		//display designation
	   driver.findElement(By.xpath("//input[@name='DisplayDesignation']")).sendKeys("tester");
		
		//Directorate department drop down
	WebElement DirectretDepartment = driver.findElement(By.xpath("//select[@name='DirectretDepartment']"));
	Select DirectretDepartment1 = new Select(DirectretDepartment);
	DirectretDepartment1.selectByVisibleText("HRM");
		//Parent department
	WebElement parentDepartment = driver.findElement(By.xpath("//select[@name='department']"));
	Select parentDepartment1 = new Select(parentDepartment);
	parentDepartment1.selectByVisibleText("HRM");
 		//Sub departmetn 
	WebElement subDepartment = driver.findElement(By.xpath("//select[@name='subDepartment']"));
	Select subDepartment1 = new Select(subDepartment);
	subDepartment1.selectByVisibleText("ADMINISTRATION");

		//reporting authority
	WebElement supervisorId = driver.findElement(By.xpath("//select[@name='supervisorId']"));
	Select supervisorId1 = new Select(supervisorId);
	supervisorId1.selectByVisibleText("V BAMBAVAKAR [10040] []");
	    //reviewing officer
	WebElement ReviewingAuthority = driver.findElement(By.xpath("//select[@name='ReviewingAuthority']"));
	Select ReviewingAuthority1 = new Select(ReviewingAuthority);
	ReviewingAuthority1.selectByVisibleText("A RPATIL [10030] []");
	
	Thread.sleep(5000);
		//leave recommandation		
	WebElement leaveRecommendingAuth = driver.findElement(By.xpath("//select[@name='leaveRecommendingAuth']"));
	Select leaveRecommendingAuth1 = new Select(leaveRecommendingAuth);
	leaveRecommendingAuth1.selectByVisibleText("RAKESH SHARMA [10011] [OSCOM]");
		//Leave sanctioning
	WebElement leaveSanctioningAuth = driver.findElement(By.xpath("//select[@name='leaveSanctioningAuth']"));
	Select leaveSanctioningAuth1 = new Select(leaveSanctioningAuth);
	leaveSanctioningAuth1.selectByVisibleText("A RPATIL [10030] []");
	
		//Group
		driver.findElement(By.xpath("//option[text()='A']")).click();
		
		//Status
		WebElement status = driver.findElement(By.xpath("//option[text()='Active']"));
		Thread.sleep(5000);
		status.click();
		
		//Status Effective Date *
		WebElement effdate= driver.findElement(By.xpath("//input[@name='StatusEffectDate']"));
		Thread.sleep(3000);
		effdate.sendKeys("07/18/2021");

		//Previous Government Organization Joining Date
		driver.findElement(By.xpath("//input[@name='PreGovJoiningDate']")).sendKeys("07/15/2021");
	
		//Unit establishment
		driver.findElement(By.xpath("//option[text()='OSCOM MINERAL']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Employee Addition Request
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ANJU Singh");
		driver.findElement(By.xpath("//a[text()='View'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		
		//Employee Addition Approver
		driver.findElement(By.xpath("//a[text()=' Employee Addition Approver']")).click();
		
		//Search
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ANJU Singh");
		//Search
		driver.findElement(By.xpath("//a[text()='View'][1]")).click();
		driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("completed");
		driver.findElement(By.xpath("//option[text()='Accept']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
}
	}

