package todos;

import org.junit.Test;

public class PrimeiraClasse {

    @Test
    public void testeAberturaBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://calculadora.cartaodetodos.com.br/");

    }
}
