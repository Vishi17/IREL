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
		IrelLogin.Manuals();
          
		
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
    					
    					//common radio button
    					driver.findElement(By.xpath("//input[@id='COMMON']")).click();
    					
    					Thread.sleep(1000);
    					
    					//select drop down value
    					WebElement type = driver.findElement(By.xpath("//option[text()='Manuals']"));
    					Thread.sleep(5000);
    					type.click();
    					
    				    //view button 
    					String parentWindowHandle = driver.getWindowHandle();
     					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
     					
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
     					
    					
    					//co radio button
    					driver.findElement(By.xpath("//input[@id='CO']")).click();
    					//select drop down value
    					WebElement type1 = driver.findElement(By.xpath("//option[text()='Manuals']"));
    					Thread.sleep(5000);
    					type1.click();
    					
    				    //view button 
    					String parentWindowHandle1 = driver.getWindowHandle();
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
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
     					driver.switchTo().window(parentWindowHandle1);
     					System.out.println("Parent window title is" +driver.getTitle());
    					
    					// MK radio button
    					driver.findElement(By.xpath("//input[@id='MK']")).click();
    					WebElement type2 = driver.findElement(By.xpath("//option[text()='Manuals']"));
    					Thread.sleep(5000);
    					type2.click();
    					
    					//view button 
    					String parentWindowHandle2 = driver.getWindowHandle();
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					driver.switchTo().window(parentWindowHandle2);
     					Set<String> allWindows2=driver.getWindowHandles();
     					int count2=allWindows.size();
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
     					
    					//Red radio button
    					driver.findElement(By.xpath("//input[@id='RED']")).click();
    					WebElement type3 = driver.findElement(By.xpath("//option[text()='Manuals1']"));
    					Thread.sleep(5000);
    					type3.click();
    					
    					//view button 
    					String parentWindowHandle3 = driver.getWindowHandle();
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					driver.switchTo().window(parentWindowHandle3);
     					Set<String> allWindows3=driver.getWindowHandles();
     					int count3=allWindows.size();
     					System.out.println("Total window" +count3);
     					
     					for(String child:allWindows3)
     					{
     						if(!parentWindowHandle3.equalsIgnoreCase(child))
     						{
     							driver.switchTo().window(child);
     							
     							Thread.sleep(5000);
     							driver.close();
     						}
     					}
     					driver.switchTo().window(parentWindowHandle3);
     					System.out.println("Parent window title is" +driver.getTitle());

    					
    					//CHAVARA
     					driver.findElement(By.xpath("//input[@id='CHAVARA']")).click();
     					WebElement type4 = driver.findElement(By.xpath("//option[text()='Manuals']"));
    					Thread.sleep(5000);
    					type4.click();
    					
    					//view button 
    					String parentWindowHandle4 = driver.getWindowHandle();
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					driver.switchTo().window(parentWindowHandle4);
     					Set<String> allWindows4=driver.getWindowHandles();
     					int count4=allWindows.size();
     					System.out.println("Total window" +count4);
     					
     					for(String child:allWindows4)
     					{
     						if(!parentWindowHandle4.equalsIgnoreCase(child))
     						{
     							driver.switchTo().window(child);
     							
     							Thread.sleep(5000);
     							driver.close();
     						}
     					}
     					driver.switchTo().window(parentWindowHandle4);
     					System.out.println("Parent window title is" +driver.getTitle());

    					//REEP
    					driver.findElement(By.xpath("//input[@id='REEP']")).click();
     					WebElement type5 = driver.findElement(By.xpath("//option[text()='Manuals']"));
    					Thread.sleep(5000);
    					type5.click();
    					
    					//view button 
    					String parentWindowHandle5 = driver.getWindowHandle();
    					driver.findElement(By.xpath("(//a[text()='View'][1])")).click();
    					
    					driver.switchTo().window(parentWindowHandle5);
     					Set<String> allWindows5=driver.getWindowHandles();
     					int count5=allWindows.size();
     					System.out.println("Total window" +count5);
     					
     					for(String child:allWindows5)
     					{
     						if(!parentWindowHandle5.equalsIgnoreCase(child))
     						{
     							driver.switchTo().window(child);
     							
     							Thread.sleep(5000);
     							driver.close();
     						}
     					}
     					driver.switchTo().window(parentWindowHandle5);
     					System.out.println("Parent window title is" +driver.getTitle());
    					
    					//Back button
    					driver.findElement(By.xpath("//a[text()='Go Back']")).click();
    					
    					//Logout button
    					driver.findElement(By.xpath("//a[text()='Logout']")).click();
    					
    					driver.quit();
            		 
            		
                    }
}
