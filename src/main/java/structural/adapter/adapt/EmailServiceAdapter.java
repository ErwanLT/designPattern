package structural.adapter.adapt;

import structural.adapter.services.EmailService;
import structural.adapter.services.MessagingService;

public class EmailServiceAdapter implements MessagingService {
    private final EmailService emailService;

    public EmailServiceAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        String subject = "";
        emailService.sendEmail(recipient, subject, message);
    }
}
