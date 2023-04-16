package org.example;

import java.sql.SQLOutput;

public class Main {
    public static  void main(String[] args) {

       // prepare to send mail
        System.out.println("This application is supposed to send mails");

        //message to be sent is the body
//        String message = "This message is for security check";
//        System.out.println(message);



        //reciever mail
        //String receiverMail = "aachalkandalkar29@gmail.com";

        //sender mail
       // String senderMail = "aachalkandalkar12@gmail.com";



       handleMail mailer = new handleMail();
          mailer.sendMail();
    }
}