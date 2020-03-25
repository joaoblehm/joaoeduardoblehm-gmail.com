package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import newSara.AprovarNotificacao;

import suporte.Web;

public class TestAprovarNotificacao {
	
private WebDriver navegador;
	
	@Before
	
	public void inicia() {
		navegador = Web.createChrome();
		
	}
	
	
	@Test
	
	public void clicarAprovarNotificacao() {
		
		AprovarNotificacao aprovar= new AprovarNotificacao();
		
		aprovar.consultarAprovacao(navegador);
		
		
	}


}
