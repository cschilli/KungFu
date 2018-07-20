import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Card> playerHand = new ArrayList<>();
    public List<Card> playerLibrary = new ArrayList<>();
    public List<Card> playerGraveyard  = new ArrayList<>();;
    public boolean playerTurn = false;
    public int lifeTotal = 50;
    public int chi = 0;

    public void populateLibrary(List<Card> playerLibrary){
        this.playerLibrary = playerLibrary;
    }

    public void drawCardFromLibrary(){
//        this.playerHand.add(this.playerLibrary.remove(0));
        Card drawnCard = this.playerLibrary.remove(0);
        this.playerHand.add(drawnCard);
    }

    public Card playCard(int indexOfCard){
        return this.playerHand.remove(indexOfCard);
    }

    public Player(){}

}
