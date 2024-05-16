package structural.adapter.adapt;

import structural.adapter.services.MessagingService;
import structural.adapter.services.SMSService;

public class SMSServiceAdapter implements MessagingService {
    private final SMSService smsService;

    public SMSServiceAdapter(SMSService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        smsService.sendSMS(recipient, message);
    }
}
