package structural.adapter.services;

public interface EmailService {
    void sendEmail(String emailAddress, String subject, String body);
}
