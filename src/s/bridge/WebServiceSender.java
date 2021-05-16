package s.bridge;

public class WebServiceSender implements MessageSender {

	@Override
	public void send(String subject, String body) {
		System.out.println(String.format("Web Service: %s \n Body: %s", subject, body));
	}

}
