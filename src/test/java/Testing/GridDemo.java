package Testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridDemo {

	private RemoteWebDriver driver;
	@BeforeClass
	public void startBrowser() throws MalformedURLException
	
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		String hubURL = "http://192.168.0.101:4545/wd/hub";
		 driver = new RemoteWebDriver(new URL(hubURL),options);
		
}
	@Test
	public void testmethod1()
	{
	
		
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		
	}
}