package Firstdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\SELENIUM\\Geckodriver\\geckodriverv21.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement submit_button = driver.findElement(By.name("q"));
		submit_button.sendKeys("COVID-19");
		submit_button.submit();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.linkText("News"))).click();
		
		}

}
