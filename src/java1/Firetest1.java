package java1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firetest1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		
	  System.setProperty("Webdriver.gecko.driver","C:\\work\\geckodriver.exe");
	  
	  WebDriver driver =new FirefoxDriver();
	             driver.get("https://www.google.com");
	             System.out.println(driver.getTitle());
	  
		
		

	}

}
