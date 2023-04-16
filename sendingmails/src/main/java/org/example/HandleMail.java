package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HandleMail {

    void sendMail() {

    //<MimeMessage> void sendAttachments() {
        //host : gmail in smpt :

        String host = "smtp.gmail.com";

        Properties prop = System.getProperties();

        System.out.println(prop);

        prop.setProperty("mail.smtp.host",host);
        prop.setProperty("mail.smtp.port","465");
        prop.setProperty("mail.smtp.ssl.enable","true");
        prop.setProperty("mail.smtp.auth","true");

        //session
//        Authenticator suthenticator = getPassAuthentication() {
//            return new PasswordAuthentication("aacalkandalkar12@gmail.com","Aachal");
//
//        };


        Session mailSession = Session.getInstance(prop , new MailAuthenticator());

        //create message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);


        try {
            //sender
            mimeMessage.setFrom(MailConstants.SENDER);

            //receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVERMAILADDRESS));

            //subject
            mimeMessage.setSubject(MailConstants.SUBJECT);

            mimeMessage.setText(MailConstants.MESSAGE);

            Transport.send(mimeMessage);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
