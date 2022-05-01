import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class JavaEmailImplementation{

    public void sendEmail(){

        final String username = "achyuth.varma1@gmail.com";

        final String password = "egwtkkswbqgnfrro";


        Properties prop = new Properties();

        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");


//        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try{

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("yaramalahemanthreddy@gmail.com")
            );
            message.setSubject("Test Email From Java");
            message.setText("" +
                    "<h1> AED </h1>" +
                    "\n ");

            Transport.send(message);

            System.out.println("Done");

        }
        catch (MessagingException e){
            e.printStackTrace();
        }

    }

    public void sendEmail(String sendTo, String message){

        final String username = "achyuth.varma1@gmail.com";

        final String password = "egwtkkswbqgnfrro";


        Properties prop = new Properties();

        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");


        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try{

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(sendTo)
            );
            message.setSubject("Test Email From Java");
            message.setText("" +
                    "<h1> "+message+" </h1>" +
                    "\n ");

            Transport.send(message);

            System.out.println("Done Sending Email");

        }
        catch (MessagingException e){
            e.printStackTrace();
        }

    }

}
