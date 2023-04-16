package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class mailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication(){

        return new PasswordAuthentication(mailConstants.SENDER, "bjlihzcrnrbobrjg");

    }
}
