package loanadvance;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loanApp {
	public static void main(String[] args) throws InterruptedException {
		loanApp login = new loanApp();
		login.loanAppCreate();

	}
	//TESTCASE LOGIN,HR,MASTER,CATEGORY,GoBack,HR-MAIN, LOGOUT
	public void loanAppCreate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
	    driver.findElement(By.xpath("//a[@href='/humanres/control/LoanAndAdvance']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='https://115.124.105.99:6443/humanres/control/LoanAdvance']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Loan Criteria')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@class='close']")).click();
	    WebElement type= driver.findElement(By.xpath("//select[@id='subType']"));
	    Select type1= new Select(type);
	    type1.selectByVisibleText("1HBA");
	    Thread.sleep(3000);
	    driver.findElement(By.className("numberOfMonthsToRefund")).sendKeys("4");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='placeOfProperty']")).sendKeys("M.G");
	    WebElement loan= driver.findElement(By.xpath("//select[@name='SecuredOrUnsecured']"));
	    Select loan1 = new Select(loan);
	    loan1.selectByVisibleText("Secured");
	    driver.findElement(By.xpath("//input[@name='reqAmount']")).sendKeys("1000");
	    driver.findElement(By.xpath("//input[@name='isWifeOrHusbandEmployeeOfIrel' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='wifeOrMinorchildHaveOwnHouse' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='requireAdvanceForNewHouse' and @value='Y']")).click();
	    driver.findElement(By.id("aprxfloorAreaInSqFt")).sendKeys("1500");
	    driver.findElement(By.id("estmdCostOfLand")).sendKeys("150000");
	    driver.findElement(By.id("estmdCostOfBuilding")).sendKeys("1500000");
	    driver.findElement(By.id("totalEstmdCost")).sendKeys("2300000");
	    driver.findElement(By.id("amountOfAdvanceReq")).sendKeys("1500000");
	    driver.findElement(By.id("noOfYrsToRepayAdvance")).sendKeys("15");
	    driver.findElement(By.xpath("//input[@name='possesionLandForNewHouse' and @value='Y']")).click();
	    driver.findElement(By.id("locationCityOrTown")).sendKeys("M.G");
	    driver.findElement(By.name("pocessionAprxFloorAreaInSqft")).sendKeys("1800");
	    driver.findElement(By.id("nameOfMuncipalCorp")).sendKeys("M.G Municipal");
	    driver.findElement(By.xpath("//input[@name='wheatherSettingTherePostRetirerment' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='advanceForAccomExistHouse' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='advanceForPurchaceReadyBuiltHouse' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='houseStandsLeaseHold' and @value='N']")).click();
	    driver.findElement(By.xpath("//input[@name='isLoanTakenFromOutsideInstitution' and @value='Y']")).click();
	    driver.findElement(By.name("institutionName")).sendKeys("SBI");
	    driver.findElement(By.name("loanAmountFromOutsideInstitution")).sendKeys("1000000");
	    driver.findElement(By.name("aprxBudget")).sendKeys("1000000");
	    driver.findElement(By.name("advanceaReqForAquire")).sendKeys("500000");
	    driver.findElement(By.name("noYrsReqToRepayAdvanceAquire")).sendKeys("7");
	    driver.findElement(By.name("gratuityPaybleAmount")).sendKeys("700000");
	    driver.findElement(By.xpath("//input[@name='titleToLandEncumbrances' and @value='Y']")).click();
	    driver.findElement(By.xpath("//input[@name='furnishInSupportOfClaim' and @value='Y']")).click();
	    driver.findElement(By.name("surityName")).sendKeys("Raghav Rao");
	    driver.findElement(By.name("surityEmpCode")).sendKeys("987654");
	    driver.findElement(By.name("surityDesg")).sendKeys("Manager");
	    driver.findElement(By.name("presentSalary")).sendKeys("200000");
	    driver.findElement(By.name("dateOfSuperAnnuation")).sendKeys("08/02/2021");
	    //Upload document
	    WebElement landdoc = driver.findElement(By.xpath("//input[@type='file' and @name='LandDoc']"));
	    landdoc.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-1.png");
	
	    WebElement nonencub = driver.findElement(By.xpath("//input[@type='file' and @name='NonEncumbrance']"));
	    Thread.sleep(3000);
	    nonencub.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-2.png");

	    WebElement appHouse = driver.findElement(By.xpath("//input[@type='file' and @name='HousePlan']"));
	    appHouse.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Final.png");
	
	    WebElement Payslip = driver.findElement(By.xpath("//input[@type='file' and @name='Payslip']"));
	    Payslip.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-1.png");
	  
	    WebElement TitleDeed = driver.findElement(By.xpath("//input[@type='file' and @name='TitleDeed']"));
	    TitleDeed.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-2.png");
	
	    WebElement UpdateNonEncubrance = driver.findElement(By.xpath("//input[@type='file' and @name='UpdateNonEncubrance']"));
	    UpdateNonEncubrance.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Final.png");
	 
	    WebElement CostEstimation = driver.findElement(By.xpath("//input[@type='file' and @name='CostEstimation']"));
	    CostEstimation.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-1.png");
	    driver.findElement(By.xpath("//button[@value='Add Row']")).click();
	    driver.findElement(By.xpath("//button[@value='Delete Row']")).click();
	    driver.findElement(By.name("declarationName")).sendKeys("Raghav Rao");
	    driver.findElement(By.xpath("//input[@name='agreeAndAccept' and @value='accepted']")).click();
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	    WebElement landdoc1 = driver.findElement(By.xpath("//a[text()='View']"));
		String parentWindowHandle = driver.getWindowHandle();
		landdoc1.click();
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Remove']")).click();
	    // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();				
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(3000);		
        // Accepting alert		
        alert.accept();
//        Thread.sleep(7000);
        driver.navigate().refresh();
	    WebElement landdocUp = driver.findElement(By.xpath("//input[@type='file' and @name='LandDoc']"));
	    landdocUp.sendKeys("C:\\Users\\VISHAKHA SINGH\\Desktop\\Course\\Effective Comm-1.png");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    driver.findElement(By.xpath("//input[@id='jGrowl']")).click();
	    driver.findElement(By.xpath("//input[@value='Cancel']")).click();
	    driver.findElement(By.xpath("//input[@value='Print']")).click();
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	 // Switching to Alert        
        Alert delete = driver.switchTo().alert();		
        // Capturing alert message.    
        String deleteMessage= driver.switchTo().alert().getText();				
        // Displaying alert message		
        System.out.println(deleteMessage);	
        Thread.sleep(3000);		
        // Accepting alert		
        delete.accept();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	    
	}

}
