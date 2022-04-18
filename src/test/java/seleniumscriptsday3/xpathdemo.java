package seleniumscriptsday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//input[@value='red']
//input[@value='green']
//input[@value='green']
   //(//input[starts-with(@type,'check')])[1]
//(//input[starts-with(@type,'check')])[3]
//(//input[starts-with(@type,'check')])[5]
//(//input[contains(@type,'box')])[1]
//(//input[contains(@type,'box')])[3]
//(//input[contains(@type,'box')])[5]
driver.findElement(By.xpath("//input[@value='red']")).click();
Thread.sleep(1500);

}
}