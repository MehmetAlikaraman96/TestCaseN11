package Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver webDriver)
    {
        this.driver = webDriver;
    }

    public WebElement FindElementByClassName(String className){
       return driver.findElement(By.className(className));
    }
    public WebElement FindElementByCssSelector(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }
    public List<WebElement> FindElementsByClassName(String className){
        return driver.findElements(By.className(className));
    }
    public WebElement FindElementById(String id){
      return driver.findElement(By.id(id));
    }
    public WebElement FindElementByXpath(String xpath){
        return  driver.findElement(By.xpath(xpath));
    }

    public void ClickElementById(String id)
    {
       FindElementById(id).click();
    }
    public void ClickElementByClassName(String ClassName)
    {
        FindElementByClassName(ClassName).click();
    }
    public void ClickElementByXpath(String xpath)
    {
        FindElementByXpath(xpath).click();
    }
    public void ClickElementByCssSelector(String cssSelector)
    {
        FindElementByCssSelector(cssSelector).click();
    }

}
