package s.bridge;

public class SystemMessage extends Message {

	@Override
	public void send() {
		messageSender.send(subject, body);
	}

}
