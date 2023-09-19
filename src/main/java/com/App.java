package com;

import com.example.Duck;
import com.example.FlyWithWings;
import com.example.Quark;

public class App {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuarkBehavior(new Quark());
        duck.PerformFly();
        duck.PerformQuark();
    }
}
