package s.bridge;

public class Main {

	public static void main(String[] args) {

		MessageSender email = new EmailSender();
		MessageSender queue = new MSMQSender();
		MessageSender web = new WebServiceSender();

		Message message = new SystemMessage();
		message.subject = "Mensagem Teste";
		message.body = "Olá, essa é uma mensagem de teste";

		message.messageSender = email;
		message.send();

		message.messageSender = queue;
		message.send();

		message.messageSender = web;
		message.send();

		var userMessage = new UserMessage();
		userMessage.subject = "Mensagem Teste";
		userMessage.body = "Olá, essa é uma mensagem de teste";
		userMessage.userComments = "Espero que você esteja bem";
		userMessage.messageSender = email;
		userMessage.send();
	}

}
