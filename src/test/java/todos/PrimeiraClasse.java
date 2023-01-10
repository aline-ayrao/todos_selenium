package todos;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    @Test
    public void testeAberturaBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://calculadora.cartaodetodos.com.br/");

    }
}
