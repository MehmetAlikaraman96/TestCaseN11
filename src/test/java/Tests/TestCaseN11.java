package Tests;

import Base.BaseTest;
import Pages.BasketPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SearchPage;
import org.junit.*;


public class TestCaseN11 extends BaseTest {
        LoginPage loginPage;
        SearchPage searchPage;
        BasketPage basketPage;
        ProductPage productPage;

        @Test
        public void TestCaseN11(){
            loginPage = new LoginPage(driver);
            searchPage = new SearchPage(driver);
            basketPage = new BasketPage(driver);
            productPage = new ProductPage(driver);

            loginPage.ControlPageLoad();
            loginPage.GoLogin();
            loginPage.Login("kkazuya333@gmail.com", "deneme123");
            loginPage.ControlLogin();


            searchPage.Search("bilgisayar");
            searchPage.GoPageTwo();
            searchPage.ControlSearchPage();

            productPage.selectProduct();


            basketPage.GetPriceProduct();
            basketPage.GoBasket();
            basketPage.GetPriceBasket();
            basketPage.ControlPrice();
            basketPage.UpAmount();
            basketPage.ControlAmount();
            basketPage.DeleteProduct();
            basketPage.ControlBasket();


        }


}
