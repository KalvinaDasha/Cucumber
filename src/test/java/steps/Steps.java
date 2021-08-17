package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps {

    @Допустим("^открыта стартовая страница сайта \"([^\"]*)\"$")
    public void openPage(String pageURL)  {
       open(pageURL);
       getWebDriver().manage().window().maximize();
    }
    @Допустим("^пользователь вводит логин \"([^\"]*)\"$")
    public void enterLogin(String login){
        $(By.xpath("//input[@data-test = 'username']")).sendKeys(login);
    }
    @Допустим("^пользователь вводит пароль \"([^\"]*)\"$")
    public void enterPassword(String password){
        $(By.id("password")).sendKeys(password);
    }
    @Допустим("^пользователь нажимает кнопку LOGIN")
    public void clickLogin(){
        $(By.id("login-button")).click();
    }
    @Тогда("^открыта страница \"([^\"]*)\"$")
    public void openLink(String siteURL) {
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(siteURL, currentPageURL, "Значения ссылок не сопадают");
    }



}
