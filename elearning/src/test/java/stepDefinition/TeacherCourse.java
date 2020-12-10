package stepDefinition;

import static org.testng.Assert.fail;

import org.omg.PortableServer.POAPackage.ObjectNotActive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TeacherCourse {

	public WebDriver driver;

	@Given("User should hv launched application")
	public void user_should_hv_launched_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearning.upskills.in/index.php");
	}

	@When("logged in as teacher and course created")
	public void logged_in_as_teacher_and_course_created() {
		driver.findElement(By.id("login")).sendKeys("sonali.teacher");
		driver.findElement(By.id("password")).sendKeys("Passw0rd");
		driver.findElement(By.id("form-login_submitAuth")).click();
	}

	@Then("To verify whether application allows teacher to add project details")
	public void to_verify_whether_application_allows_teacher_to_add_project_details() {
		// Click on the already created course MavenCourse
		driver.findElement(By.xpath("//section[@id=\'page\']//h4/a")).click();
		// Click on the Projects
		driver.findElement(By.xpath("//a[@id='istooldesc_13013']")).click();
		// Click on Create new Projects
		driver.findElement(By.xpath("//img[@title='Create a new project']")).click();
		// Enter project details title sub title
		driver.findElement(By.id("add_blog_blog_name")).sendKeys("e learning");
		driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys("e learning project");
		driver.findElement(By.id("add_blog_submit")).click();
		// click on project link
		driver.findElement(By.xpath("//table[contains(@id,\"project\")]/tbody/tr[2]/td[1]/a")).click();
		// click on new task icon
		driver.findElement(By.xpath("//div[@id=\"toolbar\"]//a[2]/img")).click();
		// enter valid credential in title text box - design
		driver.findElement(By.id("add_post_title")).sendKeys("design");
		// click on save button
		driver.findElement(By.id("add_post_save")).click();
		// click on Role management icon
		driver.findElement(By.xpath("//div[@id=\"toolbar\"]//a[3]/img")).click();
		// click on add a new role icon
		driver.findElement(By.xpath("//section[@id=\"main_content\"]//a[1]")).click();
		// enter valid credential in title text box -- developer
		driver.findElement(By.xpath("//section[@id=\"main_content\"]//div[1]/div/input")).sendKeys("developer");
		// click on save button
		driver.findElement(By.xpath("//section[@id=\"main_content\"]//button")).click();
		// click on Assign role icon
		driver.findElement(By.xpath("//section[@id=\"main_content\"]/div/div/div/div/a[2]")).click();
		// select student / teacher name in user list box -- sunil
		Select s = new Select(driver.findElement(By.id("assign_task_task_user_id")));
		s.selectByVisibleText("sonali khopde");
		// driver.findElement(By.id("//*[@id=\"assign_task\"]/fieldset/div[1]/div[1]/div/div/div[1]/input")).sendKeys("Sonali");
		// click on validate button
		driver.findElement(By.id("assign_task_submit")).click();
		// click on user management icon
		driver.findElement(By.xpath("//div[@id=\"toolbar\"]/div/div/a[4]/img")).click();
		// click on checkbox beside the user
		driver.findElement(By.xpath("//table[contains(@id,\"tablename\")]//input")).click();
		// click on register button
		//assert.fail("Register button bot available", ObjectNotActive);
	}
}
