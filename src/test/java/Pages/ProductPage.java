package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectProduct(){
        Random rnd = new Random();
        int index = rnd.nextInt(3);
        List<WebElement> Products= FindElementsByClassName("productName");
        Products.get(index).click();
        ClickElementByCssSelector(".btn.btnGrey.btnAddBasket");

    }
}
