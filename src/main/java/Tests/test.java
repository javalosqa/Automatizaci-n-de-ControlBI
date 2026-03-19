package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public test() {
    }

    public static void main(String[] args) {

        //Se abre google chrome, se navega a la pagina y se maximiza la pantalla.
        WebDriver driver = new ChromeDriver();
        driver.get("https://control.ebi.com.gt/login");
        driver.manage().window().maximize();

        //Credenciales
        String user = "javavalos@bi.com.gt";
        String pass = "Javi$0712";

        //Localización por ID
        WebElement usernameInput = driver.findElement(By.name("email"));
        WebElement passInput = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("kt_login_signin_submit"));

        //Login
        usernameInput.sendKeys(user);
        passInput.sendKeys(pass);
        loginBtn.click();

    }
}