package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import newSara.SolicitarNotificacao;
import suporte.Web;

public class TestSolicitarNotificacao {
	
private WebDriver navegador;
	
	@Before
	
	public void inicia() {
		navegador = Web.createChrome();
		
	}
	
	
	@Test
	
	public void clicarSolicitarNotificacao() {
		
		SolicitarNotificacao solicita = new SolicitarNotificacao();
		
		solicita.solicitacao(navegador);	
		
	}

}
