package IntroduçáoAoSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastrarUsuarioPage {

    private WebDriver driver;
    private Utils util;

    public CadastrarUsuarioPage(WebDriver driver) {
        util = new Utils(driver);
        this.driver = driver;
    }

    public void cadastrarUsuario() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("http://automationpractice/index.php");

        util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
        util.preencherCampoPorId("email_create", "everisbootcamp@qabeginner.com");
        util.clickPorCss("button[id='SubmitCreate'] span");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
        util.clickPorId("id_gender2");
        util.preencherCampoPorId("customer_firstname", "July");
        util.preencherCampoPorId(customer_lastname", "Sanders");
        util.preencherCampoPorId("passwd", "QA@everis213");
        util.preencherCampoPorCss("#days", "1");
        util.preencherCampoPorCss("#months", "January");
        util.preencherCampoPorCss("#years", "2000");
        util.preencherCampoPorId("address1", "Street name, 213");
        util.preencherCampoPorId("city", "Honolulu");
        util.preencherCampoPorId("id_state", "Hawaii");
        util.preencherCampoPorId("postcode", "96815");
        util.preencherCampoPorId("id_country", "United States");
        util.preencherCampoPorId("phone_mobile", "9999999999");
        util.clickPorId("submitAccount");
    }

}
