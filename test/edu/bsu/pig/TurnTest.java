package edu.bsu.pig;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void getScore_startsAtZero() {
        Turn turn = new Turn(new FixedValueDie(3));
        Assert.assertEquals(0, turn.getScore());
    }

    @Test
    public void textRoll_modifiesScoreByRollAmount() {
        Turn turn = new Turn(new FixedValueDie(3));
        turn.roll();
        Assert.assertEquals(3, turn.getScore());
    }
}
