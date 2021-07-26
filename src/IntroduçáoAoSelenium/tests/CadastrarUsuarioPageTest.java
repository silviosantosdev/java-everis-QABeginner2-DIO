package IntroduçáoAoSelenium.tests;

import IntroduçáoAoSelenium.pages.CadastrarUsuarioPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CadastrarUsarioPage;


public class CadastrarUsuarioPageTest {

    private WebDriver driver;
    private CadastrarUsuarioPage cadastrarUsuarioPage;

    @Before
    public void inicializa() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        cadastrarUsuarioPage = new CadastrarUsuarioPage(driver);
    }

    @Test
    public void setCadastrarUsuarioPage() {

        webDriverWait wait = new WebDriverWait(driver, 5);

        cadastrarUsuarioPage.cadastrarUsuario();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span")));
        WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span") );
        Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
    }

    @After
    public void afterCenario() {
                    driver.quit();
    }
}

