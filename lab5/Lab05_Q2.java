package lab5;

import java.util.Random;

public class Lab05_Q2 {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Starting the game with the following deck:");

    // Build Deck
        String deck = "";
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 4; j++) {
                if ( i == 10) {
                    deck += 'T';
                }
                else if ( i == 11) {
                    deck += 'J';
                }
                else if ( i == 12) {
                    deck += 'Q';
                }
                else{
                    deck += (char)(i + '0');
                }
            }
            for (int k = 1; k <= 3; k++) {
                if (i == 12) {
                    deck += 'K';
                }
            }
        }
        System.out.println(deck);
        System.out.println();

    // Initailing Cards

        String temp_deck = deck;
        System.out.println("Initial cards are dealing...");

        // Players Decks
        String player1_hand = "";
        String player2_hand = "";

        // Select random player
        int random_player = random.nextInt(3);

        // card amount
        int card_amount = 51;

        // if player 1 has choosen
        if (random_player == 1) {

            // allign 26 cards for player 1
            for (int i = 1; i <= 26; i++) {
                int random_1 = random.nextInt(card_amount);

                // choose random card 
                player1_hand += temp_deck.charAt(random_1);

                // delete selected card
                temp_deck = temp_deck.substring(0, random_1) + temp_deck.substring(random_1 + 1);

                // decrement amount
                card_amount--;                
            }

            // allign 25 cards for player 2
            for (int i = 1; i <= 25; i++){
                int random_2 = random.nextInt(card_amount);

                // choose random card
                player2_hand += temp_deck.charAt(random_2);

                // delete selected card
                temp_deck = temp_deck.substring(0, random_2) + temp_deck.substring(random_2 + 1);

                // decrement card amount
                card_amount--;
            }
        }

        // If player 2 has chosen
        else{

            // allign 25 cards for player 1
            for (int i = 1; i <= 25; i++) {           
                int random_1 = random.nextInt(card_amount);

                // choose random card
                player1_hand += temp_deck.charAt(random_1);

                // delete selected card
                temp_deck = temp_deck.substring(0, random_1) + temp_deck.substring(random_1 + 1);

                // decrement card amount
                card_amount--;                
            }

            // allign 26 cards for player 2
            for (int i = 1; i <= 26; i++){
                int random_2 = random.nextInt(card_amount);

                // choose random card
                player2_hand += temp_deck.charAt(random_2);

                // delete selected card
                temp_deck = temp_deck.substring(0, random_2) + temp_deck.substring(random_2 + 1);

                // decrement card amount
                card_amount--;
            }
        }

        System.out.println("Player-1 hand: " + player1_hand);
        System.out.println("Player-2 hand: " + player2_hand);
        System.out.println();

    // Remove pairs from player decks
        System.out.println("Pairs are removed: ");

        // Remove pairs of player 1's hand
        // Start for the end of the string and chek with the one greater
        for (int i = player1_hand.length() - 2; i >= 0; i--) {
            for (int j = i + 1 ; j < player1_hand.length(); j++) {

                // If there is match remove
                if (player1_hand.charAt(i) == player1_hand.charAt(j)) {
                    player1_hand = player1_hand.substring(0, i) + player1_hand.substring(i + 1, j) + player1_hand.substring(j+1);
                }
            }
        }

        // Remove pairs of player 2's hand
        // Start for the end of the string and chek with the one greater
        for (int i = player2_hand.length() - 2; i >= 0; i--) {
            for (int j = i + 1 ; j < player2_hand.length(); j++) {

                // If there is match remove
                if (player2_hand.charAt(i) == player2_hand.charAt(j)) {
                    player2_hand = player2_hand.substring(0, i) + player2_hand.substring(i + 1, j) + player2_hand.substring(j+1);
                }
            }
        }

        System.out.println("Player-1 hand: " + player1_hand);
        System.out.println("Player-2 hand: " + player2_hand);
        System.out.println();
        
    // Start Drawing
        int random_card;
        char draw_card;

        do {
            System.out.println("Start Drawing");

            // If player 1 has more cards
            if(random_player == 1){

                if  (player1_hand.length() != 0 && player2_hand.length() != 0){

                    // Player 2 chooses card form playe1_hand
                    random_card = random.nextInt(player1_hand.length());
                    draw_card = player1_hand.charAt(random_card);
                    player2_hand += draw_card;
                    player1_hand = player1_hand.substring(0, random_card) + player1_hand.substring(random_card + 1);
                    System.out.println("Player-2 is drawing the card: " + draw_card + " from player-1...");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();

                    // player2_hand gets updated
                    for (int i = player2_hand.length() - 2; i >= 0; i--) {
                        for (int j = i + 1 ; j < player2_hand.length(); j++) {
            
                            // If there is match remove
                            if (player2_hand.charAt(i) == player2_hand.charAt(j)) {
                                player2_hand = player2_hand.substring(0, i) + player2_hand.substring(i + 1, j) + player2_hand.substring(j+1);
                            }
                        }
                    }
                    System.out.println("Pairs are removed: ");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();
                }


                if (player1_hand.length() != 0 && player2_hand.length() != 0){

                    // player 1 chooses card form playe2_hand
                    random_card = random.nextInt(player2_hand.length());
                    draw_card = player2_hand.charAt(random_card);
                    player1_hand += draw_card;
                    player2_hand = player2_hand.substring(0, random_card) + player2_hand.substring(random_card + 1);
                    System.out.println("Player-1 is drawing the card: " + draw_card + " from player-2...");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();

                    // player1_hand gets updated
                    for (int i = player1_hand.length() - 2; i >= 0; i--) {
                        for (int j = i + 1 ; j < player1_hand.length(); j++) {
            
                            // If there is match remove
                            if (player1_hand.charAt(i) == player1_hand.charAt(j)) {
                                player1_hand = player1_hand.substring(0, i) + player1_hand.substring(i + 1, j) + player1_hand.substring(j+1);
                            }
                        }
                    }
                    System.out.println("Pairs are removed: ");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();
                }
            }

            else {
                if (player1_hand.length() != 0 && player2_hand.length() != 0){

                    // player 1 chooses card form playe2_hand
                    random_card = random.nextInt(player2_hand.length());
                    draw_card = player2_hand.charAt(random_card);
                    player1_hand += draw_card;
                    player2_hand = player2_hand.substring(0, random_card) + player2_hand.substring(random_card + 1);
                    System.out.println("Player-1 is drawing the card: " + draw_card + " from player-2...");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();

                    // player1_hand gets updated
                    for (int i = player1_hand.length() - 2; i >= 0; i--) {
                        for (int j = i + 1 ; j < player1_hand.length(); j++) {
            
                            // If there is match remove
                            if (player1_hand.charAt(i) == player1_hand.charAt(j)) {
                                player1_hand = player1_hand.substring(0, i) + player1_hand.substring(i + 1, j) + player1_hand.substring(j+1);
                            }
                        }
                    }
                    System.out.println("Pairs are removed: ");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();
                }

                if (player1_hand.length() != 0 && player2_hand.length() != 0){

                    // Player 2 chooses card form player1_hand
                    random_card = random.nextInt(player1_hand.length());
                    draw_card = player1_hand.charAt(random_card);
                    player2_hand += draw_card;
                    player1_hand = player1_hand.substring(0, random_card) + player1_hand.substring(random_card + 1);
                    System.out.println("Player-2 is drawing the card: " + draw_card + " from player-1...");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();

                    // player2_hand gets updated
                    for (int i = player2_hand.length() - 2; i >= 0; i--) {
                        for (int j = i + 1 ; j < player2_hand.length(); j++) {
            
                            // If there is match remove
                            if (player2_hand.charAt(i) == player2_hand.charAt(j)) {
                                player2_hand = player2_hand.substring(0, i) + player2_hand.substring(i + 1, j) + player2_hand.substring(j+1);
                            }
                        }
                    }
                    System.out.println("Pairs are removed: ");
                    System.out.println("\t Player-1 hand: " + player1_hand);
                    System.out.println("\t Player-2 hand: " + player2_hand);
                    System.out.println();
                }
            }

        }while(player1_hand.length() != 0 && player2_hand.length() != 0);

        if (player1_hand.length() == 0) {
            System.out.println("Game Over!");
            System.out.println("Player-1 Wins!");
            System.out.println("\t Player-1 hand: " + player1_hand);
            System.out.println("\t Player-2 hand: " + player2_hand);

        }
        else if (player2_hand.length() == 0) {
            System.out.println("Game Over!");
            System.out.println("Player-2 Wins!");
            System.out.println("\t Player-1 hand: " + player1_hand);
            System.out.println("\t Player-2 hand: " + player2_hand);             
        }    
    }
}
