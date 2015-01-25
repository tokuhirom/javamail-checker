package me.geso.test_java_mail;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * This is a test mail sender utility for JavaMail.
 */
public class Main {
	public static void main(String[] args) throws UnknownHostException {
		if (args.length != 2) {
			String msg = "Usage: java -Dmail.smtp.host=localhost -jar test-java-mail-0.0.1-SNAPSHOT.jar from@example.com to@example.com";
			System.out.println(msg);
			return;
		}

		String from = args[0];
		String to = args[1];

		Properties properties = System.getProperties();
		Session session = Session.getDefaultInstance(properties);

		String DATE_FORMAT = "YYYY-MM-DD'T'hh:mm:ss.ssZ";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String now = sdf.format(new Date());
		String text = String.format(
				"This is a test message from %s at %s.",
				InetAddress.getLocalHost().getHostName(),
				now
				);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(to));
			message.setSubject("Test");
			message.setText(text);
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
