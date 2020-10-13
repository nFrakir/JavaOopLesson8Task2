package com.gmail.seliverstova.hanna;

public class Human {
    private String name;

    public Human(String name) {
        super();
        this.name = name;
    }

    public Human() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + "]";
    }
}
