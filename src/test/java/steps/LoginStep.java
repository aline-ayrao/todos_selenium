package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
    }

    @After
    public void after(){
        driver.quit();
    }
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String url) {
        driver.get(url);
    }

    @E("preencho os dados corretamente Nome Completo {string}, Email {string}, CEP {string}, Telefone {string} e CPF {string}")
    public void preencherDados(String nome, String email, String cep, String telefone, String cpf) {
        loginPage.preencherNomeCompleto(nome);
        loginPage.preencherEmail(email);
        loginPage.preencherCEP(cep);
        loginPage.preencherTelefone(telefone);
        loginPage.preencherCPF(cpf);
        loginPage.marcarCheck();
    }

    @Quando("clicar iniciar")
    public void clicarIniciar() {
        loginPage.clicarIniciar();
    }

    @Entao("valido que a pagina de farmacy foi carregada com sucesso")
    public void validoQueAPaginaFarmacyFoiCarregada() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/farmacy"));
    }

}