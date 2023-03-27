package com.saltyzun.strategy;

import com.saltyzun.strategy.fly.FlyWithWings;
import com.saltyzun.strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("물오리 입니다.");
    }
}
