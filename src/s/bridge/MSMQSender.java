package s.bridge;

public class MSMQSender implements MessageSender {

	@Override
	public void send(String subject, String body) {
		System.out.println(String.format("MSMQ: %s \n Body: %s", subject, body));
	}

}
