package com.medilab.sms;

import com.medilab.model.Appointment;

public interface SmsSender {

    void sendSms(Appointment appointment);

    // or maybe void sendSms(String phoneNumber, String message);
}
