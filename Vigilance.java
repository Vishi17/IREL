package vigilance;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vigilance {
	public static void main(String[] args) throws InterruptedException
	{
		Vigilance login = new Vigilance();	
	//	login.nocPassport();
	//	login.nocForApp();
		login.foreignVisit();
	}
//TestCase - vigilance -NOC 
	public void nocPassport() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
//		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
	    driver.findElement(By.xpath("//a[text()=' Vigilance']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[text()='NOC (Passport/Forwarding/Foreign Trips)']")).click();
	    driver.findElement(By.xpath("//a[@href='/humanres/control/OtherServiceMenu']")).click();
	    driver.findElement(By.xpath("//a[@href='PassPortCreationForm']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='nocReqDate']")).sendKeys("08/12/2021");	
	    driver.findElement(By.xpath("//input[@name='lastDateNOC']")).sendKeys("08/20/2021");
	    driver.findElement(By.xpath("//input[@name='ePFBalance']")).sendKeys("3000");
	    driver.findElement(By.xpath("//input[@name='cName']")).sendKeys("India");
	    driver.findElement(By.xpath("//textarea[@name='resAdd']")).sendKeys("India");
	    driver.findElement(By.xpath("//textarea[@name='permanentAdd']")).sendKeys("India");
	    driver.findElement(By.xpath("//textarea[@name='purposeOfV']")).sendKeys("holiday");
	    //leave Balance Details
	    driver.findElement(By.xpath("//input[@name='leaveEL']")).sendKeys("51");
	    driver.findElement(By.xpath("//input[@name='leaveSL']")).sendKeys("30");
	    driver.findElement(By.xpath("//input[@name='leaveHPL']")).sendKeys("30");
	    //Loan Repayment Details
	    driver.findElement(By.xpath("//input[@name='balanceHBA1']")).sendKeys("3");
	    driver.findElement(By.xpath("//input[@name='balanceHBA2']")).sendKeys("5");
	    driver.findElement(By.xpath("//input[@name='balanceHBArepair']")).sendKeys("6");
	    driver.findElement(By.xpath("//input[@name='balanceHBAenlarge']")).sendKeys("10");
	    driver.findElement(By.xpath("//input[@name='balanceHBAadd']")).sendKeys("11");
	    driver.findElement(By.xpath("//input[@name='balanceHPA2Wheel']")).sendKeys("1");
	    driver.findElement(By.xpath("//input[@name='balanceHPACar']")).sendKeys("0");
	    driver.findElement(By.xpath("//input[@name='balanceHPAComputer']")).sendKeys("1");
	    driver.findElement(By.xpath("//input[@name='balanceHPAOthers']")).sendKeys("1");
	    driver.findElement(By.xpath("//input[@name='balanceEducation']")).sendKeys("5000");
	    driver.findElement(By.xpath("//input[@name='balanceFestival']")).sendKeys("14");
	    driver.findElement(By.xpath("//input[@name='balanceOther']")).sendKeys("14");
	    WebElement duly1= driver.findElement(By.xpath("//input[@name='vig_otherService']"));
	    duly1.sendKeys("C:\\Users\\VISHAKHA SINGH\\Downloads\\_.__ State Common Entrance Test Cell, Government of Maharashtra __._.pdf");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
//	    driver.findElement(By.xpath("//input[@value='Cancel']")).click();\
	    driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	    
	}
	//TestCase - vigilance -NOC Application
		public void nocForApp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
//			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
			driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		    driver.findElement(By.xpath("//a[text()=' Vigilance']")).click();
		    driver.findElement(By.xpath("//*[text()='NOC (Passport/Forwarding/Foreign Trips)']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[@href='/humanres/control/OtherServiceMenu']")).click();
		    driver.findElement(By.xpath("//a[@href='PassPortCreationForm1']")).click();
		    driver.findElement(By.xpath("//input[@name='dateOfJoinGrade']")).sendKeys("08/12/2021");	
		    driver.findElement(By.xpath("//input[@name='postApplied']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@name='organization']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@name='payScaleOffered']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@name='qualification']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@name='experience']")).sendKeys("none");
		    driver.findElement(By.xpath("//input[@name='nocReqDate']")).sendKeys("08/12/2021");
		    WebElement duly1= driver.findElement(By.xpath("//input[@name='vig_otherService']"));
		    duly1.sendKeys("C:\\Users\\VISHAKHA SINGH\\Downloads\\_.__ State Common Entrance Test Cell, Government of Maharashtra __._.pdf");
		    driver.findElement(By.xpath("//input[@name='lastDateNOC']")).sendKeys("08/15/2021");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
}
//TestCase - vigilance -NOC Foreignvisit
	public void foreignVisit() throws InterruptedException {
						System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						WebDriver driver = new ChromeDriver(); 
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.get("https://115.124.105.99:6443/humanres/control/main");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
	//					driver.manage().window().maximize();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
						driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
						driver.findElement(By.xpath("//input[@type='submit']")).click(); 
					    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					    driver.findElement(By.xpath("//a[text()=' Vigilance']")).click();
					    driver.findElement(By.xpath("//*[text()='NOC (Passport/Forwarding/Foreign Trips)']")).click();
					    Thread.sleep(5000);
					    driver.findElement(By.xpath("//a[@href='/humanres/control/OtherServiceMenu']")).click();
					    driver.findElement(By.xpath("//a[@href='PassPortCreationForm2']")).click();
					    driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("8754678678");
					    driver.findElement(By.xpath("//input[@name='passport']")).sendKeys("PASS34567");
					    driver.findElement(By.xpath("//input[@name='finance']")).sendKeys("company");
					    driver.findElement(By.xpath("//input[@name='periodFrom']")).sendKeys("11/12/2019");
					    Thread.sleep(1000);
					    //Period to not stable
					    driver.findElement(By.xpath("//input[@name='periodTo']")).sendKeys("12/30/2019");
					    Thread.sleep(1000);
					    driver.findElement(By.xpath("//input[@name='nocReqDate']")).sendKeys("15/12/2019");
					    driver.findElement(By.xpath("//input[@name='lastDateNOC']")).sendKeys("02/02/2020");
					    driver.findElement(By.xpath("//input[@name='ePFBalance']")).sendKeys("5000");
					    driver.findElement(By.xpath("//select[@value='Official Tour']")).click();
					    driver.findElement(By.xpath("//textarea[@name='resAdd']")).sendKeys("India");
					    driver.findElement(By.xpath("//textarea[@name='permanentAdd']")).sendKeys("India");
					    driver.findElement(By.xpath("//textarea[@name='countryV']")).sendKeys("USA");
					    driver.findElement(By.xpath("//textarea[@name='personV']")).sendKeys("NONE");
					    driver.findElement(By.xpath("//textarea[@name='personV']")).sendKeys("company stay");
					    driver.findElement(By.xpath("//textarea[@name='expenditure']")).sendKeys("12345");
					  //leave Balance Details
					    driver.findElement(By.xpath("//input[@name='leaveEL']")).sendKeys("51");
					    driver.findElement(By.xpath("//input[@name='leaveSL']")).sendKeys("30");
					    driver.findElement(By.xpath("//input[@name='leaveHPL']")).sendKeys("30");
					    driver.findElement(By.xpath("//input[@name='balanceHBA1']")).sendKeys("3");
					    driver.findElement(By.xpath("//input[@name='balanceHBA2']")).sendKeys("5");
					    driver.findElement(By.xpath("//input[@name='balanceHBArepair']")).sendKeys("6");
					    driver.findElement(By.xpath("//input[@name='balanceHBAenlarge']")).sendKeys("10");
					    driver.findElement(By.xpath("//input[@name='balanceHBAadd']")).sendKeys("11");
					    driver.findElement(By.xpath("//input[@name='balanceHPA2Wheel']")).sendKeys("1");
					    driver.findElement(By.xpath("//input[@name='balanceHPACar']")).sendKeys("0");
					    driver.findElement(By.xpath("//input[@name='balanceHPAComputer']")).sendKeys("1");
					    driver.findElement(By.xpath("//input[@name='balanceHPAOthers']")).sendKeys("1");
					    driver.findElement(By.xpath("//input[@name='balanceEducation']")).sendKeys("5000");
					    driver.findElement(By.xpath("//input[@name='balanceFestival']")).sendKeys("14");
					    driver.findElement(By.xpath("//input[@name='balanceOther']")).sendKeys("14");
					    WebElement passport= driver.findElement(By.xpath("//input[@name='vig_otherService']"));
					    passport.sendKeys("C:\\Users\\VISHAKHA SINGH\\Downloads\\_.__ State Common Entrance Test Cell, Government of Maharashtra __._.pdf");
					    WebElement visa= driver.findElement(By.xpath("//input[@name='vig_otherServicefor']"));
					    visa.sendKeys("C:\\Users\\VISHAKHA SINGH\\Downloads\\_.__ State Common Entrance Test Cell, Government of Maharashtra __._.pdf");
					    driver.findElement(By.xpath("//textarea[@name='previousTravel']")).sendKeys("none");
					    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
					    driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}
