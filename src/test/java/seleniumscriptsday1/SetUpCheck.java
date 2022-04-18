package seleniumscriptsday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpCheck {
public static void main(String[] args) {
	WebDriver driver = new 	ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.wikipedia.org/");
	driver.close();
	
}
}
