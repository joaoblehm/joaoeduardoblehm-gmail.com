package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	public static WebDriver createChrome() {
		
	//Abrindo Navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Chrome Drive\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		
	//Navegando para a página do new sara
		navegador.get("http://192.168.0.210:3000/NewSara/ ");
		
		return navegador;
	}
		
	
}
