package americanTourister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class AmericanTourister_LiveProject 
{
	
  WebDriver driver;
  
  @BeforeTest
  public void AmericanTourister() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
	  driver= new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize(); 
	  
	  //URl
	  driver.get("https://shop.americantourister.com/home");
	  Thread.sleep(5000);

	    driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[3]/td[2]/font/input")).sendKeys("pratiksha98@gmail.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[7]/td[2]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wps_popup\"]/div/div[1]")).click();
		 Thread.sleep(3000);
  }
//  @Test(priority= 1)
//  public void Login() throws Exception
//  {
//    //click
//    driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[1]/a")).click();
//
//	  
//	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("pratiksha98@gmail.com");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/fieldset/div[2]/input")).sendKeys("Pratiksha#1710");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"login-buttons\"]/button/span")).click();
//	  Thread.sleep(2000);
//	  
//  }

//  @Test(priority= 2)
//  public void Mousehover() throws Exception
//  {
//   
//	   //step:1 Create Object Of Actions class
//	   Actions a= new Actions(driver);
//	   Thread.sleep(1000);  
//	   //Step :2 Create Object of list with Webelment
//	   List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li"));
//	   Thread.sleep(1000);  
//	   //Step:3 Store Size of List
//	   int listSize=ls.size();
//	   System.out.println("No Of Modules:"+listSize);
//	   Thread.sleep(1000);  
//	   //Step:4 For loop
//	   for(int i=1; i<=listSize; i++)
//	   {
//	    //Wait
//		Thread.sleep(1000);
//	    //Display Module'Name
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li["+i+"]")).getText());
//		Thread.sleep(2000);  
//		//Performance Mouse Hover
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li["+i+"]"))).click().perform();
//	   }
//  }

  
//@Test(priority= 3)
//public void Module1() throws Exception
//{
//	  driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li[1]/span/a")).click();
//	  Thread.sleep(5000); 
//	  
//	  driver.findElement(By.xpath("//*[@id=\"outerrefinements\"]/div/div[2]/div[1]/div/ul/div[7]/li/a")).click();
//	  Thread.sleep(2000);
//	 
//	  driver.findElement(By.xpath("//*[@id=\"cc961a4d0aa965f7a5d35a941b\"]/div[2]/div[1]/div[2]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"main-pdp\"]/div[2]/div/div[4]/div[3]/div/ul/li/div/ul/li[2]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[4]/div[4]/form/fieldset/div[2]/button/span")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"mini-cart-content\"]/div[2]/div[3]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]/fieldset/button")).click();
//	  Thread.sleep(2000);
//
//}
//	  
//@Test (priority= 4)
//public void Module2() throws Exception
//{
//	  //Click on Backpacks & Bags
//	  driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li[2]/span/a")).click();
//	  Thread.sleep(2000); 
//	  
//	  //Click on Tote-A-Fun Duffel
//	  driver.findElement(By.xpath("//*[@id=\"d3becdda9e57b411585b2f54ec\"]/div[2]/div[1]/div[2]/a")).click();
//	  Thread.sleep(2000);
//	   
//	  //Click on Add to Cart
//	  driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[4]/div[4]/form/fieldset/div[2]/button")).click();
//	  Thread.sleep(2000);
//	  
//	  //Click on Checkout
//	  driver.findElement(By.xpath(" /html/body/div[2]/div[2]/div[3]/div[2]/div[2]/div[3]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  //Click on Continue to Shopping
//	  driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]/fieldset/button")).click();
//	  Thread.sleep(2000);
//}
//	  
//@Test(priority= 5)
//public void Module3() throws Exception
//{
//	  
//	  driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li[3]/span/a")).click();
//	  Thread.sleep(2000);
//	 
//	  driver.findElement(By.xpath("//*[@id=\"outerrefinements\"]/div/div[2]/div[1]/div/ul/div[3]/li/a")).click();
//	  Thread.sleep(2000);
//	    
//	  driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/ul/li[10]/div/div[2]/div[1]/div[2]/a")).click();
//	  Thread.sleep(2000); 
//	   
//	  driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[4]/div[4]/form/fieldset/div[2]/button")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath(" /html/body/div[2]/div[2]/div[3]/div[2]/div[2]/div[3]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]/fieldset/button")).click();
//	  Thread.sleep(2000);
//}
//	  
//@Test(priority= 6)
//public void Module4() throws Exception
//{
//	  
//	  driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li[4]/span/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"ce98294c89d0c03ec806bba880\"]/div[2]/div[1]/div[2]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div/div[4]/div[4]/form/fieldset/div[2]/button")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"mini-cart-content\"]/div[2]/div[3]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]/fieldset/button")).click();
//	  Thread.sleep(2000);
//}
//	  
@Test (priority=7)
public void Module5() throws Exception
{
	  //deals
	  driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/div/div/ul/li[5]")).click();
	  Thread.sleep(5000);
	  
      //click on luggage
	  driver.findElement(By.xpath("//*[@id=\"a713f287a17d1a371bbaf8e569\"]/div[2]/div[1]/div[2]/a")).click();
	  Thread.sleep(1000);
	  
	 // driver.findElement(By.xpath("//*[@id=\"wps-ribbon_TOP_false\"]/div[2]")).click();
	 // Thread.sleep(2000);
	  
      //Add to cart
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_product_addtocart_d0dgcsdjeopc\"]/fieldset/div[2]/button/span")).click();
	  Thread.sleep(2000);
	  
	  //checkout 1	  
	  driver.findElement(By.xpath("//*[@id=\"mini-cart-content\"]/div[2]/div[3]/a")).click();
	  Thread.sleep(2000);
	  
	  //checkout 2
	  driver.findElement(By.xpath("//*[@id=\"cart-wrapper\"]/div/div[3]/div/div[2]/div[1]/form/fieldset/button")).click();
	  Thread.sleep(2000); 
	   
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_firstName\"]")).sendKeys("Pratiksha");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_lastName\"]")).sendKeys("Gadakh");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_address1\"]")).sendKeys("At Post Nashik");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_address2\"]")).sendKeys("Chandori");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_city\"]")).sendKeys("Nashik");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_states_state\"]/option[18]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_postal\"]")).sendKeys("52245");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_phone\"]")).sendKeys("9876543210");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_email_emailAddress\"]")).sendKeys("pratiksha98@gmail.com");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[1]/div/form/div[3]/button")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"useEntered\"]")).click();
	  Thread.sleep(2000);
}	  
	  
//@Test(priority= 8)
//public void Logout() throws Exception
//{
//	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("pratiksha98@gmail.com");
//      Thread.sleep(2000);
//
//      driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys("Pratiksha#1710");
//      Thread.sleep(2000);
// 
//      driver.findElement(By.xpath("//*[@id=\"login-buttons\"]/button/span")).click();
//      Thread.sleep(2000);
//
//	  driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/ul/li[2]/a")).click();
//	  Thread.sleep(2000); 
//}
  

  @AfterTest
  public void afterTest()
  {
	  
  }

}
