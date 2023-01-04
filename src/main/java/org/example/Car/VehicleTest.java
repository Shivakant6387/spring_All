package org.example.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("vehicleconfig.xml");
        AllVehicle allVehicle= (AllVehicle) context.getBean("myvehicle");
        allVehicle.vehicleShow();
    }
}
