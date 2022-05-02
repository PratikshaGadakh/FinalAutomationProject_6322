package americanTourister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmericanTourister_login 

{
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws Exception 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(2000);
		    driver.manage().window().maximize();
	  }
  @Test
  public void login() throws Exception 
  {
	  driver.get("https://shop.americantourister.com/my-account");
	  Thread.sleep(2000);
	  
//	  driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[1]/a")).click();
//	  Thread.sleep(2000);
	    
	  driver.findElement(By.xpath("//*[@id=\\\"dwfrm_login_username_d0mwbxwrbuyn\\\"]")).sendKeys("pratiksha98@gmail.com");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\\\"dwfrm_login_password\\\"]")).sendKeys("Pratiksha#1710");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/form/fieldset/div[4]/button/span")).click();
	  Thread.sleep(2000);
	  	  
	  driver.findElement(By.xpath("//*[@id=\"primary\"]/div[1]/ul/li[7]/a")).click();
	  Thread.sleep(2000);
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
