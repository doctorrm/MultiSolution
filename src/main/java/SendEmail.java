import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @Author doctorrm
 * @Time 2017-08-30 ����2:45:15
 */
public class SendEmail {
	/**
	 * send email with the new password,change the content with particular
	 * situation.
	 * 
	 * @param targetMail
	 * @param newPassword
	 */
	public static void sendEmailWithPwd(String targetMail, String newPassword) {
		try {
			String from = "13710638629@163.com";
			String host = "localhost";
			String server = "smtp.163.com";
			final String username = "13710638629";// �û������������ǰ��Ĳ���
			final String password = "yudewy814"; // ���ʾ������Ȩ�룬����������
			// ��properties�����ã�Ȼ����properties�õ�session
			Properties properties = System.getProperties();
			properties.setProperty("mail.smtp.host", host);
			properties.setProperty("mail.transport.protocol", "smtp");
			properties.setProperty("mail.smtp.auth", "true");

			Session session = Session.getInstance(properties);// session����һ����
			properties.setProperty("mail.debug", "true");// ����debugģʽ
															// ��̨����ʼ����͵Ĺ���
			session.setDebug(true);// debugģʽ
			// ��session�õ�Message����Message����Ҫ���͵����ݣ�
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(targetMail));
			message.setSubject("�һ�����");// �ʼ�������
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ,��ʽ�д�Сд��������ģ�Ҫע��
			message.setText("���ã�����" + df.format(new Date()) + "ͨ��ע�������һ����룬���������������£�" + newPassword + "�������Ʊ��ܣ�����й©��");// �����ı�

			// ��session�õ�Transport��
			Transport transport = session.getTransport("smtp");
			transport.connect(server, username, password);
			transport.sendMessage(message, new Address[] { new InternetAddress(targetMail) });
			transport.close();
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
