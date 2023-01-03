package org.example;

public class BeanAnimal {
    BeanAnimal(){}
    private Animal animal;
    public BeanAnimal(Animal animal){
        this.animal=animal;
    }
    public void shout(){
        animal.MakeNoise();
    }
}
