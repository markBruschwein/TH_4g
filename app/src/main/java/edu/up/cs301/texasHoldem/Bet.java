package edu.up.cs301.texasHoldem;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.config.GameConfig;

/**
 * Bet action class
 * This class will tell the game when the user has bet in any form
 *
 * @author Mark Bruschwein
 * @author Luke McManamon
 * @author Hugh McGlynn
 *
 * @version 3/30/2016.
 */
public class Bet extends GameAction {
    private boolean bet = false;
    private boolean call = false;
    private boolean check = false;
    private boolean fold = false;


    /**
     *  Constructor for the bet class
     *
     * @param player
     */
    public Bet(GamePlayer player){

        super(player);
    }


    /*
     * Tells the game that the user has placed a bet of their amount of choice
     */
    public boolean isBet(GamePlayer player) {
        return true;
    }
    /*
     * Tells the game that the user has called the bet (agreed to match the others' bets to stay in the round)
     */
    public boolean isCall(GamePlayer player) {
        return true;
    }
    /*
     * Tells the game that the user has checked (not placed a bet)
     */
    public boolean isCheck(GamePlayer player) {
        return true;
    }
    /*
     * Tells the game that the user has folded (conceded for the current round)
     */
    public boolean isFold(GamePlayer player) {
        return true;
    }
     public void setCall(boolean call) {
        this.call = call;
    }

    public void setBet(boolean bet) {
        this.bet = bet;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setFold(boolean fold) {
        this.fold = fold;
    }
}
