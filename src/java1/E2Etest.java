package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2Etest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();

		Thread.sleep(4000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("its disabled");

		}

		else {

			System.out.println("Enabled");
		}

		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();

		WebElement address = driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_Adult\"]"));

		Select sel = new Select(address);

		sel.selectByValue("4");

		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();

		WebElement adsrs = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select selkt = new Select(adsrs);
		selkt.selectByVisibleText("INR");

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

		System.out.println("end to end test should gone pass");

	}

}
