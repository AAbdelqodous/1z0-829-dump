package com.abdelqodous.qa1z0_829.q43;

public class Game extends Software{
    private int players;

    public Game(String title, int players){
        super(title);
        this.players = players;
        System.out.print("Game ");
    }

    @Override
    public String toString() {
        return super.toString() + " " + players ;
    }
}
