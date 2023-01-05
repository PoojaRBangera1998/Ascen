package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.purplle.com/brand/m-a-c");
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(100, 200));
		driver.manage().window().setPosition(new Point(100, 50));
	}

}
