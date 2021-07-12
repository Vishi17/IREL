package master;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrainingPeriod {

	public static void main(String[] args) throws InterruptedException {
		
		TrainingPeriod login = new TrainingPeriod();
		login.login();
		login.trainingPeriod();
		login.tpCreate();
		login.tpFill();
		login.tpBack();
		login.tpErroralert();
		login.showEntries();
		login.edit();
		
	}
	//Testcase for Login - HR- master - main- logout
	  public void login() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
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
	  //TESTCASE LOGIN,HR,MASTER,TrainingPeriod,GoBack,HR-MAIN, LOGOUT
	  public void trainingPeriod() throws InterruptedException {
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
	  	//Master - Category
	  	driver.findElement(By.xpath("//a[contains(text(),'Training Period')]")).click();
	  	//Go back
	  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  	driver.quit();
	  } 
	//testcase-TrainingPeriod - create new-Yes- save-logout
	public void tpCreate() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Training Period')]")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='TrainingPeriodName']")).sendKeys("test");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='EnterTrainingPeriod']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("check ckejrh");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement type = driver.findElement(By.xpath("//option[text()='PERMANENT']"));
		//Thread.sleep(5000);
		type.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@id='Isapplicableforextension']")).click();
//		Thread.sleep(5000);
//		check.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='LOPLeaves']")).click();
		driver.findElement(By.xpath("//input[@id='LOPTrainTemp']")).sendKeys("leave");
		//choose file - Training Period is to be extended based on LOP leaves taken by employee
		WebElement button1 = driver.findElement(By.xpath("//input[@type='file']"));
	    button1.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
	    //choose file - Allow Reporting Manager/HR to extend  Training Period based on performance or due to other reasons.	
	    driver.findElement(By.xpath("//input[@id='PerformanceDue']")).click();
	    driver.findElement(By.xpath("//input[@id='PerformanceTrainTemp']")).sendKeys("fileperformance");
	    WebElement button2 = driver.findElement(By.xpath("//input[@name='empTrainingPerform']"));
	    button2.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
	    
	  //choose file -   suspension
	    driver.findElement(By.xpath("//input[@id='SuspensionDay']")).click();
	    driver.findElement(By.xpath("//input[@id='SuspensionTrainTemp']")).sendKeys("fileSuspension");
	    WebElement button3 = driver.findElement(By.xpath("//input[@name='empTrainingSuspens']"));
	    button3.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase-TrainingPeriod 
	public void tpFill() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Training Period')]")).click();
		
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='TrainingPeriodName']")).sendKeys("SUMMARY1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='EnterTrainingPeriod']")).sendKeys("17");
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Training");
		
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement type = driver.findElement(By.xpath("//option[text()='Workmen Trainee']"));
		type.click();
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		active.click();
		driver.findElement(By.xpath("//input[@id='Isapplicableforextension']")).click();
		//lop
		driver.findElement(By.xpath("//input[@id='LOPLeaves']")).click();
		driver.findElement(By.xpath("//input[@id='LOPTrainTemp']")).sendKeys("leave");
		WebElement button1 = driver.findElement(By.xpath("//input[@type='file']"));
	    button1.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
	    
	    // Training Period based on performance or due to other reasons.	
	    driver.findElement(By.xpath("//input[@id='PerformanceDue']")).click();
	    driver.findElement(By.xpath("//input[@id='PerformanceTrainTemp']")).sendKeys("fileperformance");
	    WebElement button2 = driver.findElement(By.xpath("//input[@name='empTrainingPerform']"));
	    button2.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
	    
	  //  suspension
	    driver.findElement(By.xpath("//input[@id='SuspensionDay']")).click();
	    driver.findElement(By.xpath("//input[@id='SuspensionTrainTemp']")).sendKeys("fileSuspension");
	    WebElement button3 = driver.findElement(By.xpath("//input[@name='empTrainingSuspens']"));
	    button3.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//Testcase - Create new -back to TrainingPeriod page - Go back to 
	public void tpBack() {
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
		driver.findElement(By.xpath("//a[contains(text(),'  Training Period')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		//Go Back 
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - handling error pop up
	public void tpErroralert() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Training Period')]")).click();
		//create New
				driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
				driver.findElement(By.xpath("//input[@name='TrainingPeriodName']")).sendKeys("SUMMARY1");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@name='EnterTrainingPeriod']")).sendKeys("17");
				driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Training");
				
				//TO SELECT VALUE INSIDE <OPTION>
				WebElement type = driver.findElement(By.xpath("//option[text()='Workmen Trainee']"));
				type.click();
				WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
				Thread.sleep(5000);
				active.click();
				driver.findElement(By.xpath("//input[@id='Isapplicableforextension']")).click();
				//lop
				driver.findElement(By.xpath("//input[@id='LOPLeaves']")).click();
				driver.findElement(By.xpath("//input[@id='LOPTrainTemp']")).sendKeys("leave");
				WebElement button1 = driver.findElement(By.xpath("//input[@type='file']"));
			    button1.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
			    
			    // Training Period based on performance or due to other reasons.	
			    driver.findElement(By.xpath("//input[@id='PerformanceDue']")).click();
			    driver.findElement(By.xpath("//input[@id='PerformanceTrainTemp']")).sendKeys("fileperformance");
			    WebElement button2 = driver.findElement(By.xpath("//input[@name='empTrainingPerform']"));
			    button2.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
			    
			  //  suspension
			    driver.findElement(By.xpath("//input[@id='SuspensionDay']")).click();
			    driver.findElement(By.xpath("//input[@id='SuspensionTrainTemp']")).sendKeys("fileSuspension");
			    WebElement button3 = driver.findElement(By.xpath("//input[@name='empTrainingSuspens']"));
			    button3.sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
			    
				driver.findElement(By.xpath("//input[@type='submit']")).click();
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
				driver.findElement(By.xpath("//a[contains(text(),'Training Period')]")).click();
				Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
				se.selectByValue("10");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type='search']")).sendKeys("SUMMARY1");
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			    driver.quit();
			}
			//Testcase for list of TrainingPeriod  master - Edit button
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
				driver.findElement(By.xpath("//a[contains(text(),'Training Period')]")).click();
				//edit button
				driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
				//driver.findElement(By.xpath("(//td[text()='Edit'][2])")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();
			}
			//Testcase - edit the data 
			public void editField() throws InterruptedException {
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
				driver.findElement(By.xpath("//a[contains(text(),' Training Period')]")).click();
				
				//edit button
				driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
				driver.findElement(By.xpath("//input[@name='ProbationPeriodName']")).sendKeys("IREL");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement period = driver.findElement(By.xpath("//input[@name='EnterProbationPeriod']"));
				period.clear();
				period.sendKeys("20");
				WebElement description = driver.findElement(By.xpath("//input[@name='description']"));
				description.clear();
				description.sendKeys("check IREL");
				
				//TO SELECT VALUE INSIDE <OPTION>
				WebElement type = driver.findElement(By.xpath("//option[text()='Fixed Term Appointee']"));
				type.click();
				WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
				Thread.sleep(5000);
				active.click();
				driver.findElement(By.xpath("//input[@id='Isapplicableforextension']")).click();
				
//				choose file - Training Period is to be extended based on LOP leaves taken by employee
				WebElement details1 = driver.findElement(By.xpath("//input[@name='LOPDetail']"));
				details1.clear();
				details1.sendKeys("leave Temp");
				String parentWindowHandle = driver.getWindowHandle();
				WebElement button1 = driver.findElement(By.xpath("//a[contains(text(),'View/Download File')]"));
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
						    
			    //choose file - Allow Reporting Manager/HR to extend  Training Period based on performance or due to other reasons.	
			    WebElement pf=driver.findElement(By.xpath("//input[@id='PerformanceTemp']"));
			    pf.clear();
			    pf.sendKeys("Performance temp");
			    String parentWindowHandle1 = driver.getWindowHandle();
				WebElement button2 = driver.findElement(By.xpath("//a[contains(text(),'View/Download File')]"));
				button2.click();
				driver.switchTo().window(parentWindowHandle1);
				Set<String> allWindows1=driver.getWindowHandles();
				int count1=allWindows.size();
				System.out.println("Total window" +count1);
				
				for(String child:allWindows1)
				{
					if(!parentWindowHandle1.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						
						Thread.sleep(5000);
						driver.close();
					}
				}
				driver.switchTo().window(parentWindowHandle);
				System.out.println("Parent window title is" +driver.getTitle());
		    
			    //choose file -  Training Period is to be extended for the number of days employee had been on suspension
			    WebElement sus=  driver.findElement(By.xpath("//input[@id='SuspensionTemp']"));
			    sus.clear();
			    sus.sendKeys("Suspension Temp");
			    String parentWindowHandle2 = driver.getWindowHandle();
			    WebElement button3 = driver.findElement(By.xpath("//a[contains(text(),'View/Download File')]"));
			    button3.click();
  
				Set<String> allWindows2=driver.getWindowHandles();
				int count2=allWindows2.size();
				System.out.println("Total window" +count2);
				
				for(String child:allWindows2)
				{
					if(!parentWindowHandle2.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						
						Thread.sleep(5000);
						driver.close();
					}
				}
				driver.switchTo().window(parentWindowHandle2);
				System.out.println("Parent window title is" +driver.getTitle());
				
				driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\clickandhold.png");
				driver.findElement(By.xpath("//input[@name='EmpPerformance']")).sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\Sec37AA-Date.png");
				driver.findElement(By.xpath("//input[@name='EmpSuspention']")).sendKeys("C:\\Users\\VISHAKHA SINGH\\Documents\\FProject\\upload file\\Sec37AA-DOLetter.png");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				driver.quit();	
			}
}
