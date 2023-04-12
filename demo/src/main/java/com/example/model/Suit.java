package com.example.model;

public class Suit {
    public Suit(String color, Mask mask, Hook hook) {
        this.color = color;
        this.mask = mask;
        this.hook = hook;
    }

    private String color;
    private Mask mask;
    private Hook hook;
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Mask getMask() {
        return mask;
    }
    public void setMask(Mask mask) {
        this.mask = mask;
    }
    public Hook getHook() {
        return hook;
    }
    public void setHook(Hook hook) {
        this.hook = hook;
    }
}
