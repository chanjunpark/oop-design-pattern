package com.saltyzun.strategy.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날지 못 합니다.");
    }
}
