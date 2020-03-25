package newSara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoricoAtivacaoChassi {
	
	public void  consultarFiltro( WebDriver navegador) {
		
		//Clicar em Historico de ativação chassi
		navegador.findElements(By.className("MuiListItem-button")).get(1).click();
		
		//Clicar em Fltros
		navegador.findElement(By.id("panel1a-header")).click();

		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[1]/div/div/input")).sendKeys("teste");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[2]/div/div/input")).sendKeys("10/08/2000");
		
		//eis aqui o erro
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[4]/div/div/input")).sendKeys("Status");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[5]/div/div/input")).sendKeys("Campanha");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[6]/div/div/input")).sendKeys("Campanha ISS");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[7]/div/div/input")).sendKeys("Modelos");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[10]/div/div/input")).sendKeys("10/08/2000");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[11]/div/div/input")).sendKeys("RS");	
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[12]/div/div/input")).sendKeys("Porto Alegre");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[13]/div/div/input")).sendKeys("Jones");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[14]/div/div/input")).sendKeys("Eduardito");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[15]/div/div/input")).sendKeys("152456");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[16]/div/div/input")).sendKeys("123456");
		
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[17]/div/div/input")).sendKeys("123456789");
		
		navegador.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[3]/div[1]/button/span[1]")).click();
		
		
}
}
