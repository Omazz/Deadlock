package com.company;

public class Cat {
    private Owner owner;
    private String name;
    public Cat() {
        name = "Asya";
        owner = null;
    }
    public Cat(String name) {
        this.name = name;
        owner = null;
    }
    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }
    public synchronized String getNameOwner() throws InterruptedException {
        Thread.sleep(1000);
        return(owner.getName());
    }
    public synchronized String getName()
    {
        return("Asya");
    }
}
