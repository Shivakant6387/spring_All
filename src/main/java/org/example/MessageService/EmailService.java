package org.example.MessageService;

public class EmailService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email send to"+rec+"With message"+msg);
        return true;
    }
}
