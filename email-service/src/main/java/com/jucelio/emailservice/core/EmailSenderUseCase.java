package com.jucelio.emailservice.core;

public interface EmailSenderUseCase {

    void senEmail(String to, String subject, String body);
}
