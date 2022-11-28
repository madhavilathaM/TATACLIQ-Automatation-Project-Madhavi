package Tatacliq;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tatacliq_Madhavi {
	
	
	public static String url="https://www.tatacliq.com/";
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test; 

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	driver.manage().window().maximize();
	
		
	}
	@Test(enabled=true,priority=0)
	public void Testcase1()//Checking Homepage is displayed after Url given in browser
	{
		
		test = extent.createTest("Checking Homepage is displayed After URL given in Browser");
		System.out.println("User Can see Home page of TataCliq"); 
		
		driver.getTitle();
		test.pass("you are in TATACLIQ Website");
		
		
	}
@Test(enabled=false,priority=1)
	public void login()
	{
		
		driver.findElement(By.xpath("//*[@class='DesktopHeader__loginTab']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("mobileNumber")).sendKeys("9611290775");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions)
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mobile-number-login__btnPrimary']")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class='mobile-number-login__btnPrimary']")).click();
				
		
	
	}
	
@Test(enabled=true,priority=1)
public void Testcase2() throws InterruptedException
{
	Thread.sleep(3000);
	test = extent.createTest("Checking Homepage Slidebar is working or not");
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[1]")).click();
	test.pass("user can click first arrow");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[2]")).click();
	test.pass("user can click second arrow");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[3]")).click();
	test.pass("user can click third arrow");
	Thread.sleep(15000);
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[4]")).click();
	test.pass("user can click fourth arrow");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[5]")).click();
	test.pass("user can click fifth arrow");
	
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[4]")).click();
	test.pass("user can click fourth arrow");
	Thread.sleep(15000);
	driver.findElement(By.xpath("//*[@class='BannerDesktop__nav']/div[3]")).click();
	test.pass("user can click third arrow");
	Thread.sleep(6000);
	
	test.info("user can click all slides");
	
}
@Test(enabled=false,priority=2)
public void Testcase3() throws InterruptedException//checking Homepage scrolling section by section
{
	
	test = extent.createTest("Checking Homepage Scrolling is working or not");
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,500)");
	test.pass("user can scroll the webpage");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//*[@class='DesktopHeader__logoHolder']")).click();
	
		
}

@Test(enabled=true,priority=3)
public void Testcase4() throws InterruptedException//checking from home page user able to go features and return to homepage again
{
	
	test = extent.createTest("Checking Homepage Feature Womens Wear is Clickable or not");
Thread.sleep(3000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	List<WebElement>li=driver.findElements(By.xpath("//*[@class='QuickLinks__quickLinksCard']"));
	System.out.println(li.size());
	Thread.sleep(3000);
	li.get(4).click();
	test.pass("User able to click the Womens Wear Feature");
	
}
@Test(enabled=true,priority=4)
public void Testcase5() throws InterruptedException
{
	
	test = extent.createTest("Checking Womens Wear Sub Feature Western Wear is Clickable or not");
	Thread.sleep(4000);
	JavascriptExecutor js1=((JavascriptExecutor)driver);
		
		js1.executeScript("window.scrollBy(0,300)");
		List<WebElement>li1=driver.findElements(By.xpath("//*[@class='QuickLinks__quickLinkImageHolder']"));
		System.out.println(li1.size());
		Thread.sleep(3000);
		li1.get(2).click();
		test.pass("User able to click the Womens Wear Sub Feature Western Wear");
	
}
@Test(enabled=true,priority=5)
public void Testcase6() throws InterruptedException
{
	
	test = extent.createTest("Checking In Western Wear Product type Filter is working or not");
	
	Thread.sleep(5000);
	JavascriptExecutor js5=((JavascriptExecutor)driver);
		
		js5.executeScript("window.scrollBy(0,500)");
		List<WebElement>li3=driver.findElements(By.xpath("//*[@class='CheckBox__base']"));
		System.out.println(li3.size());
		Thread.sleep(9000);
		li3.get(2).click();
		Thread.sleep(6000);
		test.pass("user able to select any one in product type");
		driver.findElement(By.xpath("//*[@class='DesktopHeader__logoHolder']")).click();
		
	test.pass("User able to go Home page from current Page");
	
}




@Test(enabled=true,priority=6)//checking blockbuster deals
public void Testcase7() throws InterruptedException
{
	
	test = extent.createTest("Checking In BlockBuster Deals 50% of Feature is Clickable or not");
	Thread.sleep(5000);
	JavascriptExecutor js3=(JavascriptExecutor)driver;
	js3.executeScript("window.scrollBy(0,800)");
	Thread.sleep(5000);
	List<WebElement>li4=driver.findElements(By.xpath("//*[@class='Carousel__element']"));
	System.out.println(li4.size());
	Thread.sleep(5000);
	li4.get(5).click();
	
	test.pass("User able to click the Blockbuster Deals 55% of feature");
}

@Test(enabled=true,priority=7)
public void Testcase8() throws InterruptedException
{
	test=extent.createTest("Checking User can able to Select the Colour of the products from Filters" );
	Thread.sleep(5000);
	JavascriptExecutor js4=(JavascriptExecutor)driver;
	js4.executeScript("window.scrollBy(0,800)");
	Thread.sleep(8000);
	List<WebElement>li5=driver.findElements(By.xpath("//*[@class='Accordion__iconPlus']"));
	li5.get(3).click();
	test.pass("User able to click the Colour icon from Filters");
	Thread.sleep(3000);
	List<WebElement>li6=driver.findElements(By.xpath("//*[@class='ColourSelectPLP__textHolder']"));
	li6.get(4).click();
	test.pass("User Can select Any colour from Colours Filter");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='DesktopHeader__logoHolder']")).click();
	test.pass("User can go to Home Page from Current page");
	
}




@Test(enabled=false,priority=8)
public void homepage3() throws InterruptedException//checking user can see signup menu
{
	Thread.sleep(6000);
	
	Actions as=new Actions(driver);
	WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Sign in / Sign Up')]"));
	as.moveToElement(menuOption).build().perform();
//	WebElement Signup=driver.findElement(By.xpath("//*[@class='DesktopHeader__logOutDropDown']"));
//	System.out.println(Signup.getText());
//	Actions act=new Actions(driver);
//	Thread.sleep(3000);
//	act.moveToElement(Signup).build().perform();
//	Thread.sleep(6000);
	
}

@Test(enabled=true,priority=8)
public void Testcase9() throws InterruptedException
{
	test=extent.createTest("Checking In Coupon Corner Skechers 40% of Feature is Clickable or not" );
	Thread.sleep(5000);
	JavascriptExecutor js8=(JavascriptExecutor)driver;
	
	js8.executeScript("window.scrollBy(0,900)");
	Thread.sleep(5000);
JavascriptExecutor js9=(JavascriptExecutor)driver;
	
	js9.executeScript("window.scrollBy(0,700)");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='11_1']")).click();
	test.pass("User able to Click the Skechers 40% of Feature");
	
}
	
	
	@Test(enabled=true,priority=9)
	public void testcase10() throws InterruptedException
	{
		
		test=extent.createTest("Checking SortBY Feature working or not");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@class='SelectBoxDesktop__arrow']")).click();
	//Thread.sleep(5000);
	Select M=new Select(driver.findElement(By.xpath("//*[@class='SelectBoxDesktop__hideSelect']")));
	
	Thread.sleep(5000);
	
	M.selectByVisibleText("Price High to Low");
	
	test.pass("User able to select Price High to Low from Sort");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='ProductModule-MP000000009674258']")).click();
	
	test.pass("User able to click any of the Product");
	driver.quit();
	
	test.info("Browser Closed");
	
	extent.flush();
	
}







}
