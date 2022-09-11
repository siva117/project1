package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32");
		WebDriver driver =new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	
    	//x path
      /*driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("my own xpath");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("83435483683");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click(); */
		
		// css selector
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("my own css");
    	
//		driver.findElement(By.cssSelector("#email")).sendKeys("my own css");         //short cut      //for id     #id
//		                                                                                             //for class .class
//	
//		driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("982793");
//		
//	    driver.findElement(By.cssSelector("button[type=submit]")).submit();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
