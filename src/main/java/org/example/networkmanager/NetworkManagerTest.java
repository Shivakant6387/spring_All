package org.example.networkmanager;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.networkmanager.NetworkManager;
public class NetworkManagerTest {
    public static void main(String a[]){
        String confFile = "applicationconfig.xml";
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(confFile);
        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
        networkMng.readData();
        context.close();
    }
}
