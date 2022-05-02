package americanTourister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmericanT_Registration 
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
  public void registration() throws Exception 
  {
	  driver.get("https://shop.americantourister.com/my-account?dwcont=C176900229");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_login_register\"]/fieldset/div[2]/button/span")).click();
	  Thread.sleep(2000);
	  
	  //Registration
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_firstname\"]")).sendKeys("Pratiksha");
	  Thread.sleep(1000);
      
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_lastname\"]")).sendKeys("Gadakh");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_email\"]")).sendKeys("pratiksha98@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_emailconfirm\"]")).sendKeys("pratiksha98@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_login_password\"]")).sendKeys("Pratiksha#1710");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_login_passwordconfirm\"]")).sendKeys("Pratiksha#1710");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"CreateRegistrationForm\"]/fieldset[3]/div[4]/button/span")).click();
	  Thread.sleep(2000);
	  
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
