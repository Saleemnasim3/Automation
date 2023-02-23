package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class LoginSteps {

WebDriver driver = WebDriverManager.chromedriver().create();
//WebDriver driver;
    @Given("user is on amazon website")
    public void user_is_on_amazon_website() {

        //System.setProperty("webdriver.chrome.driver", "C:\\Saleem\\Desktop\\drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver.navigate().to("http://amazon.com");
    }

    @When("user clicks on loing feature")
    public void user_clicks_on_loing_feature() {
        System.out.println("Click on login feature");
    }

    @Then("user should be authenticated")
    public void user_should_be_authenticated() {
        System.out.println("User is authenticated");
    }





}


