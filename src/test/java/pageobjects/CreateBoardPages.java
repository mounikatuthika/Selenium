package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitHelper;

public class CreateBoardPages {
      public WebDriver driver;
     public WaitHelper wait;
     public CreateBoardPages(WebDriver driver1){
    driver=driver1;
    PageFactory.initElements(driver1,this);
    wait = new WaitHelper(driver1);
}

@FindBy(xpath = "(//a[text()='Log in'])[1]")
    WebElement loginbutton;
@FindBy(name = "username")
    WebElement username;
@FindBy(id="login-submit")
WebElement continuebtn;
@FindBy(id="password")
WebElement password;
@FindBy(xpath="//*[text()='Log in']")
WebElement signin;
@FindBy(xpath = "//p[text()='Create']")
WebElement createBT;
@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
WebElement createnewBT;
@FindBy(xpath = "//*[@aria-describedby='board-title-required-error']")
WebElement boartitle;
@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
WebElement createboardsub;
@FindBy(xpath = "//*[@data-testid='board-name-display']")
WebElement createdboard;
@FindBy(xpath = "//a[@aria-label='Back to home']")
WebElement logo;
@FindBy(xpath = "//h3[text()='Recently viewed']/../../div[2]//a[1]")
WebElement Recentlyviewd;

public void loginBT(){
    loginbutton.click();
}
public void enteruserName(String uname){
    wait.waitforElement(username,10);
    username.sendKeys(uname);
    continuebtn.click();
}
public void entrPassword(String pass){
    wait.waitforElement(password,10);
    password.sendKeys(pass);
    signin.click();
}
public void createnewboard(){
    wait.waitforElement(createBT,15);
    createBT.click();
    wait.waitforElement(createnewBT,5);
    createnewBT.click();
}
public void enterBoardTitle(String title){
    wait.waitforElement(boartitle,5);
    boartitle.sendKeys(title);
}
public void createBoard(){
    createboardsub.click();

}
public String boardtitl(){
    wait.waitforElement(createdboard,15);
    return createBT.getText();
}
    public boolean urlcheck(String st){
        String url=driver.getCurrentUrl();
        return url.contains(st);
    }
public void navigateHome(){
    logo.click();
}
public String rentlyviewver(){
wait.waitforElement(Recentlyviewd,15);
return  Recentlyviewd.getText();
}
public void boardclick(){
    Recentlyviewd.click();
}

}
