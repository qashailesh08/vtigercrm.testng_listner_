package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllBrowserLaunch {

	@Test
	public void chromeBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
	}

	@Test
	public void edgeBrowser() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://blazedemo.com/");
	}

	@Test
	public void fireBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://openweathermap.org/current");
	}

}
