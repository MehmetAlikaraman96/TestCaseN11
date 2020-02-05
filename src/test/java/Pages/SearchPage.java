package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void Search(String searchData){
        FindElementById("searchData").sendKeys(searchData);
        ClickElementByClassName("searchBtn");
    }
    public void GoPageTwo(){
        ClickElementByXpath("//*[@id='contentListing']/div/div/div[2]/div[4]/a[2]");
    }
    public void ControlSearchPage(){
        Assert.assertEquals("https://www.n11.com/arama?q=bilgisayar&pg=2",driver.getCurrentUrl());

    }
}
