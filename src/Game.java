import java.util.ArrayList;

public class Game {

    public Player playerOne = new Player();
    public Player playerTwo = new Player();
    public Player activePlayer;
    public Player unactivePlayer;

    public void run(){
        setUpInitialGameState();
        while (playerOne.lifeTotal != 0 && playerTwo.lifeTotal != 0){
            while(activePlayer.playerHand.size() != 0){
                if (playerOne == activePlayer){
                    for (int i = 0; i < playerOne.playerHand.size(); i++){
                        System.out.println("Your hand: ");
                        System.out.println("");
                        System.out.println(playerOne.playerHand.get(i).name);
                    }

                }

            }
            changeTurn(unactivePlayer, activePlayer);
        }
        if(playerOne.lifeTotal == 0){
            System.out.println("Player Two wins!");
        }
        if(playerTwo.lifeTotal == 0){
            System.out.println("Player One wins!");
        }
    }

    public void setUpInitialGameState(){
        ArrayList<Card> beginningHand = new ArrayList<>();
        beginningHand.add(new Card("Punch", new DamageEffect(playerTwo, 5), 2, "Bear"));
        beginningHand.add(new Card("Kick", new DamageEffect(playerTwo, 3), 1, "Crane"));
        beginningHand.add(new Card("Headbutt", new DamageEffect(playerTwo, 8), 4, "Tiger"));
        playerOne.changePlayerHand(beginningHand);
        playerTwo.changePlayerHand(beginningHand);
        activePlayer = playerOne;
        unactivePlayer = playerTwo;
    }

    public void changeTurn(Player activePlayer, Player unactivePlayer){
        System.out.println("It is now " + activePlayer + "'s turn!");
        this.activePlayer = activePlayer;
        this.unactivePlayer = unactivePlayer;
    }



}
