package io.zipcoder;

public class Cat extends Pet implements Comparable<Pet>{
    public Cat(String name) {
        super(name);
    }

    public String speak(){
        return "Meow";
    }
}
