package americanTourister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmericanTourister_Registration 
{
	 WebDriver driver;
	
  @Test
  public void Registration() throws Exception
  {
	  AmericanTourister_LiveProject a= new AmericanTourister_LiveProject();
	  
	      //click
	      driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[1]/a")).click();
	      Thread.sleep(2000); 
		
		  //Create Account
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
}
