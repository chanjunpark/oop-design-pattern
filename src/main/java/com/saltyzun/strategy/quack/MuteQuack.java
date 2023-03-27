package com.saltyzun.strategy.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("--mute--");
    }
}
