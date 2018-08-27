package mypackage.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo3 {
	
	@Test
	public void yahoo() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.quit();

}
}