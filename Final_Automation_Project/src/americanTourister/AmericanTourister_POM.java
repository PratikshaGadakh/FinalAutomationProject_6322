package americanTourister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmericanTourister_POM
{
	
  @Test
   public void maximizeBrowser(WebDriver driver)
		{
			driver.manage().window().maximize();

		}
	    
	    public void url(WebDriver driver) throws InterruptedException
		{
			driver.get("https://shop.americantourister.com/home");
			 Thread.sleep(5000);

		}
	    
	    public void login(WebDriver driver) throws InterruptedException
	  	{
	    	driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[3]/td[2]/font/input")).sendKeys("pratiksha98@gmail.com");
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[7]/td[2]/input")).click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[1]")).click();
	 	}
	    
	    public void Button1(WebDriver driver) throws InterruptedException
	    {
	    	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[1]/a")).click();
	    	 Thread.sleep(4000);
	    }
	    
	    public void userName(WebDriver driver,String usn) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"dwfrm_login_username_d0viaqyygxcd\"]")).sendKeys(usn);
			 Thread.sleep(4000);

		}
	    public void password(WebDriver driver,String pwd) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys(pwd);
			 Thread.sleep(3000);

		}
	    public void signButton(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"login-buttons\"]/button")).click();
			 Thread.sleep(3000);

		}
	   
	    public void logOut(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[2]/a")).click();
			 Thread.sleep(3000);

		}
	    public void closeBrowser(WebDriver driver)
		{
			driver.close();

		}
    
}
