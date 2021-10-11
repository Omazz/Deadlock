package com.company;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Owner owner = new Owner();
        cat.setOwner(owner);
        owner.setCat(cat);
        CatThread catThread = new CatThread(cat);
        OwnerThread ownerThread = new OwnerThread(owner);
        catThread.start();
        ownerThread.start();
    }
}
