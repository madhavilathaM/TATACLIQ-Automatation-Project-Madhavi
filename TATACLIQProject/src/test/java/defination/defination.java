package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination {
	public static String url="https://www.tatacliq.com/";
	WebDriver driver;
	
	
	
	@Given("I should go to Home page")
	public void i_should_go_to_home_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	driver.manage().window().maximize();
		
		
	}
	@When("Mouse over on Signup")
	public void mouse_over_on_signup() throws InterruptedException {
	    
		Thread.sleep(6000);
		
		Actions as=new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Sign in / Sign Up')]"));
		as.moveToElement(menuOption).build().perform();
		
		
	}
	@Then("user able to see dropdown menu")
	public void user_able_to_see_dropdown_menu() {
	    
		System.out.println("User able to see dropdown menu of Signup feature");
	}




}
