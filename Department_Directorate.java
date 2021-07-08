package department;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Department_Directorate {

	public static void main(String[] args) throws InterruptedException {
		Department_Directorate login = new Department_Directorate();
		login.master();
		login.depart();
		login.deprtDirectorate();
		login.createNew();
		login.cancel();
		login.backTo();
		login.errorAlert();
		login.showEntries();
		login.edit();
		login.editField();
	}
//testcase for Login - master - department
	public void master() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		Thread.sleep(1000);
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
	//TESTCASE LOGIN,HR,MASTER,department,GoBack,HR-MAIN, LOGOUT
	public void depart() throws InterruptedException {
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
		//Master - 
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		//Go back
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//testcase departmentdirectorate-Yes- save-logout
	public void deprtDirectorate() throws InterruptedException {
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
		//Master - department and departmentdirec
		 driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		 driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		//Go back
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase-create new-Yes- save-logout
	public void createNew() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='directretDeptName']")).sendKeys("TEST");
		driver.findElement(By.xpath("//input[@name='directretDeptCode']")).sendKeys("07");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		option.click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//testcase- create new-No- cancel-logout
	public void cancel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
	    driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		//create New
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='directretDeptName']")).sendKeys("TEST");
		driver.findElement(By.xpath("//input[@name='directretDeptCode']")).sendKeys("07");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='N']"));
		Thread.sleep(5000);
		option.click();
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  driver.quit();
	}
	//Testcase - Create new -back to departmentdirectorate page - Go back to 
	public void backTo() {
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
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		//Go Back 
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
	//Testcase - handling error pop up
	public void errorAlert() throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@name='directretDeptName']")).sendKeys("TEST");
		driver.findElement(By.xpath("//input[@name='directretDeptCode']")).sendKeys("07");
		//TO SELECT VALUE INSIDE <OPTION>
		WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
		Thread.sleep(5000);
		option.click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Alert message -close
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
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
		se.selectByValue("25");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("TEST");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
	}
	//Testcase for list of dd master - Edit button
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
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
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
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Department')]")).click();
		driver.findElement(By.xpath("//a[text()='Department Directorate']")).click();
		//edit button
		driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
		WebElement dn = driver.findElement(By.xpath("//input[@name='directretDeptName']"));
		dn.clear();
		dn.sendKeys("test");
		//Thread.sleep(5000);
		WebElement dc = driver.findElement(By.xpath("//input[@name ='directretDeptCode']"));
		dc.clear();
		dc.sendKeys("11");
		WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
		active.click();
		active.sendKeys("N");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();	
	}
}

