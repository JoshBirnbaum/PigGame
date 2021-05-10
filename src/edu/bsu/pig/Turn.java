package edu.bsu.pig;

public class Turn {

    private static final int BUST_ROLL = 1;
    private Player player;
    private Die die;
    private int score = 0;
    private boolean isOver = false;
    
    public Turn(Die die, Player player) {
        this.die = die;
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public int roll() {
        int roll = die.roll();
        if (roll == BUST_ROLL) {
            score = 0;
            isOver = true;
        }
        else {
            score += roll;
        }
        return roll;
    }

    void setScore(int score) {
        this.score = score;
    }

    public void end() {
        this.player.setScore(player.getScore() + this.score);
        this.isOver = true;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isOver() {
        return isOver;
    }
}
