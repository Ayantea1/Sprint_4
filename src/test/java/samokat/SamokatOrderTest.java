package samokat;

import POM.MainPage;
import POM.OrderPage;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class SamokatOrderTest {

    @RunWith(Parameterized.class)
 public static class Order {

     private static WebDriver driver;
     private final By orderButton;

     public Order(By orderButton) {
         this.orderButton = orderButton;
     }

     @Parameterized.Parameters
     public static Object[][] data() {
         MainPage mainPage = new MainPage(driver);
         return new Object[][] {
                 {mainPage.getBigOrderButton()},
                 {mainPage.getHeaderOrderButton()}
         };
     }
        @Rule
        public TestBase rule = new TestBase();

    @Test
    public void orderingTest() {
        MainPage mainPage = new MainPage(rule.getDriver());
        OrderPage orderPage = new OrderPage(rule.getDriver());
        mainPage.clickButton(orderButton);
        rule.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderPage.setName("Имя")
                .setSurname("Фамилия")
                .setAddress("Адрес 1")
                .setPhone("89874562132")
                .setMetro("Лубянка")
                .clickButton(orderPage.getNextButton());
        rule.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        orderPage
                .setDate("30.03.2022")
                .timeChoose("сутки")
                .clickButton(orderPage.getFinalOrderButton());
        orderPage.isTextCorrect(orderPage.getModalHeader(), "Хотите оформить заказ?");
        orderPage.clickButton(orderPage.getAcceptButton());
        orderPage.isTextCorrect(orderPage.getModalHeader(), "Заказ оформлен");
    }
}
}

