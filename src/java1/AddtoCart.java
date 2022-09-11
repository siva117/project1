package java1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdrievr.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		String[] itemsNeeded={"Brocolli","Beetroot","Cucumber"};
		
		
		
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		
		for(int i=0;i<products.size();i++)
			//Brocolli-1 kg
			//Brocolli, 1 kg
			
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			//format to get a actual vegetable name
			//convert  array into array list for easy search
			//check weather the name you extracted is present in the array list or not
			
			
			
		    List itemsNeededList =Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) 
				
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			    
				if(j==3)
				{
					break;
				}
					
					
				
			}
			
			
			
			
			
			
		}
	
		

	}

}






























