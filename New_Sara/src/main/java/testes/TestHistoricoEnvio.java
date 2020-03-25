package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import newSara.HistoricoEnvio;
import suporte.Web;

public class TestHistoricoEnvio {
	
	private WebDriver navegador;
	
	@Before
	
	public void inicia() {
		navegador = Web.createChrome();
		
	}
	
	
	@Test
	
	public void clicarHistoricoEnvio() {
		
		HistoricoEnvio historicoenvio = new HistoricoEnvio();
		
		historicoenvio.consultarFiltro(navegador);
		
		
	}

}
