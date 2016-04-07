package edu.up.cs301.texasHoldem;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;

/**
 * This class will update the GameState and send it to the players
 *
 * @author Mark Bruschwein
 * @author Hugh McGlynn
 * @author Luke McManamon
 *
 * @version 3/30/2016.
 */
public class THLocalGame extends LocalGame {

    THState currentState; // the game state that will be updated

    /**
     * constructor for THLocal Game
     *  creates a Local game with a new currentState
     *
     */
    public THLocalGame(){
        currentState = new THState();
    }


    /**
     * Takes the THState and sends it to the specified player
     * @param p
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {


    }


    /**
     *  Determins if the specified player is allowed to make a move
     *
     */
    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }


    /**
     * Checks if the game is over, if so returns a message telling who won
     * @return
     */
    @Override
    protected String checkIfGameOver() {

        return null;
    }


    /**
     * Takes an action and updates the Game State accordingly if it is a legal move
     * @param action
     * 			The move that the player has sent to the game
     * @return
     */
    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}
