package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
//		hard(title, "Google");
		soft(title, "Goole");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
	}

	public static void hard(String act, String exp) {
		Assert.assertEquals(act, exp);
	}

	public static void soft(String act, String exp) {
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
//		s.assertAll();
	}

}
