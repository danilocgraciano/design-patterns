package s.bridge;

public class UserMessage extends Message {

	protected String userComments;

	@Override
	public void send() {
		var fullBody = String.format("%s\nUser Comments: %s", body, userComments);
		messageSender.send(subject, fullBody);
	}

}
