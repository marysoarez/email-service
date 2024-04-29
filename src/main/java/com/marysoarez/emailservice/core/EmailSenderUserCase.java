package com.marysoarez.emailservice.core;


//contrato que define o comportamento da aplicação
public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
