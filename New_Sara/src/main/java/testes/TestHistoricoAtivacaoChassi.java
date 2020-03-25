package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import newSara.HistoricoAtivacaoChassi;
import suporte.Web;

public class TestHistoricoAtivacaoChassi {
	
private WebDriver navegador;
	
	@Before
	
	public void inicia() {
		navegador = Web.createChrome();
		
	}
	
	
	@Test
	
	public void clicarHistoricoAtivacaoChassi() {
		
		HistoricoAtivacaoChassi historicoAtivacaoChassi= new HistoricoAtivacaoChassi();
		
		historicoAtivacaoChassi.consultarFiltro(navegador);
		
		
	}


}
