import java.util.Scanner; // Import Scanner class for user input

public class DeckOfCards{

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" }; // Suits in a deck
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" }; // Ranks in a deck
        int numOfCards = suits.length * ranks.length; // Total number of cards in a deck
        String[] deck = new String[numOfCards]; // Array to store the deck

        // Initialize the deck with "rank of suit"
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i)); // Generate random card index
            // Swap the current card with the randomly chosen card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute to all players.");
        }

        String[][] players = new String[x][n]; // Create a 2D array for players and their cards
        int cardIndex = 0;

        // Distribute n cards to each player
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Take user input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute the cards and print the result
        try {
            String[][] players = distributeCards(deck, cardsPerPlayer, numPlayers);
            printPlayersCards(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
