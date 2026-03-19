package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args){

        //Inicializar el navegador
        WebDriver driver = new ChromeDriver();

        driver.get("https://control.ebi.com.gt/login");

        driver.manage().window().maximize();

    }
}
