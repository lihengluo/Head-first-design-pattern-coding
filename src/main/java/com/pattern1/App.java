package com.pattern1;

public class App {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuarkBehavior(new Quark());
        duck.PerformFly();
        duck.PerformQuark();
    }
}
