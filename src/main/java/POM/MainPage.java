package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends PageOptions{
    private final By accordionQuest0 = By.id("accordion__heading-0");
    private final By accordionQuest1 = By.id("accordion__heading-1");
    private final By accordionQuest2 = By.id("accordion__heading-2");
    private final By accordionQuest3 = By.id("accordion__heading-3");
    private final By accordionQuest4 = By.id("accordion__heading-4");
    private final By accordionQuest5 = By.id("accordion__heading-5");
    private final By accordionQuest6 = By.id("accordion__heading-6");
    private final By accordionQuest7 = By.id("accordion__heading-7");

    private final By accAnswer0 = By.id("accordion__panel-0");
    private final By accAnswer1 = By.id("accordion__panel-1");
    private final By accAnswer2 = By.id("accordion__panel-2");
    private final By accAnswer3 = By.id("accordion__panel-3");
    private final By accAnswer4 = By.id("accordion__panel-4");
    private final By accAnswer5 = By.id("accordion__panel-5");
    private final By accAnswer6 = By.id("accordion__panel-6");
    private final By accAnswer7 = By.id("accordion__panel-7");

    private final String text0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String text1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String text2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String text3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String text4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String text5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String text6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String text7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private final By headerOrderButton = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[text()='Заказать']");
    private final By bigOrderButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button[text()='Заказать']");

    public By getHeaderOrderButton() {
        return headerOrderButton;
    }

    public By getBigOrderButton() {
        return bigOrderButton;
    }

    public By getAccordionQuest0() {
        return accordionQuest0;
    }

    public By getAccordionQuest1() {
        return accordionQuest1;
    }

    public By getAccordionQuest2() {
        return accordionQuest2;
    }

    public By getAccordionQuest3() {
        return accordionQuest3;
    }

    public By getAccordionQuest4() {
        return accordionQuest4;
    }

    public By getAccordionQuest5() {
        return accordionQuest5;
    }

    public By getAccordionQuest6() {
        return accordionQuest6;
    }

    public By getAccordionQuest7() {
        return accordionQuest7;
    }

    public By getAccAnswer0() {
        return accAnswer0;
    }

    public By getAccAnswer2() {
        return accAnswer2;
    }

    public By getAccAnswer3() {
        return accAnswer3;
    }

    public By getAccAnswer4() {
        return accAnswer4;
    }

    public By getAccAnswer5() {
        return accAnswer5;
    }

    public By getAccAnswer6() {
        return accAnswer6;
    }

    public By getAccAnswer7() {
        return accAnswer7;
    }

    public By getAccAnswer1() {
        return accAnswer1;
    }

    public String getText0() {
        return text0;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }


    public MainPage (WebDriver driver){
        super(driver);
    }




}
