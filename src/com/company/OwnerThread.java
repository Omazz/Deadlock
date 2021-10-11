package com.company;

public class OwnerThread extends Thread {
    private Owner owner;
    public OwnerThread(Owner owner)
    {
        this.owner = owner;
    }
    public void run() {
        try {
            System.out.println(owner.getNameCat());
        } catch (InterruptedException exception) {
          exception.printStackTrace();
        }
    }
}
