package employees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicInformationII {

	public static void main(String[] args) throws InterruptedException {
		BasicInformationII login = new BasicInformationII();
		login.trainingDev();
		login.trainingDevEdit();
		login.trainingDevDelete();
		login.trainingDevExt();
		login.achievment();
		login.achievmentEdit();
		login.achievmentDelete();
		login.assetDetails();
		login.assetDetailsEdit();
		login.assetDetailsDelete();

	}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Training development	
	public void trainingDev() throws InterruptedException {
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
        driver.findElement(By.xpath("//a[contains(text(),'Training and Development')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Internal Training')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),' Create New')]")).click();
        driver.findElement(By.xpath("//input[@name='TrainingTitle']")).sendKeys("Training");
        driver.findElement(By.xpath("//input[@name='TrainingDescription']")).sendKeys("Training1");
        driver.findElement(By.xpath("//input[@id='FromDate']")).sendKeys("01/02/2021");
        driver.findElement(By.xpath("//input[@id='ToDate']")).sendKeys("01/02/2021");
        driver.findElement(By.xpath("//input[@name='venu']")).sendKeys("Venue12");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        driver.findElement(By.xpath("//input[@type='reset']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
        }
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Training development	-edit
		public void trainingDevEdit() throws InterruptedException {
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
	        driver.findElement(By.xpath("//a[contains(text(),'Training and Development')]")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Internal Training')]")).click();
	        driver.findElement(By.xpath("//li[@class='collapsed']")).click();
	        driver.findElement(By.xpath("//li[@class='expanded']")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	        WebElement tt=driver.findElement(By.xpath("//input[@name='TrainingTitle']"));
	        tt.clear();
	        tt.sendKeys("TrainingAgain");
	        WebElement tdescription=driver.findElement(By.xpath("//input[@name='TrainingDescription']"));
	        tdescription.clear();
	        tdescription.sendKeys("TrainingAgain");
	        WebElement fromdate=driver.findElement(By.xpath("//input[@id='FromDate']"));
	        fromdate.clear();
	        fromdate.sendKeys("01/02/2021");
	        WebElement todate=driver.findElement(By.xpath("//input[@id='ToDate']"));
	        todate.clear();
	        todate.sendKeys("01/02/2021");
	        WebElement venue=driver.findElement(By.xpath("//input[@name='venu']"));
	        venue.clear();
	        venue.sendKeys("Venue12");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			driver.quit();
}
		//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Training development	-delete
				public void trainingDevDelete() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),'Training and Development')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Internal Training')]")).click();
			        driver.findElement(By.xpath("//li[@class='collapsed']")).click();
			        driver.findElement(By.xpath("//li[@class='expanded']")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
}
				//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Training development-external	
				public void trainingDevExt() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),'Training and Development')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'External Training')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),' Create New')]")).click();
			        driver.findElement(By.xpath("//input[@name='trainingTitle']")).sendKeys("Training");
			        driver.findElement(By.xpath("//input[@name='location']")).sendKeys("venue");
			        driver.findElement(By.xpath("//input[@name='trainingStartDate']")).sendKeys("01/02/2021");
			        driver.findElement(By.xpath("//input[@name='trainingEndDate']")).sendKeys("01302021");
			        driver.findElement(By.xpath("//input[@id='DepartureDate']")).sendKeys("01/31/2021");
			        driver.findElement(By.xpath("//input[@name='departureTime']")).sendKeys("1010AM");
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("//input[@name='returnDate']")).sendKeys("01/02/2021");
			        driver.findElement(By.xpath("//input[@name='returnTime']")).sendKeys("1010PM");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@name='trainingCost']")).sendKeys("400");
			        driver.findElement(By.xpath("//input[@name='duration']")).click();
			        driver.findElement(By.xpath("//input[@type='submit']")).click();
//			        driver.findElement(By.xpath("//input[@type='reset']")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
			        
				}
	//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Achievment	
				public void achievment() throws InterruptedException {
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
			        driver.findElement(By.xpath("//a[contains(text(),' Achievements and Awards')]")).click();
			        driver.findElement(By.xpath("//input[@name='dateOfAwardAndAchievement']")).sendKeys("01/02/2021");
			        driver.findElement(By.xpath("//input[@name='typeOfAward']")).sendKeys("Achievments");
			        driver.findElement(By.xpath("//input[@name='awardDetailsAndAchievementCertificateNumber']")).sendKeys("Aug Achievments");
			        driver.findElement(By.xpath("//input[@name='details']")).sendKeys("August Achievments");
			        driver.findElement(By.xpath("//input[@name='remark']")).sendKeys("August Achievments 12");
			        driver.findElement(By.xpath("//input[@type='submit']")).click();
//			        driver.findElement(By.xpath("//input[@type='reset']")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
			        
				}
				//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Achievment	-edit
				public void achievmentEdit() throws InterruptedException {
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
				    driver.findElement(By.xpath("//a[contains(text(),' Achievements and Awards')]")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			        WebElement date= driver.findElement(By.xpath("//input[@name='dateOfAwardAndAchievement']"));
			        date.clear();
			        date.sendKeys("02/02/2021");
			        WebElement type=driver.findElement(By.xpath("//input[@name='typeOfAward']"));
			        type.clear();
			        type.sendKeys("Achievments");
			        WebElement detailsA=driver.findElement(By.xpath("//input[@name='awardDetailsAndAchievementCertificateNumber']"));
			        detailsA.clear();
			        detailsA.sendKeys("Aug Achievments");
			        WebElement details = driver.findElement(By.xpath("//input[@name='details']"));
			        details.clear();
			        details.sendKeys("August Achievments");
			        WebElement remark =driver.findElement(By.xpath("//input[@name='remark']"));
			        remark.clear();
			        remark.sendKeys("August Achievments 12");
			        driver.findElement(By.xpath("//input[@type='submit']")).click();
			        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					driver.quit();
		}
				//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Achievment-delete
						public void achievmentDelete() throws InterruptedException {
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
					        driver.findElement(By.xpath("//a[contains(text(),'Achievements and Awards')]")).click();
					        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
							driver.findElement(By.xpath("//a[text()='Logout']")).click();
							driver.quit();
		}
						//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Asset	
						public void assetDetails() throws InterruptedException {
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
					        driver.findElement(By.xpath("//a[contains(text(),'Asset Details')]")).click();
					        driver.findElement(By.xpath("//input[@name='assetCategory']")).sendKeys("asset");
					        driver.findElement(By.xpath("//input[@name='assetName']")).sendKeys("Aug Asset");
					        driver.findElement(By.xpath("//input[@name='assetItemType']")).sendKeys("August Asset");
					        WebElement status = driver.findElement(By.xpath("//option[text()='Available']"));
							Thread.sleep(3000);
							status.click();
					        driver.findElement(By.xpath("//input[@type='submit']")).click();
//					        driver.findElement(By.xpath("//input[@type='reset']")).click();
					        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
					        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
							driver.findElement(By.xpath("//a[text()='Logout']")).click();
							driver.quit();
					        
						}
						//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Asset	-edit
						public void assetDetailsEdit() throws InterruptedException {
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
						    driver.findElement(By.xpath("//a[contains(text(),' Asset Details')]")).click();
						    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
					       WebElement asset= driver.findElement(By.xpath("//input[@name='assetCategory']"));
					       asset.clear();
					       asset.sendKeys("New asset");
					       WebElement assetN=driver.findElement(By.xpath("//input[@name='assetName']"));
					       assetN.clear();
					       assetN.sendKeys("Aug Asset");
					       WebElement assetType=driver.findElement(By.xpath("//input[@name='assetItemType']"));
					       assetType.clear();
					       assetType.sendKeys("August Asset");
					        WebElement status = driver.findElement(By.xpath("//option[text()='Assigned']"));
							Thread.sleep(3000);
							status.click();
					        driver.findElement(By.xpath("//input[@type='submit']")).click();
					        driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
							driver.findElement(By.xpath("//a[text()='Logout']")).click();
							driver.quit();
				}
//TESTCASE- LOGIN,HR,Employee- find employee- user - click - user page-Asset-delete
								public void assetDetailsDelete() throws InterruptedException {
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
							        driver.findElement(By.xpath("//a[contains(text(),'Asset Details')]")).click();
							        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();					        
									driver.findElement(By.xpath("//a[text()='Logout']")).click();
									driver.quit();
				}

}
