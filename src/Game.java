import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public Player playerOne = new Player();
    public Player playerTwo = new Player();

    public void run(){
        setUpInitialGameState();
        while (playerOne.lifeTotal != 0 && playerTwo.lifeTotal != 0){
            if (playerOne.playerTurn == true){
                while (playerOne.playerHand.size() != 0){
                    System.out.println("-------------------");
                    System.out.println("");
                    System.out.println("Your life total: " + playerOne.lifeTotal);
                    System.out.println("Opponent's life total: " + playerTwo.lifeTotal);
                    System.out.println("");
                    System.out.println("-------------------");
                    System.out.println("");
                    System.out.println("Your hand: ");
                    for (int i = 0; i < playerOne.playerHand.size(); i++) {
                        System.out.println("");
                        System.out.println("Card index: " + i);
                        System.out.println("Name: " + playerOne.playerHand.get(i).name);
                        System.out.println("Cost: " + playerOne.playerHand.get(i).chiCost);
                        System.out.println("School: " + playerOne.playerHand.get(i).school);
                        System.out.println("Damage effect: " + playerOne.playerHand.get(i).getEffect().getDamage());
                        System.out.println("Damage effect: " + playerOne.playerHand.get(i).getEffect().getAbstractRandomNumberVariable());
                        System.out.println("");
                    }
                    System.out.print("Enter index of card you wish to play: ");
                    Scanner in = new Scanner(System.in);
                    int value;
                    int chosenCard = 0;
                    while (in.hasNextInt()){
                        value = in.nextInt();
                        if (value < 0 || value > playerOne.playerHand.size()-1){
                            System.out.print("Value must be between 0 and " + (playerOne.playerHand.size()-1) + ", try again: ");
                        }
                        else{
                            chosenCard = value;
                            break;
                        }
                    }
                    Card playedCard = playerOne.playCard(chosenCard);
                    System.out.println("played Card effect damage amount: " + playedCard.name);
                }
                changeTurn(playerTwo, playerOne);
            }else{
                while (playerTwo.playerHand.size() != 0) {
                    System.out.println("");
                    System.out.println("Opponent is playing!");
                    System.out.println("");

                }
                changeTurn(playerOne, playerTwo);
            }
        }
        if(playerOne.lifeTotal == 0){
            System.out.println("Player Two wins!");
        }
        if(playerTwo.lifeTotal == 0){
            System.out.println("Player One wins!");
        }
    }

    public void setUpInitialGameState(){
        playerOne.lifeTotal = 50;
        playerTwo.lifeTotal = 50;
        playerOne.playerTurn = true;
        playerTwo.playerTurn = false;

        List<Card> library = new ArrayList<>();
        library.add(new Card("Punch", new DamageEffect(5), 2, "Bear"));
        library.add(new Card("Kill", new DamageEffect(10), 6, "Tiger"));
        library.add(new Card("Fling", new DamageEffect(1), 1, "Crane"));
        library.add(new Card("Kick", new DamageEffect(3), 1, "Crane"));
        library.add(new Card("Headbutt", new DamageEffect(8), 4, "Tiger"));

        playerOne.populateLibrary(library);

        for(int i = 0; i < 5; i++){
            playerOne.drawCardFromLibrary();
        }
    }

    public boolean isValidInput(int index){
        if (index < 0 || index > 5){
            return false;
        }
        else
            return true;
    }

    public void changeTurn(Player newActivePlayer, Player unactivePlayer){
        System.out.println("It is now " + newActivePlayer + "'s turn!");
        newActivePlayer.playerTurn = true;
        unactivePlayer.playerTurn = false;

    }



}
