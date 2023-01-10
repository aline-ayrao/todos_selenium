package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    String NOME = "//*[@id='Nome completo']";
    String EMAIL = "//*[@id='E-mail']";
    String CEP = "//*[@id='CEP']";
    String TELEFONE = "//*[@id='Telefone']";
    String CPF = "//*[@id='CPF']";
    String INICIAR = "//*[@id='root']/div/div/div[1]/form/div[2]/div/button/span";


    public LoginPage(WebDriver driver){ //esse driver vem do teste
        this.driver = driver; //esse.drive recebe= drive que vem do teste
    }

    public void preencherNomeCompleto (String nome){
        driver.findElement(By.xpath(NOME)).sendKeys(nome);
    }
    
    public void preencherEmail (String email){
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherCEP (String cep){
        driver.findElement(By.xpath(CEP)).sendKeys(cep);
    }

    public void preencherTelefone (String telefone){
        driver.findElement(By.xpath(TELEFONE)).sendKeys(telefone);
    }

    public void preencherCPF (String cpf){
        driver.findElement(By.xpath(CPF)).sendKeys(cpf);
    }

    public void clicarIniciar (){
        driver.findElement(By.xpath(INICIAR)).click();
    }
}