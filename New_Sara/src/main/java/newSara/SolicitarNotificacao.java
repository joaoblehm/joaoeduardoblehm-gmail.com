package newSara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SolicitarNotificacao {
	
	public void  solicitacao( WebDriver navegador) {
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/div/div/ul/a[4]/div/p")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"cardCampanha\"]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/button[2]/span[1]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"card_button_1\"]/li")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"card_button_9\"]/li")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"card_button_7\"]/li")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/button[2]/span[1]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div/div/div[2]/table/thead/tr/th[1]/span/span[1]/input")).click();
	
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/button[2]/span[1]")).click();
	
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/button[2]")).click();
		
	}

}
