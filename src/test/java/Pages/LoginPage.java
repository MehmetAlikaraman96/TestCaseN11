package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void ControlPageLoad(){
        Assert.assertEquals("https://www.n11.com/",driver.getCurrentUrl());
    }

    public void GoLogin(){
        ClickElementByClassName("btnSignIn");
    }

    public void Login(String userName, String password){
        FindElementById("email").sendKeys(userName);
        FindElementById("password").sendKeys(password);
        ClickElementById("loginButton");
    }
    public void ControlLogin(){
        Assert.assertNotNull(FindElementByClassName("myAccount"));
    }

}
