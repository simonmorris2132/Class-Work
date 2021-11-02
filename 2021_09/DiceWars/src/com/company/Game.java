/* This class is where all the mechanics of the game lie. every other class is used in this class to make the game work. */


package DiceWars.src.com.company;

import java.util.ArrayList;

@SuppressWarnings("all")

public class Game {

    ArrayList<Player> players = new ArrayList<Player>();
    private int numRounds;
    private int numDice;
    private int numPeople;

    public void startGame(int numRounds, int numDice, int players) {
        this.numPeople = players;
        this.numDice = numDice;
        this.numRounds = numRounds;


    }


}