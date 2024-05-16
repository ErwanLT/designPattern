package structural.adapter.services.impl;

import structural.adapter.services.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Sending Email to " + emailAddress + " (Subject: " + subject + "): " + body);
    }
}
