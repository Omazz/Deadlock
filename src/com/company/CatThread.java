package com.company;

public class CatThread extends Thread{
    private Cat cat;
    public CatThread(Cat cat) {
        this.cat = cat;
    }
    public void run() {
        try {
            System.out.println(cat.getNameOwner());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
