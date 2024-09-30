package org.openqa.selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (6)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://sg-app.abouv.com/welcome");
	    driver.get("https://sg-app.abouv.com/sign-up");
	   
	   
	   driver.findElement(By.xpath("//button[contains(text(), 'Skip')]")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9211427898");
	   Thread.sleep(8000);
	   WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	   if (submitbutton.isEnabled()) {
	   submitbutton.click();
	   System.out.print("Submitted");
	   }
	   // Wait for the alert to be present
	   Thread.sleep(5000);
	   Alert confirmation = driver.switchTo().alert();
	   String alerttext = confirmation.getText();
	   System.out.println(alerttext);
	}
}
