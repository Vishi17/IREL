package master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DegreeDiploma {

	public static void main(String[] args) throws InterruptedException {
		DegreeDiploma login = new DegreeDiploma();
		login.degree();
		login.degreeDiploma();
		login.createNew();
		login.degreeFill();
		login.degreeBack();
		login.errorAlert();
		login.showEntries();
		login.edit();
		login.editField();
	}
//Testcase for Login - dd- master -degreediploma
  public void degree() {
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
  //TESTCASE LOGIN,HR,MASTER,DD,GoBack,HR-MAIN, LOGOUT
  public void degreeDiploma() throws InterruptedException {
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
  	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
  	//Go back
  	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
  	driver.findElement(By.xpath("//a[text()='Logout']")).click();
  	driver.quit();
  } 
//testcase-dd - create new-Yes- save-logout
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	//TO SELECT VALUE INSIDE Qualification<Option>
	WebElement type = driver.findElement(By.xpath("//option[text()='ABCDE ']"));
	Thread.sleep(5000);
	type.click();
	driver.findElement(By.xpath("//input[@name='DegreeOrDipName']")).sendKeys("E.E");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TO SELECT VALUE INSIDE <OPTION>
	WebElement option = driver.findElement(By.xpath("//option[text()='Y']"));
	Thread.sleep(5000);
	option.click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//button[@class='jGrowl-close']")).click();
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    driver.quit();
}
//testcase-dd - create new-No- cancel-logout
public void degreeFill() throws InterruptedException {
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	WebElement type = driver.findElement(By.xpath("//option[text()='ABCDE ']"));
	Thread.sleep(5000);
	type.click();
	driver.findElement(By.xpath("//input[@name='DegreeOrDipName']")).sendKeys("D.E");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//TO SELECT VALUE INSIDE <OPTION>
	WebElement option = driver.findElement(By.xpath("//option[text()='N']"));
	Thread.sleep(5000);
	option.click();
	driver.findElement(By.xpath("//input[@type='reset']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
    driver.quit();
}
//Testcase - Create new -back to dd page - Go back to 
public void degreeBack() {
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
	driver.findElement(By.xpath("//a[contains(text(),' Degree/Diploma')]")).click();
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
	//create New
	driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	WebElement type = driver.findElement(By.xpath("//option[text()='ABCDE ']"));
	Thread.sleep(5000);
	type.click();
	driver.findElement(By.xpath("//input[@name='DegreeOrDipName']")).sendKeys("B.E");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
	Select se = new Select(driver.findElement(By.xpath("//*[@name='DataTables_Table_0_length']")));
	se.selectByValue("25");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ABCD");
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
  driver.quit();
}
//Testcase for list of DD master - Edit button
public void edit() throws InterruptedException {
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
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
	driver.findElement(By.xpath("//a[contains(text(),'Degree/Diploma')]")).click();
	//edit button
	driver.findElement(By.xpath("(//a[text()='Edit'][1])")).click();
	WebElement qt = driver.findElement(By.xpath("//option[text()='MBA ']"));
	qt.click();
	Thread.sleep(5000);
	WebElement dn = driver.findElement(By.xpath("//input[@name ='DegreeOrDipName']"));
	dn.clear();
	dn.sendKeys("MBACHECK");
	WebElement active = driver.findElement(By.xpath("//option[text()='Y']"));
	active.click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Go Back')]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	driver.quit();	
}
}
