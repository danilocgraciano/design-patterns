package s.bridge;

public abstract class Message {

	protected MessageSender messageSender;

	protected String subject;

	protected String body;

	public abstract void send();

}
