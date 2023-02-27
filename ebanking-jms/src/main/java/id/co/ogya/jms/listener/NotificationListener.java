package id.co.ogya.jms.listener;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "connectionFactoryJndiName", propertyValue = "jms.TrainingCF"),
		@ActivationConfigProperty(propertyName = "destinationJndiName", propertyValue = "jms.NotificationListener") }, mappedName = "jms.NotificationListener")
public class NotificationListener implements MessageListener {
	public void onMessage(Message message) {
		try {
			String messageInString = "";
			if (message instanceof TextMessage) {
				messageInString = ((TextMessage) message).getText();
			}
			String[] datas = messageInString.split(",", 8);
			for (String data : datas) {

				System.out.print(" <" + data + ">");
			}
		} catch (JMSException j) {
			System.err.print("Error :" + j.getMessage());
		}
	}
}
