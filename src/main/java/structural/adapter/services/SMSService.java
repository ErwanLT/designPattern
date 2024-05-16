package structural.adapter.services;

public interface SMSService {
    void sendSMS(String phoneNumber, String message);
}
