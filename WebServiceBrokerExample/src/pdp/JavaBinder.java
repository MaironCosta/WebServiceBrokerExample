package pdp;

import java.io.StringReader;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class JavaBinder {

	public JavaBinder() {
	}
	
	private Object parse(String xmlDocument) {
		Object o = null;
		
		try {
			JAXBContext context = JAXBContext.newInstance(Mensagem.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			o = unmarshaller.unmarshal(new StreamSource(new StringReader(xmlDocument)));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	public void routeDocument(String xmlDocument) {
		Object o = parse(xmlDocument);
		if (o instanceof Mensagem) {
			Mensagem mensagem = (Mensagem) o;
			mostrarMensagem(mensagem);
			
			IBroker broker = new MensagemBroker();
			broker.execute(mensagem);
		}
	}
	
	private void mostrarMensagem(Mensagem mensagem) {
		System.out.println("Destinatario: " + mensagem.getDestinatario());
		System.out.println("Remetente: " + mensagem.getRemetente());
		System.out.println("Data: " + new SimpleDateFormat("dd/MM/yyyy").format(mensagem.getData().getTime()));
		System.out.println("Mensagem: " + mensagem.getMensagem());
	}
	
}