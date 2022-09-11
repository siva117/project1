package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinone60 {
	
	   public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
	//	driver.findElement(By.id("id=\"ctl00_mainContent_rbtnl_Trip_0\"")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@text=\"Tirupati (TIR)\"]")).click();
		
//		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXTaction\"")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value=\"BLR\"]")).click();

		
		
//		driver.findElement(By.id("divpaxOptions")).click();
		
		for(int i=1;i<5;i++)
		{
			
		
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		if(driver.findElement(By.id("id=\"ctl00_mainContent_view_date2\"")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
		}
		else {
			
			System.out.println("its enabled");
		}
		
		
		driver.findElement(By.id("id=\"ctl00_mainContent_DropDownListCurrency\"")).click();
		driver.findElement(By.xpath("//option[@value=\"USD\"]")).click();
		
		
		
		
		
		
		
		
	//	driver.findElement(By.id("//input[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
