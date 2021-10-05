package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner (System.in);
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\19723\\june2021_Selenium-Eclipse\\First_Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();  //Polymorphism 
	driver.get("https://www.chase.com/");
	driver.manage().window().maximize();
	
	
	Thread.sleep(5000);
	
	//driver.close();
		
		
	}
}
