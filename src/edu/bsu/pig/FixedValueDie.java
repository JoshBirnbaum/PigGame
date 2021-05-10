package edu.bsu.pig;

public class FixedValueDie implements Die{

    private final int value;

    public FixedValueDie(int value) {
        this.value = value;
    }

    public int roll() {
        return value;
    }
}
