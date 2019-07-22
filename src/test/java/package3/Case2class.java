package package3;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Case2class {
	   public static WebDriver driver;
	@Given("I want to open the url")
	public void i_want_to_open_the_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.40.4:8083/TestMeApp");
	   

	    
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
		driver.findElement(By.partialLinkText("SignIn")).click();
	  
	}

	@Given("I enter the {string} and {string}")
	public void i_enter_the_and(String name, String password, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List <Map<String,String>> list=dataTable.asMaps(String.class, String.class);
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("name"));
		
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("password"));
		Thread.sleep(3000);
	   

	   	}

	@Then("click on login button")
	public void click_on_login_button() {
		  driver.findElement(By.name("Login")).click();
	  
	}



}
