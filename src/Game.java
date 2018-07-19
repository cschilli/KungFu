import java.util.ArrayList;

public class Game {

    public void run(){
        setUpInitialGameState();
    }

    public void setUpInitialGameState(){
        Player playerOne = new Player();
        Player playerTwo = new Player();
        ArrayList<Card> beginningHand = new ArrayList<>();
        beginningHand.add(new Card("Punch", new DamageEffect(playerTwo, 5), 2, "Bear"));
        beginningHand.add(new Card("Kick", new DamageEffect(playerTwo, 3), 1, "Crane"));
        beginningHand.add(new Card("Headbutt", new DamageEffect(playerTwo, 8), 4, "Tiger"));
        playerOne.changePlayerHand(beginningHand);
        playerTwo.changePlayerHand(beginningHand);

        for (int i = 0; i < playerOne.playerHand.size(); i++){
            System.out.println("playerOneHand: " + playerOne.playerHand.get(i).name);
            System.out.println("playerOneHand: " + playerOne.playerHand.get(i).damageEffect);
            System.out.println("playerOneHand: " + playerOne.playerHand.get(i).school);
            System.out.println("playerOneHand: " + playerOne.playerHand.get(i).chiCost);
        }

        for (int i = 0; i < playerTwo.playerHand.size(); i++) {
            System.out.println("playerTwoHand: " + playerOne.playerHand.get(i).name);
            System.out.println("playerTwoHand: " + playerOne.playerHand.get(i).damageEffect);
            System.out.println("playerTwoHand: " + playerOne.playerHand.get(i).school);
            System.out.println("playerTwoHand: " + playerOne.playerHand.get(i).chiCost);
        }
    }

}
