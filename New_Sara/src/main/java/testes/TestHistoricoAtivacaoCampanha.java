package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import newSara.HistoricoAtivacaoCampanha;

import suporte.Web;

public class TestHistoricoAtivacaoCampanha {

private WebDriver navegador;
	
	@Before
	
	public void inicia() {
		navegador = Web.createChrome();
		
	}
	
	
	@Test
	
	public void clicarHistoricoAtivacaoCampanha() {
		
		HistoricoAtivacaoCampanha historicoAtivacaoCampanha= new HistoricoAtivacaoCampanha();
		
		historicoAtivacaoCampanha.consultarFiltro(navegador);
		
		
	}

}
