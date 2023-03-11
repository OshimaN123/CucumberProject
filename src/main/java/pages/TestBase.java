package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static WebDriver initDriver () {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
		
	
	
	
		public int generateRandomNum(int boundNum) {
			Random rnd=new Random();
			int generateNum=rnd.nextInt(boundNum);
			return generateNum;
		
		}
	
	
public void takeScreenshot(WebDriver driver) {
	TakesScreenshot ts=(TakesScreenshot)driver;
File sourceFile=ts.getScreenshotAs(OutputType.FILE);
SimpleDateFormat formatter=new SimpleDateFormat("MMddyy_HHmmss");
Date date=new Date();
String lavel=formatter.format(date);
	try {
		FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"/screenshots/"+lavel+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	


}
}
	
	
