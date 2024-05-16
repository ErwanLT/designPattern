package structural.adapter.services.impl;

import structural.adapter.services.SMSService;

public class SMSServiceImpl implements SMSService {
    @Override
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
