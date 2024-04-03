package org.example.CardShuffling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Card> cards = new ArrayList<>();

    public static void main(String[] args) {
        // 52 cards - 4 suits x 13 cards (2, 3...10, Jack, Queen, King, Ace)
        // the cards must be shuffled

        // 1. Filling the list of cards with 52 cards using 2 loops
        createDeck();

        // 2. Shuffling of the deck. The first card must be swapped with a random one for example 10 times
        for (int i = 0; i < 10; i++) {
            shuffling();
        }

        // 3. Printing the deck
        System.out.println(cards);
    }

    private static void createDeck() {
        for (CardName cardName : CardName.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(cardName, suit);
                cards.add(card);
            }
        }
    }
    private static void shuffling() {
        Card firstCard = cards.get(0);

        Random random = new Random();
        int randomIndex = random.nextInt(cards.size() - 1) + 1;
        Card randomCard = cards.get(randomIndex);

        cards.set(0, randomCard);
        cards.set(randomIndex, firstCard);
    }

}