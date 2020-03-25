package newSara;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.lowagie.text.List;


public class HistoricoEnvio {
	
	 
	
	public void  consultarFiltro( WebDriver navegador) {
		
		//Clicar em Historico de Envio
		navegador.findElements(By.className("MuiListItem-button")).get(0).click();
	
		//Clicar em Fltros
		navegador.findElement(By.id("panel1a-header")).click();
	
		//Inserir nome do arquivo
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[1]/div/div/input")).sendKeys("Testando");
		
		//Inserindo campanha
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[2]/div/div/input")).sendKeys("Testando2");
		
		//Inserindo numero de solicitação
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[3]/div/div/input")).sendKeys("35");
		
		//Inserindo data de envio
		navegador.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div[1]/div/div/div[4]/div/div/input")).sendKeys("10/08/1999");
		
		//erroo
		
		
		
		
	}

	
	

}
