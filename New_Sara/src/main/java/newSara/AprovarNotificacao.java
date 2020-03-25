package newSara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AprovarNotificacao {
	
	public void  consultarAprovacao( WebDriver navegador) {
		
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/div/div/ul/a[5]/div/p")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[2]/div/div/table/thead/tr/th[2]/span/span[1]/input")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"button_aprove\"]/span[1]")).click();
	}

}
