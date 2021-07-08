package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.*;
	

public class HumanResource  {
	
public static void main(String[] args) throws InterruptedException   {
    //creating object
	HumanResource login = new HumanResource();
	login.hr();
	login.master();
	login.category();
	login.category1();
	login.category2();
	login.category3();
	login.errorAlert();
	login.showEntries();
	login.edit();
	login.editField();
}
//TESTCASE LOGIN, HR, LANGUAGE,CANCEL,LOGOUT
public void hr () {
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
	//IREL(India)limited link - not stable
	//driver.findElement(By.xpath("//a[contains(text(),'IREL (India) Limited -')]")).click();
	//a[contains {text(),'IREL (India) Limited -']}
	driver.findElement(By.xpath("//a[text()='Language : English']")).click();
	driver.findElement(By.xpath("//a[text()='Cancel']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	driver.quit();	
}

//TESTCASE LOGIN,HR,MASTER,LANGAUGE,LOGOUT
public void master() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://115.124.105.99:6443/humanres/control/main");
		driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
		//Find user name
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
		//PASSWORD
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
	    //Login Button
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		//Human resource
	    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		
	    //Human Resource - list - Master
	    driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
		driver.findElement(By.xpath("//a[text()='Language : English']")).click();
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Main')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
}

//TESTCASE LOGIN,HR,MASTER,CATEGORY,GoBack,HR-MAIN, LOGOUT
public void category() throws InterruptedException {
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	//Go back
	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.quit();
}
//testcase-category - create new-Yes- save-logout
public void category1() throws InterruptedException {
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	driver.findElement(By.xpath("//input[@name='TypeCategoryName']")).sendKeys("N101");
	driver.findElement(By.xpath("//input[@name='CategoryUniqueId']")).sendKeys("11102");
	driver.findElement(By.xpath("//input[@name='description']")).sendKeys("text");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TO SELECT VALUE INSIDE <OPTION>
	WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
	Thread.sleep(5000);
	option.click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    driver.quit();
}
//testcase-category - create new-No- cancel-logout
public void category2() throws InterruptedException {
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	driver.findElement(By.xpath("//input[@name='TypeCategoryName']")).sendKeys("N1013");
	driver.findElement(By.xpath("//input[@name='CategoryUniqueId']")).sendKeys("111023");
	driver.findElement(By.xpath("//input[@name='description']")).sendKeys("text");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TO SELECT VALUE INSIDE <OPTION>
	WebElement option = driver.findElement(By.xpath("//option[text()='N']"));
	Thread.sleep(5000);
	option.click();
	driver.findElement(By.xpath("//input[@type='reset']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
  driver.quit();
}
//Testcase - Create new -back to category page - Go back to 
public void category3() {
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	driver.findElement(By.xpath("//input[@name='TypeCategoryName']")).sendKeys("N1013");
	driver.findElement(By.xpath("//input[@name='CategoryUniqueId']")).sendKeys("111023");
	driver.findElement(By.xpath("//input[@name='description']")).sendKeys("text");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TO SELECT VALUE INSIDE <OPTION>
	WebElement option = driver.findElement(By.xpath("//option[text()='N']"));
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
	se.selectByValue("25");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("OBC");
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    driver.quit();
}
//Testcase for list of category master - Edit button
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
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
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
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://115.124.105.99:6443/humanres/control/main");
	driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Proceed to 115.124.105.99 (unsafe)')]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("cmstest");
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("ofbiz321");
	driver.findElement(By.xpath("//input[@type='submit']")).click(); 
    driver.findElement(By.xpath("//h2[text()='Human Resources']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Master')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Category')]")).click();
	//edit button
	driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	WebElement et = driver.findElement(By.xpath("//input[@type='text']"));
	et.clear();
	et.sendKeys("value");
	WebElement cc = driver.findElement(By.xpath("//input[@name='CategoryUniqueId']"));
	cc.clear();
	cc.sendKeys("value");
	WebElement desc = driver.findElement(By.xpath("//input[@name ='description']"));
	desc.clear();
	desc.sendKeys("none");
	WebElement ac = driver.findElement(By.xpath("//option[text()='Y']"));
	ac.click();
	ac.sendKeys("N");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.quit();

	
}
}