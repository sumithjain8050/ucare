package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbmessenger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.messenger.com/");
		driver.findElement(By.id("email")).sendKeys("8296232125");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("goldie");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		String title = driver.getTitle();
		System.out.println("title");
		if(title.equals("Messenger"))
		{
			System.out.println("home page is displayed : pass");
		}
		else
		{
			System.out.println("home page is not displayed : fail");
		}
		driver.findElement(By.xpath("//div[@class='_6ymu _7iq4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_54nh' and .='Log Out']")).click();
		String title1= driver.getTitle();
		System.out.println("title1");
		if(title1.equals("Messenger"))
		{
			System.out.println("Login page is displayed : pass");
		}
		else
		{
			System.out.println("Login page is not displayed : fail");
		}
	}

}
