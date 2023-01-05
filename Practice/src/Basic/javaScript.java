package Basic;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(34,999)");
	}

}
