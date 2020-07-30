package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumithjain8050@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("goldie");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).submit();
		String url = driver.getCurrentUrl();
		System.out.println("url");
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("home page is displayed : pass");
		}
		else
		{
			System.out.println("home page is not displayed : fail");
		}
		driver.findElement(By.xpath("(//img[@class='hu5pjgll lzf7d6o1'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		String title = driver.getTitle();
		System.out.println("title");
		if(title.contains("Facebook"))
		{
			System.out.println("Login page is displayed : pass");
		}
		else
		{
			System.out.println("Login page is not displayed : fail");
		}
	}

}
