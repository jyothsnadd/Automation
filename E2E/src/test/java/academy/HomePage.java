package academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends Base {
	
	@Test
	public void basepageNavigation() throws IOException {
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
	}

}
