package org.example.singleton;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientBean2 {
    @Autowired
    private ServiceBean serviceBean;
    public void doSomething(){
        System.out.println("from clientBean2 :Service"+System.identityHashCode(serviceBean));
    }
}
