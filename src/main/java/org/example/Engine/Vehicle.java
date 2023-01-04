package org.example.Engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
    IEngine engine;
    Tyres tyre;

    public Tyres getTyre()
    {
        return tyre;
    }

    public void setTyre(Tyres tyre)
    {
        System.out.println("tyre instantiated via setter");
        this.tyre = tyre;
    }

    public Vehicle(IEngine engine, Tyres tyre)
    {
        System.out.println("instantiated via constructor");
        this.engine = engine;
        this.tyre = tyre;
    }

    public Vehicle() {}
    public IEngine getEngine()
    {

        return engine;
    }
    public void setEngine(IEngine engine)
    {
        System.out.println("instantiated via setter");
        this.engine = engine;
    }

    @Override
    public String toString()
    {
        return engine + " " + tyre;
    }


}