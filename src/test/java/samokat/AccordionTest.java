package samokat;

import POM.MainPage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class AccordionTest {

        private static WebDriver driver;
        private final By accButton;
        private final By accAnswer;
        private final String text;

        public AccordionTest(By accButton, By accAnswer, String text) {
            this.accButton = accButton;
            this.accAnswer = accAnswer;
            this.text = text;
        }

        @Parameterized.Parameters
        public static Object[][] data() {
            MainPage mainPage = new MainPage(driver);
            return new Object[][] {
                    {mainPage.getAccordionQuest0(), mainPage.getAccAnswer0(), mainPage.getText0()},
                    {mainPage.getAccordionQuest1(), mainPage.getAccAnswer1(), mainPage.getText1()},
                    {mainPage.getAccordionQuest2(), mainPage.getAccAnswer2(), mainPage.getText2()},
                    {mainPage.getAccordionQuest3(), mainPage.getAccAnswer3(), mainPage.getText3()},
                    {mainPage.getAccordionQuest4(), mainPage.getAccAnswer4(), mainPage.getText4()},
                    {mainPage.getAccordionQuest5(), mainPage.getAccAnswer5(), mainPage.getText5()},
                    {mainPage.getAccordionQuest6(), mainPage.getAccAnswer6(), mainPage.getText6()},
                    {mainPage.getAccordionQuest7(), mainPage.getAccAnswer7(), mainPage.getText7()}
            };
        }
        @Rule
        public TestBase rule = new TestBase();

    @Test
    public void checkAccordionText(){
        MainPage mainPage = new MainPage(rule.getDriver());
        mainPage.clickButton(accButton);
        mainPage.isTextCorrect(accAnswer, text);
        }
    }

