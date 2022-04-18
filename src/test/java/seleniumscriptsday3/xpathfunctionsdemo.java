package seleniumscriptsday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfunctionsdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
Thread.sleep(1500);


}
}