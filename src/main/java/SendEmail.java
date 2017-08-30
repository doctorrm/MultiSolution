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
 * @Time 2017-08-30 下午2:45:15
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
			final String username = "13710638629";// 用户名就是邮箱的前面的部分
			final String password = "yudewy814"; // 这表示的是授权码，而不是密码
			// 对properties的配置；然后由properties得到session
			Properties properties = System.getProperties();
			properties.setProperty("mail.smtp.host", host);
			properties.setProperty("mail.transport.protocol", "smtp");
			properties.setProperty("mail.smtp.auth", "true");

			Session session = Session.getInstance(properties);// session就是一座桥
			properties.setProperty("mail.debug", "true");// 设置debug模式
															// 后台输出邮件发送的过程
			session.setDebug(true);// debug模式
			// 由session得到Message并在Message放入要发送的内容；
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(targetMail));
			message.setSubject("找回密码");// 邮件的主题
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式,格式中大小写是有区别的，要注意
			message.setText("您好，您在" + df.format(new Date()) + "通过注册邮箱找回密码，现您的新密码如下：" + newPassword + "。请妥善保管，避免泄漏。");// 发送文本

			// 由session得到Transport；
			Transport transport = session.getTransport("smtp");
			transport.connect(server, username, password);
			transport.sendMessage(message, new Address[] { new InternetAddress(targetMail) });
			transport.close();
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
