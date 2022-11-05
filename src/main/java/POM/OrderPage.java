package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderPage extends PageOptions {
    private final By nameField = By.xpath(".//input[@placeholder = '* Имя']");
    private final By surnameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroField = By.xpath(".//input[@placeholder = '* Станция метро']");
    private final By phoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By dateField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private final By timeField = By.xpath(".//div[text() = '* Срок аренды']");

    private final By modalHeader = By.className("Order_ModalHeader__3FDaJ");
    private final By finalOrderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[text()='Заказать']");
    private final By acceptButton = By.xpath(".//div[@class = 'Order_Modal__YZ-d3']/button[text()='Да']");
    private final By nextButton = By.xpath(".//button[text() = 'Далее']");

    public OrderPage (WebDriver driver){
        super(driver);
    }
    public OrderPage timeChoose(String text){
        driver.findElement(timeField).click();
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and text() = '"+ text + "']")).click();
        return this;
    }
    public OrderPage setName (String text){
        driver.findElement(nameField).sendKeys(text);
        return this;
    }
    public OrderPage setSurname (String text){
        driver.findElement(surnameField).sendKeys(text);
        return this;
    }
    public OrderPage setAddress (String text){
        driver.findElement(addressField).sendKeys(text);
        return this;
    }
    public OrderPage setPhone (String text){
        driver.findElement(phoneField).sendKeys(text);
        return this;
    }
    public OrderPage setMetro (String text){
        driver.findElement(metroField).sendKeys(text);
        driver.findElement(metroField).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        return this;
    }

    public OrderPage setDate (String text){
        driver.findElement(dateField).sendKeys(text,Keys.ENTER);
        return this;
    }

    public By getAcceptButton() {
        return acceptButton;
    }

    public By getNextButton() {
        return nextButton;
    }
    public By getFinalOrderButton() {
        return finalOrderButton;
    }
    public By getModalHeader() {
        return modalHeader;
    }
}
