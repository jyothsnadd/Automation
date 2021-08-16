package academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\jyothsna\\workspace\\myworkspace01\\E2E\\src\\main\\java\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayan\\Downloads\\chromedriver_win32.exe");
			driver = new ChromeDriver();
			return driver;

		}

		else if (browserName.equals("firefox")) {

		} else if (browserName.equals("IE")) {

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
