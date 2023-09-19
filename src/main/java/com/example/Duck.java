package com.example;

public class Duck
{
    FlyBehaviors flyBehavior;
    QuarkBehaviors quarkBehavior;

    public void PerformFly() {
        flyBehavior.fly();
    }
    public void PerformQuark() {
        quarkBehavior.quark();
    }
    public void setFlyBehavior(FlyBehaviors fb) {
        flyBehavior = fb;
    }
    public void setQuarkBehavior(QuarkBehaviors qb) {
        quarkBehavior = qb;
    }
}
