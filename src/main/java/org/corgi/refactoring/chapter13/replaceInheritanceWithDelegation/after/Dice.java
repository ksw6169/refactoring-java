package org.corgi.refactoring.chapter13.replaceInheritanceWithDelegation.after;

import java.util.Random;

public class Dice {

    private final Random random;

    // 중복 코드를 줄이기 위한 생성자 연쇄(Chain Constructors) 기법
    public Dice() {
        this(345459L);
    }

    public Dice(long seed) {
        this.random = new Random(seed);
    }

    public int nextInt() {
        return random.nextInt(6)+1;
    }

    public void setSeed(long seed) {
        this.random.setSeed(seed);
    }
}
