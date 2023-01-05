package org.example.MessageService;

public class TwitterService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message sent to"+rec+"with Message ="+msg);
        return true;
    }
}
