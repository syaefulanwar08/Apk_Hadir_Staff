package testAplikasiStaff.screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import testAplikasiStaff.driver.DriverAndroid;


public class Screenshots {

	public void takeScreenshotsFullPage(String nameFile) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) DriverAndroid.getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("screenshots\\"+ nameFile + ".png");
		FileUtils.copyFile(src, target);
	}
	
	public void takeScreenshotsSectionPage(String selector, String nameFile) throws Exception {
		WebElement el = DriverAndroid.getDriver().findElement(By.xpath(selector));
		File src = el.getScreenshotAs(OutputType.FILE);
		File target = new File("screenshots\\"+ nameFile + ".png");
		FileUtils.copyFile(src, target);
	}
	
}
