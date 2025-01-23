package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Reader.PropertyReader;

public class BaseClass {

	static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return td.get();
	}
	
	public static void intialization(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriver driver=new ChromeDriver();
			td.set(driver);
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriver driver = new EdgeDriver();
			td.set(driver);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().get(PropertyReader.readProperty("URL"));
	}
}
