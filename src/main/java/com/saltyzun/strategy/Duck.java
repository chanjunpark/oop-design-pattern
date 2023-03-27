package com.saltyzun.strategy;

import com.saltyzun.strategy.fly.FlyBehavior;
import com.saltyzun.strategy.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }

    void display() {

    }

    void performQuack(){
        quackBehavior.quack(); // 행동을 담당하는 클래스에 위임
    }

    void performFly() {
        flyBehavior.fly(); // 행동을 담당하는 클래스에 위임
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
