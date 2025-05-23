
import java.util.*;

public class nishthagame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player please enter your name: ");
        String pname = sc.nextLine();

        System.out.print("Dealer please enter your name: ");
        String dname = sc.nextLine();

        System.out.println();

        System.out.println("-------------------------");

        System.out.println();

        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> deck = new ArrayList<>();
        for (int card : cards) {
            deck.add(card);
        }
        Collections.shuffle(deck);

        int index = 0;
        int playerCard = deck.get(index++);
        int dealerCard = deck.get(index++);
        int playerCoin = 1, dealerCoin = 1;
        int turn = 0; // 0 = player, 1 = dealer
        boolean playerDone = false, dealerDone = false;
        int win = 0;
        char choice;

        while (true) {
            if (turn == 0 && !playerDone) {
                System.out.println(pname + "'s turn. Current total: " + playerCard);
                System.out.print("Draw a card? (Y/N): ");
                choice = sc.next().charAt(0);

                if (choice == 'Y') {
                    int card = deck.get(index++);
                    playerCard += card;
                    playerCoin++;
                    System.out.println("You drew: " + card + " | Total: " + playerCard);
                    System.out.println();

                    if (playerCard == 21) {
                        playerCoin += dealerCoin;
                        dealerCoin = 0;
                        win = 1;
                        break;
                    } else if (playerCard > 21) {
                        System.out.println("Burst !!!");
                        dealerCoin += playerCoin;
                        playerCoin = 0;
                        win = 2; // Dealer wins
                        break;
                    }
                } else {
                    playerDone = true;
                    turn = 1;
                    System.out.println("---------------------------------");
                }
            } else if (turn == 1 && !dealerDone) {
                System.out.println();
                System.out.println(dname + "'s turn. Current total: " + dealerCard);
                System.out.print("Dealer, draw a card? (Y/N): ");
                choice = sc.next().charAt(0);

                if (choice == 'Y') {
                    int card = deck.get(index++);
                    dealerCard += card;
                    dealerCoin++;
                    System.out.println("You drew: " + card + " | Total: " + dealerCard);
                    System.out.println();

                    if (playerCard == 21) {
                        dealerCoin += playerCoin;
                        playerCoin = 0;
                        win = 2;
                        break;
                    } else if (dealerCard > 21) {
                        System.out.println("Burst !!!");
                        playerCoin += dealerCoin;
                        dealerCoin = 0;
                        win = 1; // Player wins
                        break;
                    }
                } else {
                    dealerDone = true;
                    turn = 0;
                }
            } else if (playerDone && dealerDone) {
                break;
            } else {
                turn = 1 - turn; // switch turn
            }
        }

        System.out.println("\n--- Final Scores ---");
        System.out.println(pname + ": " + playerCard + " | Coins: " + playerCoin);
        System.out.println(dname + ": " + dealerCard + " | Coins: " + dealerCoin);
        System.out.println();

        if (win == 1 || (playerCard <= 21 && dealerCard > 21)) {
            System.out.println(pname + " wins!");
        } else if (win == 2 || (dealerCard <= 21 && playerCard > 21)) {
            System.out.println(dname + " wins!");
        } else if (playerCard > dealerCard) {
            System.out.println(pname + " wins!");
        } else if (dealerCard > playerCard) {
            System.out.println(dname + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
