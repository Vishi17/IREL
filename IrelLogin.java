package Login;

 import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrelLogin {

	public static void main(String[] args) throws InterruptedException   {
        //creating object
		IrelLogin login = new IrelLogin();
		login.irelLogin();
		IrelLogin.officeOrder();
		IrelLogin.officeOrder1();
		IrelLogin.notices();
		IrelLogin.notices1();
		IrelLogin.policies();
		IrelLogin.policies1();
		IrelLogin.caseStudies();
//		IrelLogin.Manuals();
          
		
	}

//	test case 1- login page
	public void irelLogin() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//enter url
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Find user name
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		
		//PASSWORD
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		
	    //Login Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 //IREL(India)limited link - not stable
		//driver.findElement(By.xpath("//a[contains(text(),'IREL (India) Limited -')]")).click();
				//a[contains {text(),'IREL (India) Limited -']}
		
		 //Language
		driver.findElement(By.xpath("//a[text()='Language : English']")).click();
		  
		//Cancel button in language page
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		
		//Applications
		driver.findElement(By.xpath("//h2[text()='Applications']")).click();
		
		//Human resource
		driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		
	//Logout button
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		 driver.quit();
		}
// testcase 2 - login - office order and logout 
	
	    public static void officeOrder() throws InterruptedException 
	   {
	    	
	     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			
			Thread.sleep(10000);
			
			//Find user name
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
			
			//PASSWORD
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
			
		    //Login Button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//OfficeOrder module
			driver.findElement(By.xpath("//a[text()='OFFICE ORDERS & CIRCULARS']")).click();
			
			//Applications
			driver.findElement(By.xpath("//h2[text()='Applications']")).click();
			
			//Human resource
			driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
			
			//Logout button
		    driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			//end
			driver.quit();
	    	
	    }
	     
//test case 3- office order - check radio button(common,co) - back button - logout
	    public static void officeOrder1() throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    	
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://115.124.105.99:6443/humanres/control/main");
			driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			Thread.sleep(7000);
			
			//Find user name
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
			
			//PASSWORD
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
			
			//Login Button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//OfficeOrder module
			driver.findElement(By.xpath("//a[text()='OFFICE ORDERS & CIRCULARS']")).click();
			
			//common radio button
			driver.findElement(By.xpath("//input[@type='radio' and @id='COMMON']")).click();
			
			Thread.sleep(1000);
			
			//select drop down value
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			//Select drpOfficeOrder = new Select(driver.findElement(By.id("partyContentList")));
			//drpOfficeOrder.selectByVisibleText("partyContentList");
			 
			//Select drpValue = new Select(driver.findElement(By.id(")))
			
			Thread.sleep(5000);
			
			//co radio button
			driver.findElement(By.xpath("//input[@type='radio' and @id='CO']")).click();
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			
			Thread.sleep(5000);
			
			// MK radio button
			driver.findElement(By.xpath("//input[@type='radio' and @id='MK']")).click();
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			
			//Red radio button
			driver.findElement(By.xpath("//input[@type='radio' and @id='RED']")).click();
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			
			//CHAVARA
			driver.findElement(By.xpath("//input[@type='radio' and @id='CHAVARA']")).click();
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			
			//REEP
			driver.findElement(By.xpath("//input[@type='radio' and @id='REEP']")).click();
			driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
			
			//Back button
			driver.findElement(By.xpath("//a[text()='Go Back']")).click();
			
			//Logout button
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			//end
			driver.quit();
    	
	    }
	    //testcase 4 - logoin -Notice module -logout
	    
	    public static void notices() throws InterruptedException 
		   {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://115.124.105.99:6443/humanres/control/main");
				driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
				
				Thread.sleep(10000);
				
				//Find user name
				driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
				
				//PASSWORD
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
				
				//Login Button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//NOTICE module
				driver.findElement(By.xpath("//a[text()='Notices']")).click();
				
				//Applications
				driver.findElement(By.xpath("//h2[text()='Applications']")).click();
				
				//Human resource
				driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
				
				//Logout button
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
				//end
				driver.quit();
		    	
		    }
		     //test case 5- login- Notice - back button - logout
		    public static void notices1() throws InterruptedException {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				
				driver.get("https://115.124.105.99:6443/humanres/control/main");
				driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
				
				Thread.sleep(7000);
				
				//Find user name
				driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
				
				//PASSWORD
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
				
				//Login Button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//OfficeOrder module
				driver.findElement(By.xpath("//a[text()='Notices']")).click();
				
				//common radio button
				driver.findElement(By.xpath("//input[@type='radio' and @id='COMMON']")).click();
				
				Thread.sleep(1000);
				
				//select drop down value
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				//Select drpOfficeOrder = new Select(driver.findElement(By.id("partyContentList")));
				//drpOfficeOrder.selectByVisibleText("partyContentList");
				 
				//Select drpValue = new Select(driver.findElement(By.id(")))
				
				//co radio button
				driver.findElement(By.xpath("//input[@type='radio' and @id='CO']")).click();
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				
				Thread.sleep(5000);
				
				// MK radio button
				driver.findElement(By.xpath("//input[@type='radio' and @id='MK']")).click();
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				
				//Red radio button
				driver.findElement(By.xpath("//input[@type='radio' and @id='RED']")).click();
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				
				//CHAVARA
				driver.findElement(By.xpath("//input[@type='radio' and @id='CHAVARA']")).click();
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				
				//REEP
				driver.findElement(By.xpath("//input[@type='radio' and @id='REEP']")).click();
				driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
				
				//Back button
				driver.findElement(By.xpath("//a[text()='Go Back']")).click();
				
				//Logout button
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
				//end
				driver.quit();
		    }
		    //Testcase 6 - login - policies- logout
		    public static void policies() throws InterruptedException 
			   {
			    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					WebDriver driver = new ChromeDriver(); 
					
					driver.get("https://115.124.105.99:6443/humanres/control/main");
					driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
					
					Thread.sleep(10000);
					
					//Find user name
					driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
					
					//PASSWORD
					driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
					
					//Login Button
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					
					//NOTICE module
					driver.findElement(By.xpath("//a[text()='Policies']")).click();
					
					//Applications
					driver.findElement(By.xpath("//h2[text()='Applications']")).click();
					
					//Human resource
					driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
					
					//Logout button
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					
					//end
					driver.quit();
			    	
			    }
			     //test case 5- login- Notice - back button - logout
			    public static void policies1() throws InterruptedException {
			    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					WebDriver driver = new ChromeDriver(); 
					
					driver.get("https://115.124.105.99:6443/humanres/control/main");
					driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
					
					Thread.sleep(5000);
					
					//Find user name
					driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
					
					//PASSWORD
					driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
					
					//Login Button
					driver.findElement(By.xpath("//input[@type='submit']")).click();
					
					//OfficeOrder module
					driver.findElement(By.xpath("//a[text()='Policies']")).click();
					
					//common radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='COMMON']")).click();
					
					Thread.sleep(1000);
					
					//select drop down value
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					//Select drpOfficeOrder = new Select(driver.findElement(By.id("partyContentList")));
					//drpOfficeOrder.selectByVisibleText("partyContentList");
					 
					//Select drpValue = new Select(driver.findElement(By.id(")))
					
					//co radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='CO']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					Thread.sleep(5000);
					
					// MK radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='MK']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//Red radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='RED']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//CHAVARA
					driver.findElement(By.xpath("//input[@type='radio' and @id='CHAVARA']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//REEP
					driver.findElement(By.xpath("//input[@type='radio' and @id='REEP']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//Back button
					driver.findElement(By.xpath("//a[text()='Go Back']")).click();
					
					//Logout button
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					
					//end
					driver.quit();
					}
			    
                public static void caseStudies() throws InterruptedException {
                	
                System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        		WebDriver driver = new ChromeDriver(); 
        		
        		//enter url
        		driver.get("https://115.124.105.99:6443/humanres/control/main");
        		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
        		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
        		
        		Thread.sleep(5000);
        		
        		//Find user name
        		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
        		
        		
        		//PASSWORD
        		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
        		
        	    //Login Button
        		driver.findElement(By.xpath("//input[@type='submit']")).click();
        		 Thread.sleep(5000);
        		 
        		//OfficeOrder module
					driver.findElement(By.xpath("//a[text()='Case Studies']")).click();
					
					//common radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='COMMON']")).click();
					
					Thread.sleep(1000);
					
					//select drop down value
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					//Select drpOfficeOrder = new Select(driver.findElement(By.id("partyContentList")));
					//drpOfficeOrder.selectByVisibleText("partyContentList");
					 
					//Select drpValue = new Select(driver.findElement(By.id(")))
					
					//co radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='CO']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					Thread.sleep(5000);
					
					// MK radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='MK']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//Red radio button
					driver.findElement(By.xpath("//input[@type='radio' and @id='RED']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//CHAVARA
					driver.findElement(By.xpath("//input[@type='radio' and @id='CHAVARA']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//REEP
					driver.findElement(By.xpath("//input[@type='radio' and @id='REEP']")).click();
					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
					
					//Back button
					driver.findElement(By.xpath("//a[text()='Go Back']")).click();
					
					//Logout button
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					
					driver.quit();
        		 
        		
                }
                
                public static void Manuals() throws InterruptedException {
                	
                    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
            		WebDriver driver = new ChromeDriver(); 
            		
            		//enter url
            		driver.get("https://115.124.105.99:6443/humanres/control/main");
            		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
            		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
            		
            		Thread.sleep(5000);
            		
            		//Find user name
            		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
            		
            		
            		//PASSWORD
            		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
            		
            	    //Login Button
            		driver.findElement(By.xpath("//input[@type='submit']")).click();
            		 Thread.sleep(5000);
            		 
            		//OfficeOrder module
    					driver.findElement(By.xpath("//a[text()='Manuals']")).click();
    					
    					//common radio button
    					driver.findElement(By.xpath("//input[@type='radio' and @id='COMMON']")).click();
    					
    					Thread.sleep(1000);
    					
    					//select drop down value
    					WebElement type= driver.findElement(By.xpath("//option[text()='Manuals]"));
    					type.click();
//    					WebElement manuals= driver.findElement(By.xpath("//input[@id='partyContentTypeId']"));
//    					manuals.click();
//    					manuals.sendKeys("Manuals");
    				    //view button 
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					//co radio button
    					driver.findElement(By.xpath("//input[@type='radio' and @id='CO']")).click();
    					//select drop down value
    					WebElement manuals1= driver.findElement(By.xpath("//option[@value='Manuals']"));
    					Thread.sleep(5000);
    					manuals1.click();
    				    //view button 
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					Thread.sleep(5000);
    					
    					// MK radio button
//    					driver.findElement(By.xpath("//input[@type='radio' and @id='MK']")).click();
//    					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
    					
    					//Red radio button
//    					driver.findElement(By.xpath("//input[@type='radio' and @id='RED']")).click();
//    					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
    					
    					//CHAVARA
//    					driver.findElement(By.xpath("//input[@type='radio' and @id='CHAVARA']")).click();
//    					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
    					
    					//REEP
//    					driver.findElement(By.xpath("//input[@type='radio' and @id='REEP']")).click();
//    					driver.findElement(By.xpath("//select[@id='partyContentTypeId']")).click();
    					
    					//Back button
    					driver.findElement(By.xpath("//a[text()='Go Back']")).click();
    					
    					//Logout button
    					driver.findElement(By.xpath("//a[text()='Logout']")).click();
    					
    					driver.quit();
            		 
            		
                    }
}