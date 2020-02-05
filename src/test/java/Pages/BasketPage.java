package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }
    String price;
    String basketPrice;
    public void GetPriceProduct(){
         price = FindElementByXpath("//*[@class='newPrice']/ins").getText();
    }
    public void GoBasket() {
        ClickElementByClassName("myBasket");
    }
    public void GetPriceBasket() {
         basketPrice = FindElementByXpath("//*[@class='priceArea']/span").getText();
    }
    public void ControlPrice() {
        Assert.assertEquals("Price Not Same", basketPrice, price);
    }
   public void UpAmount() {
       ClickElementByCssSelector(".spinnerUp.spinnerArrow");
   }
   public void ControlAmount() {
       WebElement value = FindElementByClassName("quantity");
       String amount = value.getAttribute("value");
       String basketAmount = "2";
       Assert.assertEquals("Amount is not same", basketAmount, amount);
   }
        public void DeleteProduct() {
            ClickElementByCssSelector(".removeProd.svgIcon.svgIcon_trash");
        }
        public void ControlBasket() {
            String emptyBasket = FindElementByClassName("title").getText();
            String empty = "Sepetiniz Boş";
            Assert.assertEquals("Sepet boş değil!", empty, emptyBasket);
    }

    }


