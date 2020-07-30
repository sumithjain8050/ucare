package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		String title = driver.getTitle();
		System.out.println("title");
		if(title.contains("Enter Time-"))
		{
			System.out.println("home page is displayed : pass");
		}
		else
		{
			System.out.println("home page is not displayed : fail");
		}
        Thread.sleep(3000);
        driver.findElement(By.id("logoutLink")).click();
        String url = driver.getCurrentUrl();
        System.out.println("url");
        if(url.contains("login.do"))
        {
        	System.out.println("Login page is displayed : pass");
        }
        else
        {
        	System.out.println("Login page is not displayed : fail");
        }
	}

}
