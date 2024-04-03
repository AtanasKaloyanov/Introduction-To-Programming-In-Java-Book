package org.example.CardShuffling;

public class Card {
    private CardName name;
    private Suit suit;

    public Card(CardName name, Suit suit) {
        this.name = name;
        this.suit = suit;
    }

    public CardName getName() {
        return this.name;
    }

    public void setName(CardName name) {
        this.name = name;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.name + " " + this.suit;
    }
}
