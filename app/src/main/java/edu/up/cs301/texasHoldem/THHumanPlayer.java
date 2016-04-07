package edu.up.cs301.texasHoldem;

import android.widget.TextView;

import edu.up.cs301.game.GameMainActivity;
import edu.up.cs301.game.infoMsg.GameInfo;

/**
 * This class will update the Human Player GUI and allow the player to make moves in gameplay
 *
 * @author Mark Bruschwein
 * @author Luke McManamon
 * @author Hugh McGlynn
 *
 * @version 3/30/2016.
 */
public class THHumanPlayer {


    THState state; // Current state that the GUI will use to update
    GameMainActivity activity;  // Will be used to know the current activity
    TextView playerMoney;
    player playerInfo;

    /**
     * The THHuman Player constructor that creates all the instance variables
     */
    public THHumanPlayer(){

    }

    /**
     * This method will recieve new info about the game being updated
     */
    public void receiveInfo(GameInfo gameInfo){

    }

    /**
     * this method will take into account the current activity and update the GUi accordingly
     */
    public void setAsGui(GameMainActivity mainActivity){

    }

    /**
     * This method will update the gui display based on canges in the gaemState
     */
    public void updateDisplay()
    {

    }

    /**
     * This method will handle the event that the buttons on the Gui are clicked
     */
    public void onClick() {

    }

    public TextView getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(TextView playerMoney) {
        this.playerMoney = playerMoney;
    }

    public GameMainActivity getActivity() {
        return activity;
    }

    public void setActivity(GameMainActivity activity) {
        this.activity = activity;
    }

    public THState getState() {
        return state;
    }

    public void setState(THState state) {
        this.state = state;
    }
}
