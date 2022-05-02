package americanTourister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmericanT_POM 
{
	 public void maximizeBrowser(WebDriver driver)
		{
			driver.manage().window().maximize();

		}
	 public void url(WebDriver driver) throws InterruptedException
		{
			driver.get("https://shop.americantourister.com/my-account");
		

		}
	   
	 public void userName(WebDriver driver,String usn) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"dwfrm_login_username_d0mwbxwrbuyn\"]")).sendKeys(usn);
			 

		}
	 public void password(WebDriver driver,String pwd) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys(pwd);
			

		}
	 public void signButton(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/form/fieldset/div[4]/button/span")).click();
			 

		}
	   
	 public void logOut(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div[1]/ul/li[7]/a")).click();
			 

		}
	 public void closeBrowser(WebDriver driver)
		{
			driver.close();

		}



}
