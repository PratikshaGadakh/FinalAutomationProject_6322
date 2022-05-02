package americanTourister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Logout 
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
      public void Logout() throws Exception
	  {
	  	 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("pratiksha98@gmail.com");
	     Thread.sleep(2000);

	     driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys("Pratiksha#1710");
	     Thread.sleep(2000);
	   
	     driver.findElement(By.xpath("//*[@id=\"login-buttons\"]/button/span")).click();
	     Thread.sleep(2000);

	  	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[2]/a")).click();
	  	 Thread.sleep(2000); 
	  }
  
  
  @AfterTest
  public void afterTest() 
  {
	    driver.close();   
  }

}
