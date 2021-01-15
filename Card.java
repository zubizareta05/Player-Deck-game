package com.playerdeck;

public class Card {

    String[] deck = new String[52];
    String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Card(String[] deck, String[] suit, String[] rank) {
        this.suit = suit;
        this.rank = rank;
        this.deck = deck;
    }

    public String[] getDeck() {
        return deck;
    }

    public void setDeck(String[] deck) {
        this.deck = deck;
    }

    public String[] getSuit() {
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }

    public String[] getRank() {
        return rank;
    }

    public void setRank(String[] rank) {
        this.rank = rank;
    }

    public Card() {

    }
}
