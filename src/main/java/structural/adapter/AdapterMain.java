package structural.adapter;


import structural.adapter.adapt.EmailServiceAdapter;
import structural.adapter.adapt.SMSServiceAdapter;
import structural.adapter.services.EmailService;
import structural.adapter.services.MessagingService;
import structural.adapter.services.SMSService;
import structural.adapter.services.impl.EmailServiceImpl;
import structural.adapter.services.impl.SMSServiceImpl;

public class AdapterMain {

    public static void main(String[] args) {
        SMSService smsService = new SMSServiceImpl();
        EmailService emailService = new EmailServiceImpl();

        MessagingService smsAdapter = new SMSServiceAdapter(smsService);
        MessagingService emailAdapter = new EmailServiceAdapter(emailService);

        smsAdapter.sendMessage("+1234567890", "Hello from SMS Adapter");
        emailAdapter.sendMessage("user@example.com", "Hello from Email Adapter");
    }
}
