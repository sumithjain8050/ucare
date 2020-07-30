package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("sumithjain8050@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordField")).sendKeys("goldie");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
        System.out.println("url");
        if(url.contains("https://www.naukri.com/mnjuser/homepage"))
        {
        	System.out.println("home page is displayed : pass");
        }
        else
        {
        	System.out.println("home page is not displayed : fail");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='My Naukri']")).click();
        driver.findElement(By.xpath("//a[.='Logout']")).click();
        String url1 = driver.getCurrentUrl();
        System.out.println("url1");
        if(url1.contains("https://www.naukri.com/"))
        {
        	System.out.println("login page is displayed : pass");
        }
        else
        {
        	System.out.println("login page is not displayed : fail");
        }
     
	}

}
