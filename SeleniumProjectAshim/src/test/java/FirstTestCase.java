import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	/*
	 * Test Case 1)launch broswer 2)open url (opencart) 3)Validate the title should
	 * be "your store" 3)close broswer
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Validate Title
		String title = driver.getTitle();
		if (title.equals("Practice Page")) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
