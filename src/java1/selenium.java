package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdrievr.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
    	driver.get("https://www.google.com/");
    	
    	
    	
    	
//		System.out.println(driver.getTitle());
//		driver.close();
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		driver.close();  //closes the current browser window
//		driver.navigate().to("https://in.yahoo.com/?p=us&guccounter=1");
//		driver.navigate().back();
//		driver.navigate().forward();
//    	driver.navigate().refresh();
//		driver.quit();//clloses the all browser window
		
		
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.id("txtUsername")).sendKeys("askrishna117@gmail.com");
//		driver.findElement(By.id("txtPassword")).sendKeys("Shiva@110");
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Forgot your password?")).click();
	
    	
    	//browser given xpath and css
    	
    	driver.navigate().to("https://login.salesforce.com/?locale=in");
//		driver.findElement(By.id("username")).sendKeys("shiva @117");
//		driver.findElement(By.id("password")).sendKeys("Shiva112");
//		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		
//		driver.findElement(By.cssSelector(""))
		
//		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("askrishna");
//		driver.findElement(By.xpath("//input[@name=\"pw\"]")).sendKeys("4374676439");
//		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		

		
		
		
	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
		

	}

}
