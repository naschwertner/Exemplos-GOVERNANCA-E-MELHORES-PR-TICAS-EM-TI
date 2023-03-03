import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MensagemBoasVindasTeste {

	//Preparação de testes
	String mensx = "Pedro Bo";
	MensagemBoasVindas mensUsuario = new MensagemBoasVindas(mensx);      
		
	//Teste da mensagem de abertura
	@Test
	public void t01testeCriarMensRecepcao() {
	    String mensretorno = mensUsuario.exibirMensAbertura();
		assertEquals("Ola! Seja bem vindo a sua calculadora pessoal,", mensretorno);     
	}
	   
	//Teste da mensagem complementar
   @Test
   public void t02testeExibeMensComplementar() {
	  String mensRetornoEsperado = "Pedro Bo!"+"Confira os resultados dos testes no painel da JUNIT!";	
      String mensRetornoReal = mensUsuario.exibirMensComplemento();
      assertEquals(mensRetornoEsperado, mensRetornoReal);     
   }

}

