package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CreateBoardPages;

public class CreateBoardSteps extends BaseClass {
    @Given("User is on Chrome browser")
    public void user_is_on_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("User launches the Url {url}")
    public void userLaunchesTheUrl(String url) {
        driver.get(url);
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        pages=new CreateBoardPages(driver);
        pages.loginBT();
    }
    @When("User enters valid credentials username as {username} and password as {password}")
    public void user_enters_valid_credentials_username_as_and_password_as(String Uname, String password) {
        pages.enteruserName(Uname);
        pages.entrPassword(password);
    }
    @When("User clicks on Create a new board")
    public void user_clicks_on_create_a_new_board() {
        pages.createnewboard();
    }
    @When("User Enters Board Title as {title}")
    public void user_enters_board_title_as(String title) {
        pages.enterBoardTitle(title);
    }
    @When("User clicks on create button and wait for the new board to load")
    public void user_clicks_on_create_button_and_wait_for_the_new_board_to_load() {
        pages.createBoard();
    }
    @Then("Validate board Title as {string}")
    public void validate_board_title_as(String string) {
        String Actualtitle=pages.boardtitl();
        Assert.assertEquals(Actualtitle,string);
    }
    @Then("validate board URL contains {string} and you are inside the board")
    public void validate_board_url_contains_and_you_are_inside_the_board(String expect) {
        boolean res=pages.urlcheck(expect);
        if (res){
            System.out.println("you are inside the board");
        }else {
            System.out.println("you are out side the board");
        }
    }
    @When("User clicks on Trello logo or go to home")
    public void user_clicks_on_trello_logo_or_go_to_home() {
        pages.navigateHome();
    }
    @Then("Under Recently viewed confirm board appears as {text} and clicks on it works")
    public void under_recently_viewed_confirm_board_appears_as_and_clicks_on_it_works(String text) {
        String resulttext=pages.rentlyviewver();
        Assert.assertEquals(resulttext,text);
        pages.boardclick();
    }


    @And("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
