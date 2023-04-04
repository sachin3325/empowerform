package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent_Reg_form 
{
	public static WebDriver driver;
	
	@Given("I want to enter patient Name")
	public void i_want_to_enter_patient_name() throws InterruptedException 
	{
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.empowertherapy.com/patient_form_sample");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  Thread.sleep(3000);
		  
		  WebElement close=driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/button[1]"));
		  close.click();
		  
		  WebElement lastname = driver.findElement(By.xpath("//input[@id='lname_1']"));
		  lastname.sendKeys("Testing");
		  Thread.sleep(2000);
		  
		  WebElement firstname = driver.findElement(By.xpath("//input[@id='fname_1']"));
		  firstname.sendKeys("Sachin");
		  Thread.sleep(2000);
	}
	
	@Given("I want to choose patient sex")
	public void i_want_to_choose_patient_sex() throws InterruptedException 
	{
		 WebElement gender = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		  gender.click();
		   Thread.sleep(2000);
	}
	
	@Given("I want to enter patient street name")
	public void i_want_to_enter_patient_street_name() throws InterruptedException 
	{
		WebElement street = driver.findElement(By.xpath("//input[@id='street_1']"));
	    street.sendKeys("Street");
	    Thread.sleep(2000);
	}
	
	@Given("I want to enter patient city\\/zip\\/state")
	public void i_want_to_enter_patient_city_zip_state() throws InterruptedException 
	{
		 WebElement cityzip = driver.findElement(By.xpath("//input[@id='city_1']"));
		  cityzip.sendKeys("638711");
		    Thread.sleep(2000);
	}
	
	@Given("I want to enter patient parent status")
	public void i_want_to_enter_patient_parent_status() throws InterruptedException 
	{
		  WebElement parentstatus = driver.findElement(By.xpath("//input[@value='Divorced']"));
		    parentstatus.click();
		    Thread.sleep(2000);
	}
	
	@Given("I want to enter patient School name")
	public void i_want_to_enter_patient_school_name() throws InterruptedException 
	{
		 WebElement school = driver.findElement(By.xpath("//input[@id='school_1']"));
		  school.sendKeys("SNHSS");
		  Thread.sleep(2000);
	}
	
	@Given("I want to enter patient Address")
	public void i_want_to_enter_patient_address() throws InterruptedException 
	{
		WebElement patAddress = driver.findElement(By.xpath("//input[@id='address_1']"));
		patAddress.sendKeys("Erode");
		Thread.sleep(2000);
	}
	
	@Given("I want to enter Referring Physician name")
	public void i_want_to_enter_referring_physician_name() throws InterruptedException
	{
		 WebElement refphysician = driver.findElement(By.xpath("//input[@id='refphysician_1']"));
		    refphysician.sendKeys("Reference Physician");
		    Thread.sleep(2000);
	}
	
	@Given("I want to enter Office phone number")
	public void i_want_to_enter_office_phone_number() throws InterruptedException 
	{
		 WebElement offph = driver.findElement(By.xpath("//input[@id='phone_1']"));
		   offph.sendKeys("8148862533");
		   Thread.sleep(2000);
	}
	
	@Given("I want to enter fax number")
	public void i_want_to_enter_fax_number() throws InterruptedException 
	{
		WebElement faxnum = driver.findElement(By.xpath("//input[@id='fax_1']"));
	    faxnum.sendKeys("5444323321");
	    Thread.sleep(2000);
	}
	
	@Then("I click the next button for another form")
	public void i_click_the_next_button_for_another_form() 
	{
		 WebElement nextbut = driver.findElement(By.xpath("//a[@class='nxt__btn']"));
		   nextbut.click();
	}

}
