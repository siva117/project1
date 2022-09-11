package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddiff {
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			System.setProperty("webdrievr.chrome.driver", "C:\\work\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
	    	driver.get("https://www.rediff.com");
	        driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
	    	driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("css expresiion");
	    	driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("61276466");
	    	driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
	    	
	    	
	    	
	    	
}
}
