package qaacademy;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosOnlineBotao = "//*[@id='comp-k7g9c7sd1label1]";
    String cursosPresenciasBotao = "comp-k7g9c7sd1label";
    

    @Test
    public void testeAberturaNavegador(){
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.qaacademy.com.br");

        drive.findElement(By.id(cursosPresenciasBotao)).click();;
    }
    
}
