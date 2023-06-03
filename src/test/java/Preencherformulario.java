import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preencherformulario {
    String preencherNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String preencherSobrenome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String preencherEndereco = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String preencherEmail = "//*[@id='eid']/input";
    String preencherTelefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String selecionarBotao = "//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input";
    String selecionarBotao2 = "//*[@id='checkbox2']";
    String selecionarBotao3 = "//*[@id='Skills']";
    String selecionarPais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]";
    String selecionarJapan = "//*[@id='select2-country-results']/li[7]";
    
    String selecionarAno = "//*[@id='yearbox']/option[65]";
    String selecionarMes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[13]";
    String selecionarDia = "//*[@id='daybox']/option[17]";

    String inserirSenha = "//*[@id='firstpassword']";
    String confirmarSenha = "//*[@id='secondpassword']";
    String refreshNaPagina = "//*[@id='Button1']";

   

    @Test
    public void testeAberturaNavegador () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath(preencherNome)).click();
        driver.findElement(By.xpath(preencherNome)).sendKeys("Jacqueline");
        driver.findElement (By.xpath(preencherSobrenome)).click();
        driver.findElement (By.xpath(preencherSobrenome)).sendKeys("Oliveira");
        driver.findElement(By.xpath(preencherEndereco)).click();
        driver.findElement(By.xpath(preencherEndereco)).sendKeys("Rua das Hortencias");
        driver.findElement(By.xpath(preencherEmail)).click();
        driver.findElement(By.xpath(preencherEmail)).sendKeys("jackiefran.oliver@gmail.com");
        driver.findElement(By.xpath(preencherTelefone)).click();
        driver.findElement(By.xpath(preencherTelefone)).sendKeys("11948530170");
        driver.findElement(By.xpath(selecionarBotao)).click();
        driver.findElement(By.xpath(selecionarBotao2)).click();
        driver.findElement(By.xpath(selecionarBotao3)).click();
        driver.findElement(By.xpath(selecionarBotao3)).sendKeys("Maya");
        driver.findElement(By.xpath(selecionarBotao3)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.findElement(By.xpath(selecionarPais)).click();
        driver.findElement(By.xpath(selecionarJapan)).click();
        driver.findElement(By.xpath(selecionarAno)).click();
        driver.findElement(By.xpath(selecionarMes)).click();
        driver.findElement(By.xpath(selecionarDia)).click();

        driver.findElement(By.xpath(inserirSenha)).click();
        driver.findElement(By.xpath(inserirSenha)).sendKeys("123456");
        driver.findElement(By.xpath(inserirSenha)).click();
        driver.findElement(By.xpath(confirmarSenha)).click();
        driver.findElement(By.xpath(confirmarSenha)).sendKeys("123456");
        driver.findElement(By.xpath(confirmarSenha)).click();

        Thread.sleep(7000);
        driver.findElement(By.xpath(refreshNaPagina)).click();

    }
}
