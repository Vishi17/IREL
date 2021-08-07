package employees;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EmployeeBasic {
	public static void main(String[] args) throws InterruptedException {
		EmployeeBasic login = new EmployeeBasic();
		login.transferHistoryInter();
		login.transferHistoryIntra();
		login.promotionHistory();
		login.serviceBook();
		login.reDesignation();
		login.payRecord();
		login.securitySetting();
		login.securityGroup();
	}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click -basic information - Transfer History- Inter	
	public void transferHistoryInter() throws InterruptedException {
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
        driver.findElement(By.xpath("//a[contains(text(),' Transfer History')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[contains(text(),'* Inter Unit Transfer History')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
        driver.findElement(By.xpath("//input[@name='officeOrderNo']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@name='officeOrderDate']")).sendKeys("08/02/2021");
        driver.findElement(By.xpath("//option[text()='CHAVARA']")).click();
        WebElement transferredTo = driver.findElement(By.xpath("//select[@name='transferredTo']"));
    	Select transferredTo1 = new Select(transferredTo);
    	transferredTo1.selectByVisibleText("RED");
    	driver.findElement(By.xpath("//option[text()=' AUDIT ']")).click();
    	WebElement departmentTransferredTo = driver.findElement(By.xpath("//select[@name='departmentTransferredTo']"));
    	Select departmentTransferredTo1 = new Select(departmentTransferredTo);
    	departmentTransferredTo1.selectByVisibleText("BANKING");
        driver.findElement(By.xpath("//input[@name='relivingDate']")).sendKeys("08/20/2021");
        driver.findElement(By.xpath("//input[@name='reportingDate']")).sendKeys("08/25/2021");
        driver.findElement(By.xpath("//input[@name='reportingOfficeOrderNo']")).sendKeys("7869");
        driver.findElement(By.xpath("//input[@name='reportingOfficeOrderDate']")).sendKeys("08/25/2021");
        driver.findElement(By.xpath("//input[@name='transferGrant']")).sendKeys("7869");
        driver.findElement(By.xpath("//input[@name='Remarks']")).sendKeys("7869");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        //driver.findElement(By.xpath("//input[@name='reset']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        WebElement remark = driver.findElement(By.xpath("//input[@name='Remarks']"));
        remark.clear();
        remark.sendKeys("updated");
        driver.findElement(By.xpath("//input[@value='UPDATE']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
        
}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click -basic information - Transfer History- Inter	
		public void transferHistoryIntra() throws InterruptedException {
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
	        driver.findElement(By.xpath("//a[contains(text(),' Transfer History')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//h2[contains(text(),'* Intra Unit Transfer History')]")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	        driver.findElement(By.xpath("//input[@name='officeOrderNo']")).sendKeys("12345");
	        driver.findElement(By.xpath("//input[@name='officeOrderDate']")).sendKeys("08/02/2021");
	    	driver.findElement(By.xpath("//option[text()=' AUDIT ']")).click();
	    	WebElement departmentTransferredTo = driver.findElement(By.xpath("//select[@name='departmentTransferredTo']"));
	    	Select departmentTransferredTo1 = new Select(departmentTransferredTo);
	    	departmentTransferredTo1.selectByVisibleText("BANKING");
	        driver.findElement(By.xpath("//input[@name='relivingDate']")).sendKeys("08/20/2021");
	        driver.findElement(By.xpath("//input[@name='reportingDate']")).sendKeys("08/25/2021");
	        driver.findElement(By.xpath("//input[@name='reportingOfficeOrderNo']")).sendKeys("7869");
	        driver.findElement(By.xpath("//input[@name='reportingOfficeOrderDate']")).sendKeys("08/25/2021");
	        driver.findElement(By.xpath("//input[@name='Remarks']")).sendKeys("new");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@value='Save']")).click();
	        //driver.findElement(By.xpath("//input[@name='reset']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	        WebElement remark = driver.findElement(By.xpath("//input[@name='Remarks']"));
	        remark.clear();
	        remark.sendKeys("updatednew");
	        driver.findElement(By.xpath("//input[@value='Update	']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        driver.quit();
	        
	}	
		//TESTCASE- LOGIN,HR,Employee- find employee- user - click -basic information - Promotion History
		public void promotionHistory() throws InterruptedException {
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
	        driver.findElement(By.xpath("//a[contains(text(),' Promotion History')]")).click();     
	        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	        driver.findElement(By.xpath("//input[@name='promotionOrderNo']")).sendKeys("12345");
	        driver.findElement(By.xpath("//input[@name='promotionOrderDate']")).sendKeys("07/02/2021");
	        driver.findElement(By.xpath("//input[@name='promotionEffectiveDate']")).sendKeys("07/02/2021");
	        WebElement gradeBeforePromotion = driver.findElement(By.xpath("//select[@name='gradeBeforePromotion']"));
	    	Select gradeBeforePromotion1 = new Select(gradeBeforePromotion);
	    	gradeBeforePromotion1.selectByVisibleText("CHIEF GENERAL MANAGER");
	    	Thread.sleep(3000);
	    	WebElement genDesignationBeforePro = driver.findElement(By.xpath("//select[@name='genDesignationBeforePro']"));
	    	Select genDesignationBeforePro1 = new Select(genDesignationBeforePro);
	    	genDesignationBeforePro1.selectByIndex(1);
	    	Thread.sleep(3000);
	    	WebElement funcDesignationBeforePro = driver.findElement(By.xpath("//select[@name='funcDesignationBeforePro']"));
	    	Select funcDesignationBeforePro1 = new Select(funcDesignationBeforePro);
	    	funcDesignationBeforePro1.selectByVisibleText("HR & ADMINISTRATION");
	    	WebElement gradeAfterPromotion = driver.findElement(By.xpath("//select[@name='gradeAfterPromotion']"));
		    Select gradeAfterPromotion1 = new Select(gradeAfterPromotion);
		    gradeAfterPromotion1.selectByVisibleText("DEPUTY GENERAL MANAGER");
		    WebElement genDesignationAfterPro = driver.findElement(By.xpath("//select[@name='genDesignationAfterPro']"));
		    Select genDesignationAfterPro1 = new Select(genDesignationAfterPro);
		    genDesignationAfterPro1.selectByVisibleText("DEPUTY GENERAL MANAGER");
		    WebElement funcDesignationAfterPro = driver.findElement(By.xpath("//select[@name='funcDesignationAfterPro']"));
		    Select funcDesignationAfterPro1 = new Select(funcDesignationAfterPro);
		    funcDesignationAfterPro1.selectByVisibleText("ACCOUNTS & COSTING");
		    driver.findElement(By.xpath("//input[@name='dispDesignationAfterPro']")).sendKeys("hdfhd");
		    driver.findElement(By.xpath("//input[@name='Remarks']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@value='Save']")).click();
		    Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	        WebElement funcDesignationProbation = driver.findElement(By.xpath("//select[@name='funcDesignationProbation']"));
		    Select funcDesignationProbation1 = new Select(funcDesignationProbation);
		    funcDesignationProbation1.selectByIndex(3);
		    driver.findElement(By.xpath("//input[@name='startingDate']")).sendKeys("07/03/2021");
	        driver.findElement(By.xpath("//input[@name='endingDate']")).sendKeys("07/05/2021");
	        driver.findElement(By.xpath("//option[@value='RED']")).click();
	        driver.findElement(By.xpath("//option[text()='YES']")).click();
	        driver.findElement(By.xpath("//option[@value='12']")).click();
	        driver.findElement(By.xpath("//input[@name='confirmationWEF']")).sendKeys("07/03/2021");
	        driver.findElement(By.xpath("//input[@name='confOrderNumber']")).sendKeys("JSHFSG");
	        driver.findElement(By.xpath("//input[@name='confOrderDate']")).sendKeys("07/03/2021");
	        WebElement funcDesignationAfterProbation = driver.findElement(By.xpath("//select[@name='funcDesignationAfterProbation']"));
		    Select funcDesignationAfterProbation1 = new Select(funcDesignationAfterProbation);
		    funcDesignationAfterProbation1.selectByIndex(9);
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@value='Update']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        driver.quit();
		}        
		//TESTCASE- LOGIN,HR,Employee- find employee- user - click -basic information - Transfer History- Inter	
		public void serviceBook() throws InterruptedException {
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
		    driver.findElement(By.xpath("//a[@href ='/humanres/control/viewServiceBook?partyId=8800112']")).click();
	        WebElement button1= driver.findElement(By.xpath("//a[contains(text(),'Click Here If Page is not Loaded')]"));
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
					driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
					Thread.sleep(5000);
					driver.close();
				}
			}
			driver.switchTo().window(parentWindowHandle);
			System.out.println("Parent window title is" +driver.getTitle());
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        driver.quit();
		
		}		
		//TESTCASE- LOGIN,HR,Employee- find employee- user - click -RE Designation	
		public void reDesignation() throws InterruptedException {
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
	        driver.findElement(By.xpath("//a[contains(text(),' Re Designation History')]")).click();
	        Thread.sleep(3000);		
	        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	        driver.findElement(By.xpath("//input[@name='preDispDesignation']")).sendKeys("not clear");
	        Thread.sleep(3000);
	        WebElement grade  = driver.findElement(By.xpath("//select[@name='grade']"));
	    	Select grade1 = new Select(grade);
	    	grade1.selectByVisibleText("CHIEF GENERAL MANAGER");
	    	WebElement newGenDesignation  = driver.findElement(By.xpath("//select[@name='newGenDesignation']"));
		    Select newGenDesignation1 = new Select(newGenDesignation);
		    newGenDesignation1.selectByVisibleText("GM/CGM");
		    WebElement newFuncDesignation  = driver.findElement(By.xpath("//select[@name='newFuncDesignation']"));
		    Select newFuncDesignation1 = new Select(newFuncDesignation);
		    newFuncDesignation1.selectByVisibleText("HR & ADMINISTRATION");
	        driver.findElement(By.xpath("//input[@name='newDispDesignation']")).sendKeys("none");
	        driver.findElement(By.xpath("//input[@name='officeOrderNum']")).sendKeys("86876");
	        driver.findElement(By.xpath("//input[@name='officeOrderDate']")).sendKeys("08/02/2021");
	        driver.findElement(By.xpath("//input[@name='effectiveFrom']")).sendKeys("10/02/2021");
	        driver.findElement(By.xpath("//input[@value='Save']")).click();
		    Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	        WebElement officerdate= driver.findElement(By.xpath("//input[@name='officeOrderDate']"));
	        officerdate.clear();
	        officerdate.sendKeys("08/02/2021");
	        WebElement  effectiveFrom=driver.findElement(By.xpath("//input[@name='effectiveFrom']"));
	        effectiveFrom.clear();
	        effectiveFrom.sendKeys("08/02/2021");
	        driver.findElement(By.xpath("//input[@value='Save']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        driver.quit();
		}
		//TESTCASE- LOGIN,HR,Employee- find employee- user - click -RE Designation	
				public void payRecord() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),' Pay Record Sheet')]")).click();
			        Thread.sleep(3000);		
			        driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
			        WebElement PayScale  = driver.findElement(By.xpath("//select[@name='PayScale']"));
			    	Select PayScale1 = new Select(PayScale);
			    	PayScale1.selectByVisibleText("12020-30060");
			    	driver.findElement(By.xpath("//input[@name='InitialFixPay']")).sendKeys("30000");
			    	driver.findElement(By.xpath("//input[@name='currentDaPer']")).sendKeys("3");
			    	driver.findElement(By.xpath("//input[@name='OfficeOrderNumber']")).sendKeys("78678");
			    	driver.findElement(By.xpath("//input[@name='OfficeOrderDate']")).sendKeys("08/02/2021");
			    	driver.findElement(By.xpath("//input[@name='SectionHeadApprover']")).sendKeys("pending");
			    	driver.findElement(By.xpath("//input[@value='Save']")).click();
				    Thread.sleep(3000);
			        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			       WebElement sectionapprover=  driver.findElement(By.xpath("//input[@name='SectionHeadApprover']"));
			       sectionapprover.clear();
			       sectionapprover.sendKeys("done");
			       driver.findElement(By.xpath("//input[@value='Update']")).click();
			       Thread.sleep(3000);		
			       driver.findElement(By.xpath("//a[contains(text(),'Pay Record History')]")).click();
			       driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			       WebElement sectionapprover1=  driver.findElement(By.xpath("//input[@name='SectionHeadApprover']"));
			       sectionapprover1.clear();
			       sectionapprover1.sendKeys("done");
			       driver.findElement(By.xpath("//input[@value='Update']")).click();
			        driver.findElement(By.xpath("//a[text()='Logout']")).click();
			        driver.quit();
			       
				}
				//TESTCASE- LOGIN,HR,Employee- find employee- user - click -securitySetting	
				public void securitySetting() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),' Basic Information and Security Settings')]")).click();
			        Thread.sleep(3000);		
			        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			        driver.findElement(By.xpath("//option[@value='Y']")).click();
			        driver.findElement(By.xpath("//input[@name='disabledDateTime_i18n']")).sendKeys("2021-08-02 12:12:00");
			        WebElement logins= driver.findElement(By.xpath("//input[@name='successiveFailedLogins']"));
			        logins.clear();
			        logins.sendKeys("1");
			        driver.findElement(By.xpath("//a[text()='Save ']")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//input[@name='currentPassword']")).sendKeys("ofbiz");
				    driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("ofbiz");
				    driver.findElement(By.xpath("//input[@name='newPasswordVerify']")).sendKeys("ofbiz");
				    driver.findElement(By.xpath("//a[text()='Save ']")).click();
//				    driver.findElement(By.xpath("//a[text()='Cancel/Done']")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Security Groups')]")).click();
				    WebElement groupId  = driver.findElement(By.xpath("//select[@name='groupId']"));
			    	Select groupId1 = new Select(groupId);
			    	groupId1.selectByVisibleText("Add_Qualification Add Qualification For Education Allowance");
			    	driver.findElement(By.xpath("//input[@name='fromDate_i18n']")).sendKeys("02/02/2021");
			    	driver.findElement(By.xpath("//input[@name='thruDate_i18n']")).sendKeys("08/02/2021");
			    	driver.findElement(By.xpath("//a[text()='submitButton']")).click();
			    	driver.findElement(By.xpath("//input[@value='Update']")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//a[text()='Remove']")).click();
				    driver.findElement(By.xpath("//a[text()='Logout']")).click();
			        driver.quit();
				}
				//TESTCASE- LOGIN,HR,Employee- find employee- user - click -securitySetting	- group
				public void securityGroup() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),' Basic Information and Security Settings')]")).click();
			        Thread.sleep(3000);	
			        driver.findElement(By.xpath("//a[contains(text(),'Security Groups')]")).click();
				    WebElement groupId  = driver.findElement(By.xpath("//select[@name='groupId']"));
			    	Select groupId1 = new Select(groupId);
			    	groupId1.selectByVisibleText("Add_Qualification Add Qualification For Education Allowance");
			    	driver.findElement(By.xpath("//input[@name='fromDate_i18n']")).sendKeys("02/02/2021");
			    	driver.findElement(By.xpath("//input[@name='thruDate_i18n']")).sendKeys("08/02/2021");
			    	driver.findElement(By.xpath("//a[text()='submitButton']")).click();
			    	driver.findElement(By.xpath("//input[@value='Update']")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//a[text()='Remove']")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[text()='Logout']")).click();
			        driver.quit();
				}
}