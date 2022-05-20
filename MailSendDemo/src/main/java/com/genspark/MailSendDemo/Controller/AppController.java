package com.genspark.MailSendDemo.Controller;

import com.genspark.MailSendDemo.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private EmailSenderService senderService;

    @GetMapping("/sendMail")
    public void sendEmail()
    {
        senderService.sendEmail("ncerros18@gmail.com", "Test Mail", "Hello World");
    }
}
