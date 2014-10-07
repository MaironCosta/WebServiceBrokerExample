package pdp;

public class MensagemBroker implements IBroker {

	@Override
	public void execute(Object object) {
		@SuppressWarnings("unused")
		Mensagem mensagem = (Mensagem) object;
		
		System.out.println("EXECUTA VALIDAÇÕES");
		System.out.println("CHAMA CLASSE DE SERVIÇO APROPRIADA PARA TRATAR REQUISIÇÃO");
	}
	
}
