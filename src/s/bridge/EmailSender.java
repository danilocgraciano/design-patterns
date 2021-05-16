package s.bridge;

public class EmailSender implements MessageSender {

	@Override
	public void send(String subject, String body) {
		System.out.println(String.format("Email: %s \n Body: %s", subject, body));
	}

}
