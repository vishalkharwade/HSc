package neostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver",
				 "D:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		 
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://neostox.com");
		 driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).sendKeys("8766501536");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@id='lnk_signup1']")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("1234");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}
	
}
;