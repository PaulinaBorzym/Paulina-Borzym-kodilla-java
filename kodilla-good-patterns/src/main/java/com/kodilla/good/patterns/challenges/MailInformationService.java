package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Send confirmations.");
    }
}
