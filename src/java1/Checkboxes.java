package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdrievr.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		

//		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value=\"BLR\"]")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath(("(//a[@value=\"MAA\"])[2]"))).click();// xpath by index
//		
//	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value=\"MAA\"]")).click();// xpath by parent chaild relation ship	
//		
		
//		System.out.println(driver.findElement(By.cssSelector("#Div1")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//       System.out.println(driver.findElement(By.cssSelector("#Div1")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
				 
		{
			
			System.out.println("is enabled");
			
		}
		else {
			
			System.out.println("is disabled");
			
			
			
		}
       
       
       
	}

}
