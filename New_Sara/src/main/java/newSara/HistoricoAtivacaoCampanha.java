package newSara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoricoAtivacaoCampanha {

	public void  consultarFiltro( WebDriver navegador) {
		
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/div/div/ul/a[3]/div/p")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div[1]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[1]/div/div/input")).sendKeys("Campanha");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[2]/div/div/input")).sendKeys("10");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[3]/div/div/input")).sendKeys("15");
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[3]/div[1]/button/span[1]")).click();
		
		
		
		
		
	}
}
