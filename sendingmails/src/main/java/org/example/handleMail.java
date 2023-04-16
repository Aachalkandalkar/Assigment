package org.example;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.net.PasswordAuthentication;
import java.util.Properties;

public class handleMail<MessagingException> {

    void sendMail(){

    //<MimeMessage> void sendAttachments() {
        //host : gmail in smpt :

        String host = "smpt.gmail.com";

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


        Session mailSession = Session.getInstance(prop , new mailAuthenticator());

        //create message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);

        try {
            //sender
            mimeMessage.setFrom(mailConstants.SENDER);

            //receiver
            mimeMessage.setRecipient(Message.RecipientType.To, new InternetAddress(mailConstants.));

           //subject
            mimeMessage.setSubject(mailConstants.SUBJECT);

            mimeMessage.setText(mailConstants.MESSAGE);

            Transport.send(mimeMessage);

        }catch (MessagingException e){
            e.printStackTrace();
        }

    }


}
