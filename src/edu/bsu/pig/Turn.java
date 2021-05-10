package edu.bsu.pig;

public class Turn {

    private Player player;
    private Die die;
    private int score = 0;
    
    public Turn(Die die, Player player) {
        this.die = die;
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public void roll() {
        score += die.roll();
    }

    void setScore(int score) {
        this.score = score;
    }

    public void end() {
        this.player.setScore(player.getScore() + this.score);
    }

    public Player getPlayer() {
        return player;
    }
}
