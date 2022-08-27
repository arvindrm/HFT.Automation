package hft.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver; driver = new
		 * ChromeDriver(); driver.get("https://www.google.com");
		 */
		// TODO Auto-generated method stub

		
		/*
		 * WebDriverManager.firefoxdriver().setup(); WebDriver driver1; driver1 = new
		 * FirefoxDriver(); driver1.get("https://www.harborfreight.com");
		 */
		
		
		
		
		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver2; driver2 = new
		 * EdgeDriver(); driver2.get("https://www.cnn.com");
		 */
		 
		WebDriverManager.safaridriver().setup();
		WebDriver driver;
		driver = new SafariDriver();
		driver.get("https://www.google.com");
		// TODO Auto-generated method stub
	}

}
