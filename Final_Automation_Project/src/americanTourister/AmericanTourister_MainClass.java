package americanTourister;

import org.testng.annotations.Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AmericanTourister_MainClass
{

WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rishi\\Documents\\Automation Testing\\Browser Extension\\geckodriver.exe" );
//		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
	    driver.manage().window().maximize();
	}
  @Test(dataProvider = "dp")
  public void AmericanTourister_MainClass (String username, String password) throws Exception 
  {
	  AmericanT_POM o= new AmericanT_POM();
	  
	 o.maximizeBrowser(driver);
	Thread.sleep(1000);
	 o.url(driver);
	 Thread.sleep(2000);
	 o.userName(driver,username);
	 Thread.sleep(3000);
	 o.password(driver, password);
	 Thread.sleep(3000);
	 o.signButton(driver);
	 Thread.sleep(2000);
	 o.logOut(driver);
	 
	 
	 
  }

@DataProvider
public Object[][] dp() 
{
  return new Object[][] 
  		{
	new Object[] { "pratiksha98@gmail.com", "Pratiksha#1710" },
    new Object[] {  "demo@gmail.com", "demo1" },
    new Object[] { "admin@gmail.com", "admin1" },
    new Object[] { "pratiksha98@gmail.com", "Pratiksha#1710" },
  };
}
}
   
  
	  
