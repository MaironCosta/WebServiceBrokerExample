package pdp;

public class MensagemBroker implements IBroker {

	@Override
	public void execute(Object object) {
		@SuppressWarnings("unused")
		Mensagem mensagem = (Mensagem) object;
		
		System.out.println("EXECUTA VALIDA��ES");
		System.out.println("CHAMA CLASSE DE SERVI�O APROPRIADA PARA TRATAR REQUISI��O");
	}
	
}
