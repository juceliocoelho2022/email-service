package com.jucelio.emailservice.application;

import com.jucelio.emailservice.adapters.EmailSenderGateway;
import com.jucelio.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
;
    }

    @Override
    public void senEmail(String to, String subject, String body) {
   this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
