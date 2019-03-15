package TestonCloud;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.*;

public class FirstTest {
	  
	  public static final String USERNAME = "partheshjoshi";
	  public static final String ACCESS_KEY = "f4be0b20-ac99-40e5-b50c-bafd9a941fec"; // from sauce labs account settings
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	  public static void main(String[] args) throws MalformedURLException {
	 
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "51.0");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
