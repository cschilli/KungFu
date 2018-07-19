import java.util.ArrayList;

public class Player {

    public ArrayList<Card> playerHand;
    public boolean playerTurn = false;
    public int lifeTotal = 50;
    public int chi = 0;

    public void changePlayerHand(ArrayList<Card> hand){
        playerHand = hand;
    }

    public Player(){
    }

}
