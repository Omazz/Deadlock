package com.company;

public class Owner {
    private Cat cat;
    private String name;
    public Owner() {
        name = "Leonid";
        cat = null;
    }
    public void setCat(Cat cat)
    {
        this.cat = cat;
    }
    public Owner(String name) {
        this.name = name;
        this.cat = null;
    }
    public synchronized String getNameCat() throws InterruptedException {
        Thread.sleep(1000);
        return cat.getName();
    }
    public synchronized String getName()
    {
        return this.name;
    }
}
